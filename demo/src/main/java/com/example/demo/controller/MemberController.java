package com.example.demo.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.MemberDao;
import com.example.demo.vo.MemberVo;

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
	@RequestMapping("/logout.do")
	public ModelAndView logoutForm(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/main");
		session.removeAttribute("login");
		return mav;
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(String id, String pwd , HttpSession session) {
		ModelAndView mav = new ModelAndView();
		HashMap hm = new HashMap();
		hm.put("id", id); 
		hm.put("pwd", pwd);
		session.setAttribute("login", dao.login(hm));
		mav.setViewName("redirect:/main");
		return mav;
	}
	
	@RequestMapping(value = "/insertMember.do", method = RequestMethod.POST)
	public ModelAndView insert(MemberVo m) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insert(m);
		if(re > 0) {
			mav.setViewName("redirect:/login.do");
		}
		return mav;
	}
	@RequestMapping(value = "/insertMember.do", method = RequestMethod.GET)
	public void insert() {
	
	}
}
