package com.innovationT.inno.history.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.history.dao.HistoryMapper;
import com.innovationT.inno.history.vo.HistoryDefaultVO;
import com.innovationT.inno.history.vo.HistoryVO;

@Service("HistoryService")
public class HistoryServiceImpl implements HistoryService {
       
    @Autowired
    private HistoryMapper hisDAO;
    
    //삽입
    public String insertHistory(HistoryVO vo) throws Exception {
    	hisDAO.insertHistory(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    //수정
    public void updateHistory(HistoryVO vo) throws Exception {
        hisDAO.updateHistory(vo);
    }
    
    //삭제
    public void deleteHistory(HistoryVO vo) throws Exception {
        hisDAO.deleteHistory(vo);
    }

    //조회
    public HistoryVO selectHistory(HistoryVO vo) throws Exception {
    	HistoryVO resultVO = hisDAO.selectHistory(vo);
        
        return resultVO;
    }

    //목록조회
    public List<HistoryVO> selectHistoryList(HistoryDefaultVO searchVO) throws Exception {
        return hisDAO.selectHistoryList(searchVO);
    }

    //페이징 처리용 개수
//    public int select**ListTotCnt(**DefaultVO searchVO) {
//		return **DAO.select**ListTotCnt(searchVO);
//	}
    
}
