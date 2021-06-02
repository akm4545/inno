package com.innovationT.inno.inquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.inquiry.dao.InquiryMapper;
import com.innovationT.inno.inquiry.vo.InquiryVO;

@Service("inquiryService")
public class InquiryServiceImpl {

	@Autowired
	private InquiryMapper inquiryDAO;
	
	public String insertInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.insertInquiry(inquiryVO);
		return null;
	}
	
	public void updateInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.updateInquiry(inquiryVO);
	}
	
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.deleteInquiry(inquiryVO);
	}
	
	public InquiryVO selectInquiry(InquiryVO inquiryVO) throws Exception {
		InquiryVO resultVO = inquiryDAO.selectInquiry(inquiryVO);
		return resultVO;
	}
	
	public List<InquiryVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectInquiryList(searchVO);
	}
	
	public int selectInquiryListToCnt(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectInquiryListToCnt(searchVO);
	}
}
