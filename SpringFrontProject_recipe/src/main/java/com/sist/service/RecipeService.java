package com.sist.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sist.vo.RecipeVO;

public interface RecipeService {
//	@Select("SELECT no,title,poster,num "
//			+ "FROM (no,title,poster,rownum as num "
//			+ "FROM (no, title, poster "
//			+ "FROM recipe ORDER BY no ASC)) "
//			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<RecipeVO> recipeListData(Map map);
//	@Select("SELECT CEIL(COUNT(*)/12.0) FROM goods_all")
	public int recipeTotalPage();
//	@Update("UPDATE recipe SET "
//			+ "hit=hit+1 "
//			+ "WHERE no=#{no}")
//	public void hitIncrement(int no);
//	@Select("SELECT no,title,poster,chef,link,num "
//			+ "FROM recipe "
//			+ "WHERE no=#{no}")
	public RecipeVO recipeDetailData(int no);
}
