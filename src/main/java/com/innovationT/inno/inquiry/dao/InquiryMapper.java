package com.innovationT.inno.inquiry.dao;

//import java.util.HashMap;
import java.util.List;

import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryFileVO;
import com.innovationT.inno.inquiry.vo.InquiryReservationVO;
import com.innovationT.inno.inquiry.vo.InquirySiteVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryTypeLinkVO;
import com.innovationT.inno.inquiry.vo.InquiryUserInfoVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryMapper {

//	public void insertInquiry(HashMap<String, Inquiry> map) throws Exception;
	
	public InquiryVO insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
	public void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception;
	
	public void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception;
	
	public void updateInquiry(Inquiry inquiry) throws Exception;
	
//	public void updateInquiryList(List<? extends Inquiry> inquiryList) throws Exception;
	
	public List<Integer> selectIdxList(List<? extends Inquiry> inquiryList) throws Exception;
	
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	public void deleteInquiryList(Inquiry inquiry) throws Exception;
	
//	public InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception;
	
	public InquiryVO selectInquiry(Inquiry inquiry) throws Exception;
	
	public InquiryUserInfoVO selectInquiryUserInfo(Inquiry inquiry) throws Exception;
	
	public InquiryReservationVO selectInquiryReservation(Inquiry inquiry) throws Exception;
	
	public List<InquiryTemplateVO> selectBoardList(InquiryDefaultVO searchVO) throws Exception;
	
	public List<InquiryFileVO> selectInquiryFileList(Inquiry inquiry) throws Exception;

	public List<InquirySiteVO> selectInquirySiteList(Inquiry inquiry) throws Exception;

	public List<InquiryTypeLinkVO> selectInquiryTypeLinkList(Inquiry inquiry) throws Exception;
	
	public int selectInquiryListTotCnt() throws Exception;
}
