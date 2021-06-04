package com.innovationT.inno.inquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.inquiry.dao.InquiryMapper;
import com.innovationT.inno.inquiry.vo.Inquiry;
import com.innovationT.inno.inquiry.vo.InquiryDefaultVO;
import com.innovationT.inno.inquiry.vo.InquiryFileVO;
import com.innovationT.inno.inquiry.vo.InquiryReservationVO;
import com.innovationT.inno.inquiry.vo.InquirySiteVO;
import com.innovationT.inno.inquiry.vo.InquiryTemplateVO;
import com.innovationT.inno.inquiry.vo.InquiryTypeLinkVO;
import com.innovationT.inno.inquiry.vo.InquiryUserInfoVO;
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
	public void updateInquiry(InquiryTemplateVO inquiryTemplateVO) throws Exception {
		
		// 트랜잭션 처리 필요
		inquiryDAO.updateInquiry(inquiryTemplateVO.getInquiryVO());
		deleteAndinsertList(inquiryTemplateVO.getInquiryFileVOList());
//		List<Integer> inquiryFileIdxList = inquiryDAO.selectIdxList(inquiryFileVOList);
//		for (int i = 0; i < inquiryFileVOList.size(); i++) {
//			InquiryFileVO inquiryFileVO = inquiryFileVOList.get(i);
//			for (int j = 0; j < inquiryFileIdxList.size(); j++) {
//				if (inquiryFileVO.getInquiryFileIdx() == 0) {
//					inquiryDAO.insertInquiry(inquiryFileVO.getInquiryIdx(), inquiryFileVO);
//				} else if (inquiryFileIdxList.contains(inquiryFileVO.getInquiryIdx())) {
//					inquiryDAO.updateInquiry(inquiryFileVO);
//				}
//			}
//		}
//		inquiryDAO.deleteInquiryList(inquiryFileVOList.get(0));
//		for (int i = 0; i < inquiryFileVOList.size(); i++) {
//			InquiryFileVO inquiryFileVO = inquiryFileVOList.get(i);
//			inquiryDAO.insertInquiry(inquiryFileVO.getInquiryIdx(), inquiryFileVO);
//		}
		inquiryDAO.updateInquiry(inquiryTemplateVO.getInquiryUserInfoVO());
		deleteAndinsertList(inquiryTemplateVO.getInquiryTypeLinkVOList());
		inquiryDAO.updateInquiry(inquiryTemplateVO.getInquiryReservationVO());
		deleteAndinsertList(inquiryTemplateVO.getInquirySiteVOList());
	}

	@Override
	public void deleteInquiry(InquiryVO inquiryVO) throws Exception {
		inquiryDAO.deleteInquiry(inquiryVO);
	}

	@Override
	public InquiryTemplateVO selectInquiry(Inquiry inquiry) throws Exception {
		
		// 트랜잭션 필요
		InquiryTemplateVO result = new InquiryTemplateVO();
//		InquiryVO inquiryVO = inquiryDAO.selectInquiry(inquiry);
//		InquiryUserInfoVO inquiryUserInfoVO = inquiryDAO.selectInquiryUserInfo(inquiry);
//		InquiryReservationVO inquiryReservationVO = inquiryDAO.selectInquiryReservation(inquiry);
//		List<InquiryFileVO> inquiryFileVOList = inquiryDAO.selectInquiryFileList(inquiry);
//		List<InquiryTypeLinkVO> inquiryTypeLinkVOList = inquiryDAO.selectInquiryTypeLinkList(inquiry);
//		List<InquirySiteVO> inquirySiteVOList = inquiryDAO.selectInquirySiteList(inquiry);
		
//		result.setInquiryVO(inquiryVO);
//		result.setInquiryUserInfoVO(inquiryUserInfoVO);
//		result.setInquiryReservationVO(inquiryReservationVO);
//		result.setInquiryFileVOList(inquiryFileVOList);
//		result.setInquiryTypeLinkVOList(inquiryTypeLinkVOList);
//		result.setInquirySiteVOList(inquirySiteVOList);
		
		result.setInquiryVO(inquiryDAO.selectInquiry(inquiry));
		result.setInquiryUserInfoVO(inquiryDAO.selectInquiryUserInfo(inquiry));
		result.setInquiryReservationVO(inquiryDAO.selectInquiryReservation(inquiry));
		result.setInquiryFileVOList(inquiryDAO.selectInquiryFileList(inquiry));
		result.setInquiryTypeLinkVOList(inquiryDAO.selectInquiryTypeLinkList(inquiry));
		result.setInquirySiteVOList(inquiryDAO.selectInquirySiteList(inquiry));
		
		return result;
	}

	@Override
	public List<InquiryTemplateVO> selectInquiryList(InquiryDefaultVO searchVO) throws Exception {
		return inquiryDAO.selectBoardList(searchVO);
	}

	@Override
	public int selectInquiryListTotCnt() throws Exception {
		return inquiryDAO.selectInquiryListTotCnt();
	}
	
	public void deleteAndinsertList(List<? extends Inquiry> inquiryList) throws Exception{
		inquiryDAO.deleteInquiryList(inquiryList.get(0));
		for (int i = 0; i < inquiryList.size(); i++) {
			inquiryDAO.insertInquiryList(inquiryList.get(i).getInquiryIdx(), inquiryList);
		}
	}
}
