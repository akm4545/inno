package com.innovationT.inno.inquiry.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.inquiry.dao.InquiryMapper;
import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryVO;

@Service("inquiryService")
public class InquiryServiceImpl implements InquiryService{

	@Autowired
	private InquiryMapper inquiryDAO;
	
//	public String insertInquiry(HashMap<String, Inquiry> map) throws Exception {
//		inquiryDAO.insertInquiry(map);
//		return null;
//	}
	
	@Override
	public InquiryVO insertInquiryVO(InquiryVO inquiryVO) throws Exception {
		return inquiryDAO.insertInquiryVO(inquiryVO);
	}
	
	@Override
	public void insertInquiry(int inquiryIdx, Inquiry inquiry) throws Exception {
		inquiryDAO.insertInquiry(inquiryIdx, inquiry);
	}
	
	@Override
	public void insertInquiryList(int inquiryIdx, List<? extends Inquiry> inquiryList) throws Exception {
		inquiryDAO.insertInquiryList(inquiryIdx, inquiryList);
	}

	@Override
	public void updateInquiry(Inquiry inquiry) throws Exception {
		inquiryDAO.updateInquiry(inquiry);
	}

	@Override
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.deleteInquiry(inquiryVO);
	}

	@Override
	public Inquiry selectInquiry(Inquiry inquiry) throws Exception {
		Inquiry result = inquiryDAO.selectInquiry(inquiry);
		return result;
	}

	@Override
	public List<Inquiry> selectInquiryList(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectInquiryList(searchVO);
	}

	@Override
	public int selectInquiryListToCnt(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectInquiryListToCnt(searchVO);
	}
}
