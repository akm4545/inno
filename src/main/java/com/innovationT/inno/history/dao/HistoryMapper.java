package com.innovationT.inno.history.dao;

import java.util.List;

import com.innovationT.inno.history.vo.HistoryDefaultVO;
import com.innovationT.inno.history.vo.HistoryVO;

public interface HistoryMapper {
	
	//등록
    public void insertHistory(HistoryVO vo) throws Exception;

    //수정
    public void updateHistory(HistoryVO vo) throws Exception;

    //삭제
    public void deleteHistory(HistoryVO vo) throws Exception;

    //조회
    public HistoryVO selectHistory(HistoryVO vo) throws Exception;

    //목록조회
    public List<HistoryVO> selectHistoryList(HistoryDefaultVO searchVO) throws Exception;

    //개수조회
//    public int select**ListTotCnt(**DefaultVO searchVO);

}
