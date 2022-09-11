package com.goodee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goodee.vo.InnerVO;
import com.goodee.vo.VO;

public interface DAO {
	public List<VO> selectlist1();
	public List<VO> selectlist2(VO vo);
	public List<VO> selectlist3(String s);
	public List<VO> selectlist4(@Param("start")String s, @Param("end")String e);
	public List<VO> selectlist5(List<String> list);
	public List<VO> selectlist71(InnerVO vo);
	public List<VO> selectlist8(String name);
	public List<VO> selectlist9(String title);
	public List<VO> selectlist10(InnerVO vo);
	public List<VO> selectlist11(InnerVO vo);

}
