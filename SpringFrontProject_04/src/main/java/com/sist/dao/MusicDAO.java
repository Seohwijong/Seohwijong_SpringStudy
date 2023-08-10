package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sist.mapper.*;
import com.sist.vo.*;
import java.util.*;
@Repository
public class MusicDAO {
	@Autowired
	private MusicMapper mapper;
//	@Select("SELECT * FROM genie_music "
//			+ "WHERE cno=#{cno}")
	public List<MusicVO> genieListData(int cno)
	{
		return mapper.genieListData(cno);
	}
//	@Select("SELECT * FROM genie_music "
//			+ "FROM mno=#{mno}")
	public MusicVO musicDetailData(int mno)
	{
		return mapper.musicDetailData(mno);
	}
}
