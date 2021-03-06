package com.mapboard.place.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.mapboard.place.vo.PlaceVO;
import com.mapboard.util.PageUtil;

public interface PlaceService {

	public ArrayList<PlaceVO> getPlaceService(PlaceVO vo);

	public PageUtil getPageInfo(PlaceVO vo,int nowPage,int situation,String searchType);
	
	public ArrayList getPlaceList(PlaceVO vo, int situation, PageUtil pInfo);
	
	public ArrayList getBoardList(PlaceVO vo, int situation,PageUtil pInfo);

	public int getPlaceListCnt(PlaceVO vo, int situation);
	
	public int getBoardListCnt(PlaceVO vo, int situation);

	public ArrayList getTotalPlaceList(PlaceVO vo, int situation);
	
	public int insertNewPlace(PlaceVO vo);
	
	public void myPlaceUpdate(PlaceVO vo);
	
	public int selectPlaceNo(PlaceVO vo);
	
	public PageUtil getPageInfo_Admin(int nowPage, String type);
	
	public ArrayList getPlaceList_Admin(PlaceVO vo, String type, PageUtil pInfo);

	public void changeStatus(PlaceVO vo);

	public float getTotalMove(PlaceVO vo);

	public int getTotalMoveCnt(PlaceVO vo);

	public HashMap getMonthMove(PlaceVO vo);

	public HashMap getMonthMoveCnt(PlaceVO vo);

	public PlaceVO getLocation(PlaceVO vo);

	public PageUtil getPageInfo_Member(PlaceVO vo, int nowPage);

	public ArrayList getMemberBoardList(PlaceVO vo, PageUtil pInfo);

	//게시판 목록보기를 위한 명령들
	public PageUtil getPageInfo_board(PlaceVO vo, int nowPage);

	public ArrayList getBoardList(PlaceVO vo, PageUtil pInfo_board);

	public PageUtil getPageInfo_boardSearch(PlaceVO vo, int nowPage, int situation);

	public ArrayList getBoardSearchList(PlaceVO vo, int situation, PageUtil pInfo_boardSearch);

	//리뷰
	public String getReview(PlaceVO vo);

	//내가 남긴 모든 리뷰의 위치정보 가져오기
	public ArrayList getBoardListTotal(PlaceVO vo);	
}
