package com.itwillbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberDTO;
import com.itwillbs.service.MemberService;

@Controller
public class MemberController {
	// 객체생성관계 => 의존관계
	//MemberController가 MemberService 필요(의존)로 한다.
	
//	// MemberService 객체생성
//	MemberService memberService = new MemberService();
	private MemberService memberService;
	
	// 스프링 외부에서 MemberService객체를 생성해서 MemberController 생성자, set을 통해서
	// 객체 생성한 memberService 주소값을 전달
	// 1) 생성자 호출
//	@Inject
//	public MemberController(MemberService memberService) {
//		this.memberService = memberService;
//	}
	// 2) set메서드 호출
	@Inject
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 가상주소 http://localhost:8000/myweb/member/insert
	@RequestMapping (value= "/member/insert", method=RequestMethod.GET)
	public String insert() {
//		logger.info("HomeController insert()");
		// 실제페이지 member/insert.jsp 연결
		// /WEB-INF/views/member/insert.jsp
		return "member/insert";
	}
	
	@RequestMapping (value= "/member/insertPro", method=RequestMethod.POST)
	public String insertPro(MemberDTO memberDTO) {
//		logger.info("MemberController insertPro()");
		// request값을 MemberDTO저장
//		HttpServletRequest request
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId(request.getParameter("id"));
//		memberDTO.setId(request.getParameter("passwd"));
//		memberDTO.setId(request.getParameter("name"));
		
		// 자동으로 되어지는 약속
		// 태그이름(파라미터이름) name="id", name="passwd", name="name"
		// MemberDTO의 멤버변수이름 String id;, String passwd;, String name;
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPasswd());
		System.out.println(memberDTO.getName());
		
		//회원가입처리
		// 패키지 com.itwillbs.service 파일이름 MemberService
		// 리턴할형 없음 insertMember(MemberDTO memberDTO ) 메서드 정의
		
		// insertMember(memberDTO 주소값)메서드 호출
		memberService.insertMember(memberDTO);
		
		
//		가상주소 /member/login 주소변경하면서 이동
//		response.sendRedirect("");
		return "redirect:/member/login";
	}
	
	// 가상주소 http://localhost:8000/myweb/member/login
	// 실제페이지 member/login.jsp 주소변경 없이 이동
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login() {
//		logger.info("HomeController login()");
		// 실제페이지 member/login.jsp 연결
		// /WEB-INF/views/member/login.jsp
		return "member/login";
	}
	
	// 가상주소 http://localhost:8000/myweb/member/loginPro
	// => /member/main 주소변경하면서 이동
	@RequestMapping(value="/member/loginPro", method=RequestMethod.POST)
	public String loginPro(MemberDTO memberDTO) {
//		logger.info("HomeController loginPro()");
		// request id, pass => MemberDTO 저장
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPasswd());
		
		//로그인 처리
		
//		가상주소 /member/main 주소변경하면서 이동
//		response.sendRedirect("");
		return "redirect:/member/main";
	}
	
	// 가상주소 http://localhost:8000/myweb/member/main
	// 실제 페이지 member/main.jsp 주소변경 없이 이동
	@RequestMapping(value="/member/main", method=RequestMethod.GET)
	public String main() {
//		logger.info("HomeController main()");
		// 실제페이지 member/main.jsp 연결
		// /WEB-INF/views/member/main.jsp
		return "member/main";
	}
	
	
	
	
	
}//클래스
