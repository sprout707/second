package com.og.localhost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.og.localhost.dao.HelpDAO;
import com.og.localhost.util.FileUtil;
import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;

@Service
public class HouseService implements InterHouseService {

	@Autowired
	private HelpDAO dao;
	
	@Autowired
	private FileUtil fileutil;
	
	public int insert(HelpVO vo, MultipartHttpServletRequest req)
	{
		int result=0;
		
		try
		{
			String fileName=fileutil.fileUpload(req);
			vo.setFileName(fileName);
		
		}catch(Exception e){e.toString();}
		
		finally
		{
			result=dao.insert(vo);
		}
		
		return result;
	}

	@Override
	public List<HelpVO> helpListFirst() {
		return dao.helpFirst();
	}

	@Override
	public List<CategoryVO> selectAllCategory() {
		return dao.selectAllCategory();
	}

	@Override
	public List<HelpVO> helpListSearchContent(String search) {
		return dao.searchContent(search);
	}

	@Override
	public HelpVO helpListSearchNo(HelpVO vo) {
		return dao.searchNo(vo);
	}

	@Override
	public List<HelpVO> helpListSearchCategory(HelpVO vo) {
		return dao.searchCategoryNo(vo);
	}
	
	
}
