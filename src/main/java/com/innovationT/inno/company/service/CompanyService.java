package com.innovationT.inno.company.service;

import java.util.List;

import com.innovationT.inno.company.vo.CompanyDefaultVO;
import com.innovationT.inno.company.vo.CompanyVO;

public interface CompanyService {
	//삽입
    String insertCompany(CompanyVO vo) throws Exception;
    //수정
    void updateCompany(CompanyVO vo) throws Exception;
    //삭제
    void deleteCompany(CompanyVO vo) throws Exception;
    //개별조회
    CompanyVO selectCompany(CompanyVO vo) throws Exception;
    //전체조회
    List selectCompanyList(CompanyDefaultVO searchVO) throws Exception;
    //개수
//    int selectCompanyListTotCnt(**DefaultVO searchVO);
    
}
