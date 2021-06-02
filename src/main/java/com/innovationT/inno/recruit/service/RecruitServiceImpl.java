package com.innovationT.inno.recruit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.recruit.dao.RecruitMapper;
import com.innovationT.inno.recruit.vo.RecruitDefaultVO;
import com.innovationT.inno.recruit.vo.RecruitVO;

@Service("RecruitService")
public class RecruitServiceImpl implements RecruitService {
       
    @Autowired
    private RecruitMapper reDAO;
    
    //삽입
    public String insertRecruit(RecruitVO vo) throws Exception {
    	reDAO.insertRecruit(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    //수정
    public void updateRecruit(RecruitVO vo) throws Exception {
        reDAO.updateRecruit(vo);
    }
    
    //삭제
    public void deleteRecruit(RecruitVO vo) throws Exception {
        reDAO.deleteRecruit(vo);
    }

    //조회
    public RecruitVO selectRecruit(RecruitVO vo) throws Exception {
    	RecruitVO resultVO = reDAO.selectRecruit(vo);
        
        return resultVO;
    }

    //목록조회
    public List<RecruitVO> selectRecruitList(RecruitDefaultVO searchVO) throws Exception {
        return reDAO.selectRecruitList(searchVO);
    }

//    //페이징 처리용 개수
//    public int select**ListTotCnt(**DefaultVO searchVO) {
//		return **DAO.select**ListTotCnt(searchVO);
//	}
    
}
