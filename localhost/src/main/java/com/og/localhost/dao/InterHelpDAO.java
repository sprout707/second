package com.og.localhost.dao;

import java.util.List;

import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;

public interface InterHelpDAO {

	public int insert(HelpVO vo); // 도움말등록
	public List<HelpVO> selectAll();
	public List<CategoryVO> selectAllCategory();
	public List<HelpVO> searchContent(String search);
	public List<HelpVO> helpFirst();
	public HelpVO searchNo(HelpVO vo);
	public List<HelpVO> searchCategoryNo(HelpVO vo);
	
}
