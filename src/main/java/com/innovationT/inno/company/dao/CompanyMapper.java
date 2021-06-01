package com.innovationT.inno.company.dao;

import java.util.List;

import com.innovationT.inno.company.vo.CompanyDefaultVO;
import com.innovationT.inno.company.vo.CompanyVO;

public interface CompanyMapper {
	
	//등록
    public void insertCompany(CompanyVO vo) throws Exception;

    //수정
    public void updateCompany(CompanyVO vo) throws Exception;

    //삭제
    public void deleteCompany(CompanyVO vo) throws Exception;

    //조회
    public CompanyVO selectCompany(CompanyVO vo) throws Exception;

    //목록조회
    public List<CompanyVO> selectCompanyList(CompanyDefaultVO searchVO) throws Exception;

    //개수조회
//    public int select**ListTotCnt(**DefaultVO searchVO);

}
