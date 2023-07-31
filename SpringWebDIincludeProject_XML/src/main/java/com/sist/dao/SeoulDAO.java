package com.sist.dao;

import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class SeoulDAO {
	@Autowired
	private SeoulMapper mapper;
//	@Select("SELECT no,title,poster,num"
//			+ "FROM (SELECT no,title,poster,rownum as num "
//			+ "FROM (SELECT no,title,poster "
//			+ "FROM seoul_location ORDER BY no ASC)) "
//			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<SeoulVO> seoulLocationListData(Map map)
	{
		return mapper.seoulLocationListData(map);
	}
//	@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoul_location")
	public int seoulLocationTotalPage()
	{
		return mapper.seoulLocationTotalPage();
	}
	
//	@Select("SELECT no,title,poster,num "
//			+ "FROM (SELECT no,title,poster,rownum as num "
//			+ "FROM (SELECT no,title,poster "
//			+ "FROM seoul_nature ORDER BY no ASC)) "
//			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<SeoulVO> seoulnatureListData(Map map)
	{
		return mapper.seoulnatureListData(map);
	}
//	@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoul_nature")
	public int seoulnatureTotalPage()
	{
		return mapper.seoulnatureTotalPage();
	}
	
//	@Select("SELECT no,title,poster,num "
//			+ "FROM (SELECT no,title,poster,rownum as num "
//			+ "FROM (SELECT no,title,poster "
//			+ "FROM seoul_shop ORDER BY no ASC)) "
//			+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<SeoulVO> seoulshopListData(Map map)
	{
		return mapper.seoulshopListData(map);
	}
//	@Select("SELECT CEIL(COUNT(*)/12.0) FROM seoul_shop")
	public int seoulshopTotalPage()
	{
		return mapper.seoulshopTotalPage();
	}
}
