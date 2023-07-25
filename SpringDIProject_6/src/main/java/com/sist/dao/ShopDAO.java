package com.sist.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.*;
import com.sist.vo.*;

public class ShopDAO extends SqlSessionDaoSupport{
	public List<SeoulShopVO> shopListData()
	{
		return getSqlSession().selectList("shopListData");
	}
	public SeoulShopVO shopDetailData(int no)
	{
		return getSqlSession().selectOne("shopDetailData",no);
	}
}
