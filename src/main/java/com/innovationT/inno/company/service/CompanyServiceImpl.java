package com.innovationT.inno.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.company.dao.CompanyMapper;
import com.innovationT.inno.company.vo.CompanyDefaultVO;
import com.innovationT.inno.company.vo.CompanyVO;

@Service("CompanyService")
public class CompanyServiceImpl implements CompanyService {
       
    @Autowired
    private CompanyMapper comDAO;
    
    //삽입
    public String insertCompany(CompanyVO vo) throws Exception {
    	comDAO.insertCompany(vo);
    	//TODO 해당 테이블 정보에 맞게 수정    	
        return null;
    }

    //수정
    public void updateCompany(CompanyVO vo) throws Exception {
        comDAO.updateCompany(vo);
    }
    
    //삭제
    public void deleteCompany(CompanyVO vo) throws Exception {
        comDAO.deleteCompany(vo);
    }

    //조회
    public CompanyVO selectCompany(CompanyVO vo) throws Exception {
        CompanyVO resultVO = comDAO.selectCompany(vo);
        
        return resultVO;
    }

    //목록조회
    public List<CompanyVO> selectCompanyList(CompanyDefaultVO searchVO) throws Exception {
        return comDAO.selectCompanyList(searchVO);
    }

    //페이징 처리용 개수
//    public int selectCompanyListTotCnt(CompanyDefaultVO searchVO) {
//		return comDAO.selectCompanyListTotCnt(searchVO);
//	}
    
}
