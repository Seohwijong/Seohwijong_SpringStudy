package com.sist.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Model (요청 => 응답)
@Controller
public class FoodModel {
	@RequestMapping("food/cateory.do")
	public String food_category(HttpServletRequest request, HttpServletResponse response)
	{
		
		return "food/category";
	}
}
