package com.innovationT.inno.inquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innovationT.inno.inquiry.service.InquiryService;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

@Controller
public class InquiryController {
	
	@Autowired
	private InquiryService inquiryService;
	
	// 여러건 조회
	@RequestMapping("")
	public String selectInquiryList(InquiryDefaultVO searchVO, ModelMap model) throws Exception {
		List<E> inquiryList = inquiryService.selectInquiryList(searchVO);
		model.addAttribute("resultList", inquiryList);
		return inquiryList;
	}
	
	// 입력
	@RequestMapping("")
	public String insertInquiry(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception {
		inquiryService.insertInquiry(inquiryVO);
		return "forward:";
	}
	
	// 한건 조회
	@RequestMapping("")
	public InquiryVO selectInquiry(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception {
		return (InquiryVO)inquiryService.selectInquiry(inquiryVO);
	}
	
	// 수정
	@RequestMapping("")
	public String updateInquiry(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception {
		inquiryService.updateInquiry(inquiryVO);
		return "forward:";
	}
	
	// 삭제
	@RequestMapping("")
	public String deleteInquiry(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception {
		inquiryService.deleteInquiry(inquiryVO);
		return "forward:";
	}
}
