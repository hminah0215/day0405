package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.EmpManager;
import com.example.demo.vo.EmpVo;

@Repository
public class EmpDao {
	public List<EmpVo> listEmp(){
		return EmpManager.listEmp();
	}
	
	public EmpVo detailEmp(int eno) {
		return EmpManager.detailEmp(eno);
	}
	
	public int insertEmp(EmpVo ev) {
		return EmpManager.insertEmp(ev);
	}
	
	public int deleteEmp(int eno) {
		return EmpManager.deleteEmp(eno);
	}
	
	public int updateEmp(EmpVo ev) {
		return EmpManager.updateEmp(ev);
	}
}
