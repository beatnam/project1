package com.itwillbs.dao;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.itwillbs.domain.MemberDTO;

public class MemberDAO {
	
//	private DataSource dataSource;
//	스프링에서 디비연결 정보를 받아서 sql구문을 실행하는 프로그램 제공
	private SimpleJdbcTemplate jdbcTemplate;
	
	// set 메서드 
	@Inject
	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
		jdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}
	
	//리턴형 없음 insertMember(MemberDTO memberDTO) 메서드 정의
	String sql = "insert into members(id,passwd,name) values(?,?,?)";
	public void insertMember(MemberDTO memberDTO) {	
		System.out.println("MemberDAO insertMember()");
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPasswd());
		System.out.println(memberDTO.getName());
		jdbcTemplate.update(sql, memberDTO.getId(),memberDTO.getPasswd(),memberDTO.getName());
	}//insertMember()
}
