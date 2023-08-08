package com.sist.mapper;
import java.util.*;
import com.sist.vo.*;
import org.apache.ibatis.annotations.Select;
/*
 * NO     NOT NULL NUMBER         
TITLE  NOT NULL VARCHAR2(1000) 
POSTER NOT NULL VARCHAR2(260)  
CHEF   NOT NULL VARCHAR2(300)  
LINK            VARCHAR2(260)  
HIT             NUMBER      
 */
import org.apache.ibatis.annotations.Update;
public interface RecipeMapper {
	@Select("SELECT no,title,poster,num "
			+ "FROM (SELECT no,title,poster,rownum as num "
			+ "FROM (SELECT no, title, poster "
			+ "FROM recipe ORDER BY no ASC)) "
			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<RecipeVO> recipeListData(Map map);
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM recipe")
	public int recipeTotalPage();
	@Update("UPDATE recipe SET "
			+ "hit=hit+1 "
			+ "WHERE no=#{no}")
	public void hitIncrement(int no);
	@Select("SELECT no,title,poster,chef,link,num "
			+ "FROM recipe "
			+ "WHERE no=#{no}")
	public RecipeVO recipeDetailData(int no);
	
	
}
