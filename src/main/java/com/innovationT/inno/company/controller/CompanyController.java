package com.innovationT.inno.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innovationT.inno.company.service.CompanyService;
import com.innovationT.inno.company.vo.CompanyDefaultVO;
import com.innovationT.inno.company.vo.CompanyVO;

@Controller
public class CompanyController {

	//**은 기능 혹은 분류가 들어갈 칸
    @Autowired
    private CompanyService CompanyService;
	
    //여러건 조회
    @RequestMapping(value="/list")
    public String selectCompanyList(CompanyDefaultVO searchVO, Model model) throws Exception {
    	//페이징 처리 코드 삽입하거나 vo에 삽입
        List<CompanyVO> CompanyList = CompanyService.selectCompanyList(searchVO);
        model.addAttribute("resultList", CompanyList);
        
        return "list";
    } 
    
    //입력
    @RequestMapping("/insert")
    public String insertCompany(CompanyVO comVO, CompanyDefaultVO searchVO) throws Exception {
    	CompanyService.insertCompany(comVO);

        return "forward:**";
    }

    //한건조회
    @RequestMapping("/seleclist")
    public CompanyVO selectCompany(CompanyVO comVO, CompanyDefaultVO searchVO) throws Exception {
        return CompanyService.selectCompany(comVO);
    }

    //수정
    @RequestMapping("/update")
    public String updateCompany(CompanyVO comVO, CompanyDefaultVO searchVO) throws Exception {
    	CompanyService.updateCompany(comVO);
        
        return "forward:**";
    }
    
    //삭제
    @RequestMapping("/delete")
    public String deleteCompany(CompanyVO comVO, CompanyDefaultVO searchVO) throws Exception {
    	CompanyService.deleteCompany(comVO);
        
        return "forward:**";
    }

}
