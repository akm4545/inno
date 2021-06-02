package com.innovationT.inno.recruit.dao;

import java.util.List;

import com.innovationT.inno.recruit.vo.RecruitDefaultVO;
import com.innovationT.inno.recruit.vo.RecruitVO;

public interface RecruitMapper {
	
	//등록
    public void insertRecruit(RecruitVO vo) throws Exception;

    //수정
    public void updateRecruit(RecruitVO vo) throws Exception;

    //삭제
    public void deleteRecruit(RecruitVO vo) throws Exception;

    //조회
    public RecruitVO selectRecruit(RecruitVO vo) throws Exception;

    //목록조회
    public List<RecruitVO> selectRecruitList(RecruitDefaultVO searchVO) throws Exception;

    //개수조회
//    public int select**ListTotCnt(**DefaultVO searchVO);

}
