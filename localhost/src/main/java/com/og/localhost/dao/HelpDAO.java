package com.og.localhost.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;
import com.og.localhost.vo.UserVO;

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
	
	
	
	//-----------------------------------------------------------------------회원 DAO로 옮기기
	public UserVO searchNo(int no) {
		return sqlsession.selectOne("user.searchNo", no);
	}
	
	public int userUpdate(UserVO vo) {
		return sqlsession.update("user.userUpdate", vo); //이름, 생일, 성별, 이메일, 휴대전화번호 업데이트
	}
	
	public int userFileUpdate(UserVO vo) {
		return sqlsession.update("user.userFileUpdate", vo);
	}
	
}




















