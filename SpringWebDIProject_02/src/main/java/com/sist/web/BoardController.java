package com.sist.web;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import javax.servlet.http.HttpSession;

import com.sist.dao.*;
import com.sist.vo.BoardVO;
// 메모리 할당 
@Controller
@RequestMapping("board/")
public class BoardController {
 @Autowired
 private BoardDAO dao;
 // list.do?page= 넘어오는 변수 page
 // 목록 
 @GetMapping("list.do")
 public String board_list(String page,Model model) // 받는 page 일치 해야함
 {
	 // Model model => 전송 객체 (request대신 사용)
	 if(page==null)
		 page="1";
	 int curpage=Integer.parseInt(page);
	 Map map=new HashMap();
	 int rowSize=10;
	 int start=(rowSize*curpage)-(rowSize-1);
	 int end=rowSize*curpage;
	 map.put("start", start);
	 map.put("end", end);
	 List<BoardVO> list=dao.boardListData(map);
	 int totalpage=dao.boardTotalPage();
	 
	 model.addAttribute("curpage",curpage);
	 model.addAttribute("totalpage", totalpage);
	 model.addAttribute("list", list);
	 return"board/list";
 }
 // 데이터 추가
 @GetMapping("insert.do")
 public String board_insert()
 {
	 return "board/insert";
 }
 @PostMapping("insert_ok.do")                             //폼태그로 보낼 때 postMapping
 public String board_insert_ok(BoardVO vo)
 {
	 dao.boardInsert(vo);
	 return "redirect:list.do";
 }
 // 데이터 수정
 // 데이터 삭제 
 // 상세보기 
 /*
  * 	class Model
  * 	{
  * 		HttpServletRequest request;
  * 		public void addAttribute(String key,Object obj)
  * 		{
  * 			request.setAttribute(key,obj);
  * 		}
  * 	}
  */
 @GetMapping("detail.do")
 public String board_detail(int no,Model model)
 {
	 // String no=request.getParameter("no")
	 BoardVO vo=dao.boardDetailData(no);
	 model.addAttribute("vo", vo);
	 return "board/detail";
 }
 // 검색 ==> 동적 쿼리 
 
}