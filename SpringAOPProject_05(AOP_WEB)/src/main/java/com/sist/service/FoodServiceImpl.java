package com.sist.service;
import com.sist.dao.*;
import com.sist.vo.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService{
	@Autowired
	private FoodDAO dao;

	@Override
	public List<CategoryVO> foodCategoryData() {
		// TODO Auto-generated method stub
		return dao.foodCategoryData();
	}

	@Override
	public List<FoodVO> foodTop7() {
		// TODO Auto-generated method stub
		return dao.foodTop7();
	}

	@Override
	public List<SeoulVO> seoulTop7() {
		// TODO Auto-generated method stub
		return dao.seoulTop7();
	}
	
	
}
