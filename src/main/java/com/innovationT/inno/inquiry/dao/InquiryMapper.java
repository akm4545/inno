package com.innovationT.inno.inquiry.dao;

import java.util.List;

import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryMapper {

	public void insertInquiry(InquiryVO inquiryVO) throws Exception;
	
	public void updateInquiry(InquiryVO inquiryVO) throws Exception;
	
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	public InquiryVO selectInquiry(InquiryVO inquiryVO) throws Exception;
	
	public List<InquiryVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception;
	
	public int selectInquiryListToCnt(InquiryDefaultVO searchVO) throws Exception;
}
