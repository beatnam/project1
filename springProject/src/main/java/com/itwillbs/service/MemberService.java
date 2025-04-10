package com.itwillbs.service;

import javax.inject.Inject;

import com.itwillbs.dao.MemberDAO;
import com.itwillbs.domain.MemberDTO;

public class MemberService {
	
//	// MemberDAO 객체생성
//	MemberDAO memberDAO = new MemberDAO();
	private MemberDAO memberDAO;
	
//	2) set메서드 호출 전달
	@Inject
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	// 리턴할형 없음 insertMember(MemberDTO memberDTO ) 메서드 정의
	public void insertMember(MemberDTO memberDTO) {	
		System.out.println("MemberService insertMember()");
		
		//회원가입처리
		// 패키지 com.itwillbs.dao 파일이름 MemberDAO
		// 리턴할형 없음 insertMember(MemberDTO memberDTO ) 메서드 정의
		
		// MemberDAO 객체생성
		// insertMember(memberDTO 주소값)메서드 호출
		memberDAO.insertMember(memberDTO);
		
	}//insertMember()
	
	
}//클래스
