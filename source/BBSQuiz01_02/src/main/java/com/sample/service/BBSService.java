package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.conf.JDBCConnection;

public class BBSService {
	SqlSessionFactory sqlSessionFactory = JDBCConnection.getSqlSession();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    public void getBBSList1(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList1"));
    }
    public void getBBSList2(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList2"));
    }
    public void getBBSList3(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList3"));
    }
    public void getBBSList4(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList4"));
    }
    public void getBBSList5(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList5"));
    }
    public void getBBSList6(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList6"));
    }
    public void getBBSList7(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList7"));
    }
    public void getBBSList8(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList8"));
    }
    public void getBBSList9(HttpServletRequest request) {
    	request.setAttribute("list", sqlSession.selectList("bbs.selectBBSList9"));
    	request.setAttribute("cnt", sqlSession.selectOne("bbs.selectBBSCount"));
    }
}
