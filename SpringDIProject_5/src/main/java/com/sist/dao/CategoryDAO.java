package com.sist.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CategoryDAO extends SqlSessionDaoSupport{
	public List<CategoryVO> CategoryListData()
	{
		return getSqlSession().selectList("categoryListData");
	}
}
