package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;
@Repository
public class RecipeDAO {
	@Autowired
	private RecipeMapper mapper;
//	@Select("SELECT no,title,poster,num "
//			+ "FROM (no,title,poster,rownum as num "
//			+ "FROM (no, title, poster "
//			+ "FROM recipe ORDER BY no ASC)) "
//			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<RecipeVO> recipeListData(Map map)
	{
		return mapper.recipeListData(map);
	}
//	@Select("SELECT CEIL(COUNT(*)/12.0) FROM goods_all")
	public int recipeTotalPage()
	{
		return mapper.recipeTotalPage();
	}
//	@Update("UPDATE recipe SET "
//			+ "hit=hit+1 "
//			+ "WHERE no=#{no}")
//	public void hitIncrement(int no);
//	@Select("SELECT no,title,poster,chef,link,num "
//			+ "FROM recipe "
//			+ "WHERE no=#{no}")
	public RecipeVO recipeDetailData(int no)
	{
		mapper.hitIncrement(no);
		return mapper.recipeDetailData(no);
	}
}
