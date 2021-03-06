package com.mapboard.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.mapboard.board.vo.BoardVO;
import com.mapboard.board.vo.FileinfoVO;
import com.mapboard.util.PageUtil;


public interface BoardService {

	// 예시입니다 이곳에다 Service 함수를 정의하고 각 클래스에 구현해주셔요
	// void 말고 String, VO클래스 등을 사용가능하고 
	// 매개변수
	//	Board
	
	public BoardVO getSelectName(int place_no)throws Exception;
	
	public void insertBoard(BoardVO vo, HttpSession session, ArrayList list) throws Exception;
	
	public BoardVO getBoardDetail(int bidx) throws Exception;
	
	//첨부파일 검색(상세보기)
	public ArrayList getFileDetail(int bidx) throws Exception; 
	
	//다운로드 파일 정보 검색 질의 실행 함수
	public BoardVO getDownload(int fidx) throws Exception; 
	
	//게시판 수정
	public void updateBoard(BoardVO vo) throws Exception;
	
	//첨부 파일의 정보 삭제
	public void deleteFileInfo(int bidx) throws Exception;
	
	//첨부파일 재등록하는 함수
	public void insertFileInfo(BoardVO vo) throws Exception;

	//게시물 삭제처리함수
	public int deleteBoard(BoardVO vo) throws Exception;
	
	//조회수 증가처리함수
	public void updateHit(int bidx, HttpSession session) throws Exception;
	
	//추천수 증가처리함수
	public void updateLikeCnt(int bidx, HttpSession session) throws Exception;
	
}