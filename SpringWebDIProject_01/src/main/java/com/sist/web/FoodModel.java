package com.sist.web;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.FoodDAO;
import com.sist.vo.CategoryVO;
import com.sist.vo.FoodVO;

// Model (요청 => 응답)
@Controller
@RequestMapping("food/")
public class FoodModel {
	@Autowired
	private FoodDAO dao;
	@RequestMapping("category.do")
	public String food_category(HttpServletRequest request, HttpServletResponse response)
	{
		List<CategoryVO> list=dao.foodCategoryListData();
		request.setAttribute("list", list);
		return "food/category";
	}
	@RequestMapping("food_list.do")
	public String food_list(HttpServletRequest request, HttpServletResponse response)
	{
		String cno=request.getParameter("cno");
		List<FoodVO> list=dao.foodListData(Integer.parseInt(cno));
		request.setAttribute("list", list);
		return "food/food_ist";
	}
}
