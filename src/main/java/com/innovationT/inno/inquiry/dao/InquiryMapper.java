package com.innovationT.inno.inquiry.dao;

//import java.util.HashMap;
import java.util.List;

import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

public interface InquiryMapper {

//	public void insertInquiry(HashMap<String, Inquiry> map) throws Exception;
	
	public InquiryVO insertInquiryVO(InquiryVO inquiryVO) throws Exception;
	
	public void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception;
	
	public void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception;
	
	public void updateInquiry(Inquiry inquiry) throws Exception;
	
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception;
	
	public Inquiry selectInquiry(Inquiry inquiry) throws Exception;
	
	public List<Inquiry> selectInquiryList(InquiryDefaultVO searchVO) throws Exception;
	
	public int selectInquiryListToCnt(InquiryDefaultVO searchVO) throws Exception;
}
