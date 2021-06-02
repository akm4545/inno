package com.innovationT.inno.history.service;

import java.util.List;

import com.innovationT.inno.history.vo.HistoryDefaultVO;
import com.innovationT.inno.history.vo.HistoryVO;

public interface HistoryService {
	//삽입
    String insertHistory(HistoryVO vo) throws Exception;
    //수정
    void updateHistory(HistoryVO vo) throws Exception;
    //삭제
    void deleteHistory(HistoryVO vo) throws Exception;
    //개별조회
    HistoryVO selectHistory(HistoryVO vo) throws Exception;
    //전체조회
    List selectHistoryList(HistoryDefaultVO searchVO) throws Exception;
    //개수
//    int select**ListTotCnt(**DefaultVO searchVO);
    
}
