package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.EmpDao;
import com.example.demo.vo.EmpVo;

@Controller
public class EmpController {
	
	@Autowired
	private EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listEmp.do")
	public ModelAndView listEmp(){
		ModelAndView mav = new ModelAndView();
		List<EmpVo> list = dao.listEmp();
		mav.addObject("e",list);
		return mav;
	}
	
	
	@RequestMapping(value="/insertEmp.do", method = RequestMethod.GET)
	public void insertForm() {}
	
	@RequestMapping(value="/insertEmp.do", method = RequestMethod.POST)
	public ModelAndView insertEmp(EmpVo ev) {
		ModelAndView mav = new ModelAndView();
		int re = dao.insertEmp(ev);
		if(re>0) {
			mav.setViewName("redirect:/listEmp.do");
		}
		return mav;
	}
	
	@RequestMapping("/detailEmp.do")
	public ModelAndView detailEmp(int eno) {
		ModelAndView mav = new ModelAndView();
		EmpVo ev = dao.detailEmp(eno);
		mav.addObject("e", ev);
		return mav;
	}
	
	@RequestMapping(value="/updateEmp.do", method = RequestMethod.GET)
	public ModelAndView updateForm(int eno) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("up",dao.detailEmp(eno));
		return mav;
	}
	
	@RequestMapping(value= "/updateEmp.do", method = RequestMethod.POST)
	public ModelAndView updateEmp(EmpVo ev) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateEmp(ev);
		return mav;
	}
	
	@RequestMapping("/deleteEmp.do")
	public ModelAndView deleteEmp(int eno) {
		ModelAndView mav = new ModelAndView();
		int re = dao.deleteEmp(eno);
		mav.setViewName("redirect:/listEmp.do");
		return mav;
	}
}
