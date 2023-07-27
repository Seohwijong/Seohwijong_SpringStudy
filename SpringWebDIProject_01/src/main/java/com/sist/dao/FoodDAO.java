package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.vo.*;
import com.sist.mapper.*;
/*
 *     clinet
 *        |
 *     DispatcherServlet : 사용자의 모든 요청을 받는다 (Front Controller)
 *                         이미 스프링에서 라이브러리 제작
 *                         => 등록 (web.xml) => servlet은 구동 (톰캣)
 *                    = HandlerAdapter
 *                    = HandlerMapping
 */

@Repository
public class FoodDAO {
	@Autowired
	private FoodMapper mapper;
/*
@Select("SELECT cno,title,poster,subject "
			+ "FROM food_category "
			+ "ORDER BY cno ASC") 
*/
	public List<CategoryVO> foodCategoryListData()
	{
		return mapper.foodCategoryListData();
	}
//	@Select("SELECT fno,name,score,address,phone,type,poster "
//			+ "FROM food_house "
//			+ "WHERE cno=#{cno}")
	public List<FoodVO> foodListData(int cno)
	{
		return mapper.foodListData(cno);
	}
	
}
