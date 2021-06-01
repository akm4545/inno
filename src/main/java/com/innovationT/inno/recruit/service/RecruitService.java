package com.innovationT.inno.recruit.service;

import java.util.List;

import com.innovationT.inno.recruit.vo.RecruitDefaultVO;
import com.innovationT.inno.recruit.vo.RecruitVO;

public interface RecruitService {
	//삽입
    String insertRecruit(RecruitVO vo) throws Exception;
    //수정
    void updateRecruit(RecruitVO vo) throws Exception;
    //삭제
    void deleteRecruit(RecruitVO vo) throws Exception;
    //개별조회
    RecruitVO selectRecruit(RecruitVO vo) throws Exception;
    //전체조회
    List selectRecruitList(RecruitDefaultVO searchVO) throws Exception;
    //개수
//    int select**ListTotCnt(**DefaultVO searchVO);
    
}
