package com.mapboard.member.dao;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.mapboard.member.vo.MemberVO;

/*클래스 목적: MemberDao와 관련된 함수를 정의하는 인터페이스
 * 				DB와 커넥션을 수행한 후 memberSql.xml의 쿼리를 실행하도록 한다. 
 * 작성자:
 * 작성일:2018-12-07
 * 최종수정일: 2018-12-13
 * 이력
 * 12/07: 최초 작성
 * 12/12: 1,2,3 함수 추가
 * 12/15: 4 함수 추가
 * 12/16: 5,6 함수 추가
 * 12/17: 7,8,9 함수 추가
 * 12/18: 10,11 함수 추가
 * 12/19: 12,13,14 함수 추가
 */

public interface MemberDao{
	//1. 회원 로그인 체크
	public  boolean loginProc(MemberVO vo);
	//2. 회원 로그인 정보
	public MemberVO viewMember(MemberVO vo);
	//3. 회원 로그아웃
	public void logout(HttpSession session);
	//4. 아이디 중복체크
	public int selectID(String userid) throws Exception;
	//5. 회원가입 처리
	public void insertMember(MemberVO vo);
	//6. 사용자 이름 가져오기
	public MemberVO selectMemberbyId(String userid);
	//7. 게시글 총 개수 구하기
	public int getTotalCount();
	//8. 회원 목록 구하기
	public ArrayList<?> getMemberList(MemberVO vo);
	//9. 본인확인
	public int selectMeChk(MemberVO vo);
	//10. 회원탈퇴
	public int leaveMemberProc(MemberVO vo);
	//11. 나의 정보 수정
	public void memberUpdate(MemberVO vo);
	//12. 회원 정보 수정(관리자)
	public void memberUpdateAmin(MemberVO vo);
	//13. 회원 검색 실행
	public ArrayList<?> memberSearchbyWord(MemberVO vo);
	//14. 회원 검색 결과 총개수 구하기
	public int memberSearchCnt(MemberVO vo);
	
	
	
}