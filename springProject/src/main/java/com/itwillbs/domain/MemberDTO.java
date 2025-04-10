package com.itwillbs.domain;

// 회원 관련 데이터를 저장해서 전달
public class MemberDTO {
//	멤버변수() : 외부에 접근 못하게 막아줌(데이터 은닉, 접근피해자  private)
	private String id;  
	private String passwd;
	private String name; 
//	생성자()	
	//	메서드() : 외부에서 멤버변수를 접근 할 수 있게 setter, getter 메서드 정의
	// alt shft s => r
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id =id;
	}	

	public String getPasswd() {
		return passwd;
	}
		
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	
	
	
}
