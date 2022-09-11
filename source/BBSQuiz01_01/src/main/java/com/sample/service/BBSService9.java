package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO9;

public class BBSService9 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO9 dao = new DataDAO9();
		request.setAttribute("list", dao.selectBBSList());
		request.setAttribute("cnt", dao.selectBBSCount());
	}
}
