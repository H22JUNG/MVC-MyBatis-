package com.goodee.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.goodee.conf.SqlSessionManager;
import com.goodee.dao.DAO;
import com.goodee.vo.InnerVO;
import com.goodee.vo.VO;

public class service1 {
	SqlSessionFactory factory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = factory.openSession();
	DAO dao = sqlSession.getMapper(DAO.class);

	public void listService1(HttpServletRequest request) {
		try {
			List<VO> list = dao.selectlist1();
			request.setAttribute("list", list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void listService2(HttpServletRequest request) {

		try {
			VO vo = new VO();
			vo.setCategory(request.getParameter("category"));

			List<VO> list = dao.selectlist2(vo);
			request.setAttribute("list", list);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void listService3(HttpServletRequest request) {
		try {
			List<VO> list = dao.selectlist3(request.getParameter("create"));
			request.setAttribute("list", list);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void listService4(HttpServletRequest request) {
		try {
			String s = request.getParameter("start");
			String end = request.getParameter("end");
			List<VO> list = dao.selectlist4(s, end);
			request.setAttribute("list", list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*public void listService5(HttpServletRequest request) {
		try {
			if(request.getParameterValues("month")==null) {
				try {
					List<VO> list = dao.selectlist1();
					request.setAttribute("list", list);
				} catch(Exception e) {
					e.printStackTrace();
				}
			} else {
			List<String> arrlist = new ArrayList<String>();
			for(String string : request.getParameterValues("month")) {
				arrlist.add(string);
			}

			List<VO> list = dao.selectlist5(arrlist);
			request.setAttribute("list", list);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/

	public Boolean listService5(HttpServletRequest request) {
		List<String> arrlist = new ArrayList<String>();
		try {
			for(String string : request.getParameterValues("month")) {
				arrlist.add(string);
			}
			List<VO> list = dao.selectlist5(arrlist);
			request.setAttribute("list", list);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return (arrlist != null) ? true : false;
	}

	//-------------------------------------------------

	public void listService71(HttpServletRequest request) {

		String[] months = request.getParameterValues("month");
		if(months == null) {
			months = new String[] {"1","2","3","4","5","6","7",
					"8","9","10","11","12"};
		}
		List<List<VO>> list = new ArrayList<List<VO>>();

		for(int i = 0; i < months.length; i++) {
			InnerVO invo = new InnerVO();
			invo.setMonth(months[i]);
			list.add(dao.selectlist71(invo)); //내가 선택한 달
		}
		request.setAttribute("list", list);
	}
	//-------------------------------------------------
	public void listService8(HttpServletRequest request) {
		try {
			List<VO> list = dao.selectlist8(request.getParameter("owner"));
			request.setAttribute("list", list);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void listService9(HttpServletRequest request) {
		/*try {
			if(request.getParameter("title") != null && request.getParameter("title")!="") {
				//뭐라도 입력이 되면 %% 붙여서 검색
				List<VO> list1 = dao.selectlist9("%" + request.getParameter("title")+ "%");
				request.setAttribute("list", list1);
			} else { //입력한 값이 없거나, 첫페이지면
			List<VO> list2 = dao.selectlist9(null);
			request.setAttribute("list", list2);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		if(request.getParameter("title") != null &&
				request.getParameter("title")!="") {
			request.setAttribute("list", dao.selectlist9("%" + request.getParameter("title")+ "%"));
		} else {
			request.setAttribute("list", dao.selectlist9(null));
		}
	}
	public void listService10(HttpServletRequest request) {
		InnerVO invo = new InnerVO();
		if(request.getParameter("content") != null &&
				request.getParameter("content")!="") {
			invo.setContent("%" + request.getParameter("content") + "%");
		} 
		request.setAttribute("list", dao.selectlist10(invo));
	}

	public void listService11(HttpServletRequest request) {
		InnerVO invo = new InnerVO();
		if(request.getParameter("order") != null &&
				request.getParameter("order") !="") {
			if(request.getParameter("order").equals("owner")) {
				invo.setOwner(request.getParameter("input"));
			} else if (request.getParameter("order").equals("content")) {
				invo.setContent("%" + request.getParameter("input") + "%");
			} else if (request.getParameter("order").equals("title")) {
				invo.setTitle("%" + request.getParameter("input") + "%");
			}
		}
		request.setAttribute("list", dao.selectlist11(invo));
	}
	
	public void listService12(HttpServletRequest request) {
		InnerVO invo = new InnerVO();
		if(request.getParameter("title") != null &&
				request.getParameter("title") !="") {
			invo.setTitle("%" + request.getParameter("title") + "%");
		}
		if(request.getParameter("owner") != null &&
				request.getParameter("owner") !="") {
			invo.setOwner(request.getParameter("owner"));
		}
		if(request.getParameter("content") != null &&
				request.getParameter("content") !="") {
			invo.setContent("%" + request.getParameter("content") + "%");
		}
		request.setAttribute("list", dao.selectlist11(invo));
	}
}
