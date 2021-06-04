package com.innovationT.inno.inquiry.service;

//import java.util.HashMap;
import java.util.List;

//import org.apache.ibatis.annotations.Param;

import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryService {

//	void insertInquiry(@Param("inquiryMap") HashMap<String, Inquiry> map) throws Exception;
	
	InquiryVO insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
	void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception;
	
	void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception;
	
	void updateInquiry(InquiryTemplateVO inquiryTemplateVO) throws Exception;
	
	void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception;
	
	List<InquiryTemplateVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception;
	
	int selectInquiryListTotCnt() throws Exception;
}
