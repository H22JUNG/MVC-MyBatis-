package com.sample.dao;

import java.util.List;

import com.sample.vo.BBSInputVO;
import com.sample.vo.BBSOutputVO;

public interface BBSDAO {
	public List<BBSOutputVO> selectBBSList1();
	public List<BBSOutputVO> selectBBSList2(BBSInputVO vo);
	public List<BBSOutputVO> selectBBSList3(BBSInputVO vo);
	public List<BBSOutputVO> selectBBSList4(BBSInputVO vo);
	public List<BBSOutputVO> selectBBSList5(BBSInputVO vo);
	public List<String> selectAllCategoryList();
	public List<BBSOutputVO> selectBBSList6(BBSInputVO vo);
	public List<BBSOutputVO> selectBBSList7(BBSInputVO vo);
	public List<BBSOutputVO> selectBBSList8(BBSInputVO vo);
}
