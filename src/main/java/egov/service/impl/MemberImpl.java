package egov.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egov.service1.MemberService;
import egov.service1.MemberVO;

@Service("memberService")
public class MemberImpl implements MemberService{
	@Resource(name = "memberDAO")
	MemberDAO memberDAO;
	//회원가입 처리
	@Override //다형성 (오버라이딩,오버로딩)
	public String insertMember(MemberVO vo) throws Exception {
		return  memberDAO.insertMember(vo);
	}
	// 아이디 중복체크 파라미터 값 가져오기
	@Override
	public int popidck(String userid) throws Exception {
		return memberDAO.popidck(userid);
	}
	//아아디 중복체크
	@Override
	public int selectMemberIdCheck(String userid) throws Exception {
		return memberDAO.selectMemberIdCheck(userid);
	}
	
	//로그인 처리
	@Override
	public int selectMemberCount(MemberVO vo) throws Exception {
		return memberDAO.selectMemberCount(vo);
	}
	//비밀번호 찾기
	@Override
	public MemberVO Pop_memberpassfind(String email) throws Exception {
		return memberDAO.Pop_memberpassfind(email);
	}
	//아이디 찾기
	@Override
	public MemberVO Pop_useridfd(MemberVO vo) throws Exception {
		return memberDAO.Pop_useridfd(vo);
	}
	//비밀번호 찾기 화면(비밀번호 변경)
	@Override
	public int Pop_newuserpw(MemberVO vo) throws Exception {
		return memberDAO.Pop_newuserpw(vo);
	}
	
	
	
	
	
	

	

	

	
}
