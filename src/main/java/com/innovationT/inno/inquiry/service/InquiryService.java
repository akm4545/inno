package com.innovationT.inno.inquiry.service;

//import java.util.HashMap;
import java.util.List;

//import org.apache.ibatis.annotations.Param;

import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryFileVO;
import com.innovationT.inno.inquiry.vo.InquiryReservationVO;
import com.innovationT.inno.inquiry.vo.InquirySiteVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryTypeLinkVO;
import com.innovationT.inno.inquiry.vo.InquiryUserInfoVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryService {

//	void insertInquiry(@Param("inquiryMap") HashMap<String, Inquiry> map) throws Exception;
	
//	void insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
//	void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception;
	
//	void insertInquiry(Inquiry inquiry) throws Exception;
	
	void insertInquiry(InquiryVO inquiryVO) throws Exception;
	
	void insertInquiry(InquiryFileVO inquiryFileVO) throws Exception;
	
	void insertInquiry(InquiryReservationVO inquiryReservationVO) throws Exception;
	
	void insertInquiry(InquirySiteVO inquirySiteVO) throws Exception;
	
	void insertInquiry(InquiryTypeLinkVO inquiryTypeLinkVO) throws Exception;
	
	void insertInquiry(InquiryUserInfoVO inquiryUserInfoVO) throws Exception;
	
	void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception;
	
	void updateInquiry(InquiryTemplateVO inquiryTemplateVO) throws Exception;
	
	void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception;
	
	List<InquiryTemplateVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception;
	
	int selectInquiryListTotCnt(InquiryDefaultVO searchVO) throws Exception;
	
	void deleteAndinsertList(List<? extends Inquiry> inquiryList) throws Exception;
	
	void updateToCheck(int inquiryIdx) throws Exception;
}
