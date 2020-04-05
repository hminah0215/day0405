package com.example.demo.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.demo.db.MemberManager;
import com.example.demo.vo.MemberVo;

@Repository
public class MemberDao {

		public MemberVo login(HashMap map) {
			return MemberManager.login(map);
		}
		public int insert(MemberVo m) {
			return MemberManager.insert(m);
		}
}
