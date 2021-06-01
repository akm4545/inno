package com.innovationT.inno.recruit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innovationT.inno.recruit.service.RecruitService;
import com.innovationT.inno.recruit.vo.RecruitDefaultVO;
import com.innovationT.inno.recruit.vo.RecruitVO;

@Controller
public class RecruitController {

	//**은 기능 혹은 분류가 들어갈 칸
    @Autowired
    private RecruitService RecruitService;
	
    //여러건 조회
    @RequestMapping(value="**")
    public String selectRecruitList(RecruitDefaultVO searchVO, Model model) throws Exception {
    	//페이징 처리 코드 삽입하거나 vo에 삽입
        List<RecruitVO> RecruitList = RecruitService.selectRecruitList(searchVO);
        model.addAttribute("resultList", RecruitList);
        
        return "**List";
    } 
    
    //입력
    @RequestMapping("/**")
    public String addCex(RecruitVO RecruitVO, RecruitDefaultVO searchVO) throws Exception {
    	RecruitService.insertRecruit(RecruitVO);

        return "forward:**";
    }

    //한건조회
    @RequestMapping("/**")
    public RecruitVO selectRecruit(RecruitVO RecruitVO, RecruitDefaultVO searchVO) throws Exception {
        return RecruitService.selectRecruit(RecruitVO);
    }

    //수정
    @RequestMapping("**")
    public String updateRecruit(RecruitVO RecruitVO, RecruitDefaultVO searchVO) throws Exception {
    	RecruitService.updateRecruit(RecruitVO);
        
        return "forward:**";
    }
    
    //삭제
    @RequestMapping("**")
    public String deleteRecruit(RecruitVO RecruitVO, RecruitDefaultVO searchVO) throws Exception {
    	RecruitService.deleteRecruit(RecruitVO);
        
        return "forward:**";
    }

}
