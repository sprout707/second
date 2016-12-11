package com.og.localhost.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.og.localhost.dao.HelpDAO;
import com.og.localhost.util.FileUtil;
import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;
import com.og.localhost.vo.UserVO;

@Service
public class HouseService implements InterHouseService {

	@Autowired
	private HelpDAO dao;
	
	@Autowired
	private FileUtil fileutil;
	
	public int insert(HelpVO vo, MultipartHttpServletRequest req)
	{
		int result=0;
		
		String content=vo.getContent();
		content=content.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", ""); //HTML 태그 제거
		content=content.replaceAll("\n", "<br/>"); //개행 문자 바꾸기
		vo.setContent(content);
		
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
	
	
	
	
	
	
	//---------------------------------------------------------------------------회원 Service로 옮기기
	//회원번호를 통한 회원정보 조회
	public UserVO userSearchNo(int no) {
		UserVO vo=dao.searchNo(no);
		
		//전화번호 보여질 모양 가다듬기
		String phone=vo.getPhone();
		phone=phone.substring(0, 3)+"-"+phone.substring(3, 7)+"-"+phone.substring(7);
		
		vo.setPhone(phone);
		
		return vo;
	}
	
	//회원정보 업데이트
	public int userUpdate(UserVO vo) {
		
		//휴대폰번호 DB form으로 변환
		vo.setPhone(vo.getPhone().replaceAll("-", ""));
		
		//생일 DB form으로 변환
		vo.setBirth(vo.getYear()+"/"+vo.getMonth()+"/"+vo.getDate());
		
		return dao.userUpdate(vo);
	}
	
}















