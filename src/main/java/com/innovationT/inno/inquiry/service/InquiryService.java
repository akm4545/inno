package com.innovationT.inno.inquiry.service;

import java.util.List;

import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryService {

	void insertInquiry(Inquiry inquiry) throws Exception;
	
	void updateInquiry(Inquiry inquiry) throws Exception;
	
	void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	Inquiry selectInquiry(Inquiry inquiry) throws Exception;
	
	List<InquiryVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception;
	
	int selectInquiryListToCnt(InquiryDefaultVO searchVO) throws Exception;
}
