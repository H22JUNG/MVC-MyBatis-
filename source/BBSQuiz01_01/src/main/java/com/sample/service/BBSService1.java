package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO1;

public class BBSService1 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO1 dao = new DataDAO1();
		request.setAttribute("list", dao.selectBBSList());
	}
}
