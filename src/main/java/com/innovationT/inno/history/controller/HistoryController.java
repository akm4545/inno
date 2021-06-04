package com.innovationT.inno.history.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innovationT.inno.history.service.HistoryService;
import com.innovationT.inno.history.vo.HistoryDefaultVO;
import com.innovationT.inno.history.vo.HistoryVO;

@Controller
public class HistoryController {

	//**은 기능 혹은 분류가 들어갈 칸
    @Autowired
    private HistoryService hisService;
	
    //여러건 조회
    @RequestMapping(value="**")
    public String selectHistoryList(HistoryDefaultVO searchVO, Model model) throws Exception {
    	//페이징 처리 코드 삽입하거나 vo에 삽입
        List<HistoryVO> HistoryList = hisService.selectHistoryList(searchVO);
        model.addAttribute("resultList", HistoryList);
        
        return "**List";
    } 
    
    //입력
    @RequestMapping("**")
    public String insertHistory(HistoryVO hisVO, HistoryDefaultVO searchVO) throws Exception {
        hisService.insertHistory(hisVO);

        return "forward:**";
    }

    //한건조회
    @RequestMapping("/**")
    public HistoryVO selectHistory(HistoryVO hisVO, HistoryDefaultVO searchVO) throws Exception {
        return hisService.selectHistory(hisVO);
    }

    //수정
    @RequestMapping("**")
    public String updateHistory(HistoryVO hisVO, HistoryDefaultVO searchVO) throws Exception {
    	hisService.updateHistory(hisVO);
        
        return "forward:**";
    }
    
    //삭제
    @RequestMapping("**")
    public String deleteHistory(HistoryVO hisVO, HistoryDefaultVO searchVO) throws Exception {
        hisService.deleteHistory(hisVO);
        
        return "forward:**";
    }

}
