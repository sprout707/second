package com.og.localhost.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;

public interface InterHouseService {

	public int insert(HelpVO vo, MultipartHttpServletRequest req) throws IOException; // 도움말등록
	public List<HelpVO> helpListFirst();
	public List<CategoryVO> selectAllCategory();
	public List<HelpVO> helpListSearchContent(String search);
	public HelpVO helpListSearchNo(HelpVO vo);
	public List<HelpVO> helpListSearchCategory(HelpVO vo);
	
	
}
