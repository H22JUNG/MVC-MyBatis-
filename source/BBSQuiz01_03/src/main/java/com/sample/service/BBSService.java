package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.conf.JDBCConnection;
import com.sample.dao.BBSDAO;

public class BBSService {
	SqlSessionFactory sqlSessionFactory = JDBCConnection.getSqlSession();
    SqlSession sqlSession = sqlSessionFactory.openSession();
    BBSDAO dao = sqlSession.getMapper(BBSDAO.class);
    
    public void getBBSList1(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList1());
    }
    public void getBBSList2(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList2());
    }
    public void getBBSList3(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList3());
    }
    public void getBBSList4(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList4());
    }
    public void getBBSList5(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList5());
    }
    public void getBBSList6(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList6());
    }
    public void getBBSList7(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList7());
    }
    public void getBBSList8(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList8());
    }
    public void getBBSList9(HttpServletRequest request) {
    	request.setAttribute("list", dao.selectBBSList9());
    	request.setAttribute("cnt", dao.selectBBSCount());
    }
}
