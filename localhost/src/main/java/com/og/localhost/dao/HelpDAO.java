package com.og.localhost.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;

@Repository
public class HelpDAO implements InterHelpDAO {

	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public int insert(HelpVO vo) {
		return sqlsession.insert("help.insert", vo);
	}

	@Override
	public List<HelpVO> selectAll() {
		return sqlsession.selectList("help.selectAll");
	}

	@Override
	public List<CategoryVO> selectAllCategory() {
		return sqlsession.selectList("help.selectAllCategory");
	}

	@Override
	public List<HelpVO> searchContent(String search) {
		return sqlsession.selectList("help.searchContent", search);
	}

	@Override
	public List<HelpVO> helpFirst() {
		return sqlsession.selectList("help.helpFirst");
	}

	@Override
	public HelpVO searchNo(HelpVO vo) {
		return sqlsession.selectOne("help.searchNo", vo);
	}

	@Override
	public List<HelpVO> searchCategoryNo(HelpVO vo) {
		return sqlsession.selectList("help.searchCategoryNo", vo);
	}
	
}
