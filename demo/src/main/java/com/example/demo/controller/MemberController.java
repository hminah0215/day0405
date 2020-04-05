package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.MemberDao;

@Controller
public class MemberController {
	@Autowired 
	private MemberDao dao;

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/login.do",method = RequestMethod.GET)
	public void loginForm() {
		
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(String id, String pwd) {
		ModelAndView mav = new ModelAndView();
		HashMap hm = new HashMap();
		hm.put("id", id); 
		hm.put("pwd", pwd);
		dao.login(hm);
		return mav;
	}
}
