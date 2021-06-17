package com.innovationT.inno.inquiry.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.innovationT.inno.inquiry.service.InquiryService;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryFileVO;
import com.innovationT.inno.inquiry.vo.InquiryReservationVO;
import com.innovationT.inno.inquiry.vo.InquirySiteVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryTypeLinkVO;
import com.innovationT.inno.inquiry.vo.InquiryUserInfoVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

@Controller
public class InquiryController {
	
	@Autowired
	private InquiryService inquiryService;
	
	/* 관리자 영역 */
	
	// 관리자가 여러건 조회
	@RequestMapping(value = "admin/inquiry/list", method = RequestMethod.GET)
	public String selectInquiryListAsAdmin(InquiryDefaultVO searchVO, ModelMap model) throws Exception {
		List<InquiryTemplateVO> inquiryList = Collections.emptyList();
		
		int totCnt = inquiryService.selectInquiryListTotCnt(searchVO);
		
		if (totCnt > 0) {
			inquiryList = inquiryService.selectInquiryList(searchVO);
		}
		
		model.addAttribute("inquiryList", inquiryList);
		return "inquiryList";
	}
	
	// 한건 조회
	@RequestMapping(value = "admin/inquiry/view", method = RequestMethod.GET)
	public InquiryTemplateVO selectInquiryAsAdmin(InquiryVO inquiryVO) throws Exception {
		return inquiryService.selectInquiry(inquiryVO);
	}
	
	// 수정
	@RequestMapping(value = "admin/inquiry/update", method = RequestMethod.POST)
	public String updateInquiryAsAdmin(InquiryTemplateVO inquiryTemplateVO, InquiryDefaultVO searchVO) throws Exception {
		inquiryService.updateInquiry(inquiryTemplateVO);
		return "redirect:/admin/inquiry/list";
	}
	
	@RequestMapping(value = "admin/inquiry/checked", method = RequestMethod.POST)
	public String updateToCheckInquiryAsAdmin(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception{
		inquiryService.updateToCheck(inquiryVO.getInquiryIdx());
		return "redirect:/admin/inquiry/list";
	}
	
	// 삭제
	@RequestMapping(value = "admin/inquiry/delete", method = RequestMethod.POST)
	public String deleteInquiryAsAdmin(InquiryVO inquiryVO, InquiryDefaultVO searchVO) throws Exception {
		inquiryService.deleteInquiry(inquiryVO);
		return "redirect:/admin/inquiry/list";
	}
	
	/* 관리자 영역 끝 */
	
	/* 사용자 영역 */
	
	// 입력
	@RequestMapping(value = "/inquiry/insert", method = RequestMethod.POST)
	public String insertInquiry(InquiryVO inquiryVO, List<InquiryFileVO> inquiryFileVOList, InquiryReservationVO inquiryReservationVO
								, List<InquirySiteVO> inquirySiteVOList, List<InquiryTypeLinkVO> inquiryTypeLinkVOList
								, InquiryUserInfoVO inquiryUserInfoVO) throws Exception {
		
//		HashMap<String, Inquiry> map = new HashMap<String, Inquiry>();
//		map.put("inquiryVO", inquiryVO);
//		map.put("inquiryFileVO", inquiryFileVO);
//		map.put("inquiryReservationVO", inquiryReservationVO);
//		map.put("inquirySiteVO", inquirySiteVO);
//		map.put("inquiryTypeLinkVO", inquiryTypeLinkVO);
//		map.put("inquiryUserInfoVO", inquiryUserInfoVO);
//		inquiryService.insertInquiry(map);
		
		// 트랜잭션 처리 필요
		inquiryService.insertInquiry(inquiryVO);
		int inquiryIdx = inquiryVO.getInquiryIdx();
		
		if (inquiryFileVOList.size() > 0) {
			inquiryService.insertInquiryList(inquiryIdx, inquiryFileVOList);
		}
		
		inquiryReservationVO.setInquiryIdx(inquiryIdx);
		inquiryService.insertInquiry(inquiryReservationVO);
		
		if (inquirySiteVOList.size() > 0) {
			inquiryService.insertInquiryList(inquiryIdx, inquirySiteVOList);
		}
		
		inquiryService.insertInquiryList(inquiryIdx, inquiryTypeLinkVOList);
		
		inquiryUserInfoVO.setInquiryIdx(inquiryIdx);
		inquiryService.insertInquiry(inquiryUserInfoVO);
		
		return "redirect:/inquiry/list";
	}
	
	// 한건 조회
	@RequestMapping(value = "inquiry/view", method = RequestMethod.GET)
	public InquiryTemplateVO selectInquiry(InquiryVO inquiryVO) throws Exception {
		return inquiryService.selectInquiry(inquiryVO);
	}
	
	// 수정
	@RequestMapping(value = "inquiry/update", method = RequestMethod.POST)
	public String updateInquiry(InquiryTemplateVO inquiryTemplateVO) throws Exception {
		inquiryService.updateInquiry(inquiryTemplateVO);
		return "redirect:/inquiry/list";
	}
}
