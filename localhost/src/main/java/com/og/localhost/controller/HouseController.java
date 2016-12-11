package com.og.localhost.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.og.localhost.service.HouseService;
import com.og.localhost.vo.CategoryVO;
import com.og.localhost.vo.HelpVO;
import com.og.localhost.vo.UserVO;

@Controller
public class HouseController {

	@Autowired
	private HouseService service;
	private Logger log=Logger.getLogger(HouseController.class);

	//글목록 페이지
	@RequestMapping(value = "/help/helplist")
	public String helpList(HttpServletRequest req)
	{
		//1. 목록 가져오기
		String category=req.getParameter("category");
		int category_no=0;
		List<HelpVO> list=null;
		
		
		try{
			category_no=Integer.parseInt(category);
			
		}catch(Exception e){ 
			
			log.error("HelpList Welcome Page: "+e.getMessage()); 
		}
		
		if(category!=null && category!="" && category_no!=0)
		{
			HelpVO vo=new HelpVO();
			vo.setHelp_categoryNo(category_no);
			
			list=service.helpListSearchCategory(vo);
			req.setAttribute("category", list.get(0).getType());
		}
		
		if(list==null)
		{
			list=service.helpListFirst();
			req.setAttribute("category", "추천 도움말");
		}
			
		//2. 모델&뷰를 설정한다.
		req.setAttribute("list", list);
		return "help/helplist"; 
	}
	
	//글목록 - 찾기 기능
	@RequestMapping(value="/help/helplist/search")
	public String helpSearch(HttpServletRequest req)
	{
		//리퀘스트 값 가져오기
		String search=req.getParameter("search");
		
		//DB액션 - 찾기
		List<HelpVO> list=service.helpListSearchContent(search);
		
		//모델&뷰 설정
		req.setAttribute("list", list);
		return "help/helplist";
	}
	
	//글목록 - 상세 페이지
	@RequestMapping(value="/help/helplist/detail")
	public String helpDetail(HttpServletRequest req)
	{
		String no=req.getParameter("no");
		int h_no=0;
		
		if(no==null || no=="")
		{
			log.info("no is null");
			return "redirect:/help/helplist";
		}
		try
		{
			h_no=Integer.parseInt(no);
			
		}catch(Exception e){ 
			log.info(e.getMessage()); 
			return "redirect:/help/helplist";
		}
		
		HelpVO vo=new HelpVO();
		vo.setNo(h_no);
		req.setAttribute("vo", service.helpListSearchNo(vo));
			
		return "help/helpdetail";
	}
	
	//글쓰기 페이지
	@RequestMapping(value = "/help/insertform", method = { RequestMethod.GET })
	public String helpInsertForm(HttpServletRequest req) {
		
		//1. 카테고리 목록 가져오기
		List<CategoryVO> cateList = service.selectAllCategory();
		
		//2. 모델&뷰 설정
		req.setAttribute("category", cateList);
		return "help/insert";
	}
	
	//글쓰기 액션
	@RequestMapping(value = "/help/insert", method = RequestMethod.POST)
	public String helpInsert(HelpVO vo, MultipartHttpServletRequest req)
	{
		//0.test
		log.info("Controller 진입");
				
		//1. 양식 유효성 체크
		if(vo.getHelp_categoryNo()==0 || vo.getTitle()==null)
			return "redirect:/help/insertform"; 
			
		//2. insert 동작
		service.insert(vo, req);
		log.info("insert 동작 완료");
		
		//3. 뷰 설정하기
		return "redirect:/help/helplist"; 
	}
	
	/*// 글 목록 (분류클릭했을때)
	@RequestMapping(value="/help/helplist/category")*/
	
	
	
	
	
	//-------------------------------------------------------------------------------------회원 Controller로 옮기기
	//회원정보 수정 페이지
	@RequestMapping(value="/user/userupdate", method=RequestMethod.GET)
	public String userModifyFrm(HttpSession session, Model model)
	{
		//00. test
		session.setAttribute("user", "1");
		
		//1. 세션값 체크
		String user=(String)session.getAttribute("user"); //세션에서 아이디 값 가져오기
		
		if(user==null || user=="")
			return "redirect:/help/helplist"; //세션값 없을시(로그인 안한경우) 보낼 페이지
		
		
		
		//2. 회원 식별키 유효성 검사(형변환 검사)
		int no=-1;
		
		try{
			no=Integer.parseInt(user);
		
		}catch(Exception e){
			log.error("Exception: "+"회원식별키 변환 실패");
		}
		
		if(no==-1)
			return "redirect:/help/helplist"; //식별키 유효하지 않으면 보낼 페이지
		

		//3. 모델&뷰 설정
		model.addAttribute("userInfo",service.userSearchNo(no));
		return "help/userupdate";
	}
	
	//회원정보 수정 기능
	@RequestMapping(value="/user/userupdate", method=RequestMethod.POST)
	public String userModify(MultipartHttpServletRequest req, UserVO vo, Model model)
	{
		//1. 프로필 사진 업로드 확인
		if(!req.getFileNames().hasNext())
			vo.setFileName("파일이름"); //파일이름 지정 로직 필요
		
		
		//2. 업데이트
		int updateResult=service.userUpdate(vo);
		
		
		//3. 결과 메세지 세팅
		String msg="회원정보 수정 성공";
		
		if(updateResult<=0)
			msg="회원정보 수정 실패";
		
		
		//4. 모델&뷰 설정
		model.addAttribute("resultMsg",msg);
		model.addAttribute("userInfo",service.userSearchNo(vo.getNo()));
		return "help/userupdate";
	}
	
	
	
	
	
	
	
	
}















