package com.tm.spring_2.member;

public class MemberService {

	private MemberDAO memberDAO;
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	

	
	public int memberInsert(MemberVO memberDTO) throws Exception {
		return memberDAO.memberInsert(memberDTO);
	}
	
	public MemberVO memberLogin(MemberVO memberDTO) throws Exception{
		return memberDAO.memeberLogin(memberDTO);
	}
	
	public int memberDelete(String id) throws Exception{
		return memberDAO.memberDelete(id);
	}
	
	public int memberUpdate(MemberVO memberDTO) throws Exception{
		return memberDAO.memberUpdate(memberDTO);
	}
}
