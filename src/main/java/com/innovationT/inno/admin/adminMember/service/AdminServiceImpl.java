package com.innovationT.inno.admin.adminMember.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innovationT.inno.admin.adminMember.dao.AdminMapper;
import com.innovationT.inno.admin.adminMember.vo.AdminDefaultVO;
import com.innovationT.inno.admin.adminMember.vo.AdminVO;

@Service
public class AdminServiceImpl implements AdminIService{

	@Autowired
	AdminMapper adminDAO;
	
	@Override
	public List<AdminVO> selectAdminList(AdminDefaultVO searchVO) throws Exception {
		return adminDAO.selectAdminList(searchVO);
	}

	@Override
	public void insertAdmin(AdminVO adminVO) throws Exception {
		adminDAO.insertAdmin(adminVO);
	}

	@Override
	public AdminVO selectAdmin(AdminVO adminVO) throws Exception {
		return adminDAO.selectAdmin(adminVO);
	}

	@Override
	public void updateAdmin(AdminVO adminVO) throws Exception {
		adminDAO.updateAdmin(adminVO);
	}

	@Override
	public void deleteAdmin(AdminVO adminVO) throws Exception {
		adminDAO.deleteAdmin(adminVO);
	}

}
