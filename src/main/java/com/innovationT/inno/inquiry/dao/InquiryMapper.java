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
	
//	public void insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
//	public void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception;
	
	public void insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
	public void insertInquiryFileVO(InquiryFileVO inquiryFileVO) throws Exception;
	
	public void insertInquiryReservationVO(InquiryReservationVO inquiryReservationVO) throws Exception;
	
	public void insertInquirySiteVO(InquirySiteVO inquirySiteVO) throws Exception;
	
	public void insertInquiryTypeLinkVO(InquiryTypeLinkVO inquiryTypeLinkVO) throws Exception;
	
	public void insertInquiryUserInfoVO(InquiryUserInfoVO inquiryUserInfoVO) throws Exception;
	
//	public void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception;
	
//	public void updateInquiry(Inquiry inquiry) throws Exception;
	
	public void updateInquiryVO(InquiryVO inquiryVO) throws Exception;
	
	public void updateInquiryReservationVO(InquiryReservationVO inquiryReservationVO) throws Exception;
	
	public void updateInquiryUserInfoVO(InquiryUserInfoVO inquiryUserInfoVO) throws Exception;
	
//	public void updateInquiryList(List<? extends Inquiry> inquiryList) throws Exception;
	
	public List<Integer> selectIdxList(List<? extends Inquiry> inquiryList) throws Exception;
	
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
//	public void deleteInquiryList(Inquiry inquiry) throws Exception;
	
	public void deleteInquiryFileList(int inquiryIdx) throws Exception;
	
	public void deleteInquiryTypeLinkList(int inquiryIdx) throws Exception;
	
	public void deleteInquirySiteList(int inquiryIdx) throws Exception;
	
//	public InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception;
	
	public InquiryVO selectInquiry(int inquiryIdx) throws Exception;
	
	public InquiryUserInfoVO selectInquiryUserInfo(int inquiryIdx) throws Exception;
	
	public InquiryReservationVO selectInquiryReservation(int inquiryIdx) throws Exception;
	
	public List<InquiryFileVO> selectInquiryFileList(int inquiryIdx) throws Exception;
	
	public List<InquirySiteVO> selectInquirySiteList(int inquiryIdx) throws Exception;
	
	public List<InquiryTypeLinkVO> selectInquiryTypeLinkList(int inquiryIdx) throws Exception;
	
	public List<InquiryTemplateVO> selectBoardList(InquiryDefaultVO searchVO) throws Exception;
	
	public int selectInquiryListTotCnt(InquiryDefaultVO searchVO) throws Exception;
	
	public void updateToCheck(int inquiryIdx) throws Exception;
}
