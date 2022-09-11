package com.sample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.conf.JDBCConnection;
import com.sample.dao.BBSDAO;
import com.sample.vo.BBSInputVO;
import com.sample.vo.BBSOutputVO;

public class BBSService {
	SqlSessionFactory sqlSessionFactory = JDBCConnection.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	BBSDAO dao = sqlSession.getMapper(BBSDAO.class);

	public void getBBSList1(HttpServletRequest request) {
		request.setAttribute("list", dao.selectBBSList1());
	}

	public void getBBSList2(HttpServletRequest request) {
		if (request.getParameter("category") != null) {
			BBSInputVO vo = new BBSInputVO();
			vo.setCategory(request.getParameter("category"));
			request.setAttribute("list", dao.selectBBSList2(vo));
		} else {
			getBBSList1(request);
		}
	}

	public void getBBSList3(HttpServletRequest request) {
		if (request.getParameter("category") != null) {
			BBSInputVO vo = new BBSInputVO();
			vo.setCategory(request.getParameter("category"));
			request.setAttribute("list", dao.selectBBSList3(vo));
		} else {
			getBBSList1(request);
		}
	}

	public void getBBSList4(HttpServletRequest request) {
		if (request.getParameter("category") != null) {
			BBSInputVO vo = new BBSInputVO();
			vo.setCategory(request.getParameter("category"));
			request.setAttribute("list", dao.selectBBSList4(vo));
		} else {
			getBBSList1(request);
		}
		request.setAttribute("category", dao.selectAllCategoryList());
	}

	public void getBBSList5(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		String choice = request.getParameter("choice");
		if(choice == null || choice.equals("1")) {
			String[] strs = {"01","03","05","07","09","11"};
			vo.setMonths(Arrays.asList(strs));
			request.setAttribute("choice", "1");
		}else {
			String[] strs = {"02","04","06","08","10","12"};
			vo.setMonths(Arrays.asList(strs));
			request.setAttribute("choice", "2");
		}
		request.setAttribute("list", dao.selectBBSList5(vo));
	}
	
	public void getBBSList6(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		String startMonth = request.getParameter("startmonth");
		String endMonth = request.getParameter("endmonth");
		vo.setStartMonth((startMonth==null)?"01":startMonth);
		vo.setEndMonth((endMonth==null)?"12":endMonth);
		
		request.setAttribute("list", dao.selectBBSList6(vo));
	}
	
	public void getBBSList7(HttpServletRequest request) {
		String[] months = request.getParameterValues("months");
		if(months == null) {
			months = new String[]{"01","02","03","04",
					"05","06","07","08","09","10","11","12"};
		}
		List<List<BBSOutputVO>> list = new ArrayList<List<BBSOutputVO>>();
		
		for (int i = 0; i < months.length; i++) {
			BBSInputVO vo = new BBSInputVO();
			vo.setMonth(months[i]);
			list.add(dao.selectBBSList7(vo));			
		}
		
		request.setAttribute("list", list);
	}
	
	public void getBBSList8(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		vo.setOwner(request.getParameter("owner"));
		
		request.setAttribute("list", dao.selectBBSList8(vo));
	}
	
	public void getBBSList9(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		if(request.getParameter("title")!= null &&
				!request.getParameter("title").equals("")) {
			vo.setTitle("%"+request.getParameter("title")+"%");
		}
		request.setAttribute("list", dao.selectBBSList8(vo));
	}
	
	public void getBBSList10(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		if(request.getParameter("content")!= null &&
				!request.getParameter("content").equals("")) {
			vo.setContent("%"+request.getParameter("content")+"%");
		}
		request.setAttribute("list", dao.selectBBSList8(vo));
	}
	
	public void getBBSList11(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		if(request.getParameter("order") != null && 
				!request.getParameter("order").equals("")) {
			if(request.getParameter("order").equals("1")) {
				vo.setOwner(request.getParameter("content"));
			}else if(request.getParameter("order").equals("2")) {
				vo.setTitle("%"+request.getParameter("content")+"%");			
			}else if(request.getParameter("order").equals("3")){
				vo.setContent("%"+request.getParameter("content")+"%");
			}			
		}
		request.setAttribute("list", dao.selectBBSList8(vo));
	}
	
	public void getBBSList12(HttpServletRequest request) {
		BBSInputVO vo = new BBSInputVO();
		if(request.getParameter("owner") != null &&
				!request.getParameter("owner").equals("")) {
			vo.setOwner(request.getParameter("owner"));
		}
		if(request.getParameter("title")!= null &&
				!request.getParameter("title").equals("")) {
			vo.setTitle("%"+request.getParameter("title")+"%");			
		}
		if(request.getParameter("content")!= null &&
				!request.getParameter("content").equals("")){
			vo.setContent("%"+request.getParameter("content")+"%");
		}
		request.setAttribute("list", dao.selectBBSList8(vo));
	}
}
