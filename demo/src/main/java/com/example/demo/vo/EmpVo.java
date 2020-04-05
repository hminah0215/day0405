package com.example.demo.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVo {
	private int eno;
	private String ename;
	private String job;
	private int sal;
	private String hiredate;
}
