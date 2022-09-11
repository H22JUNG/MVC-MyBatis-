package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO2;

public class BBSService2 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO2 dao = new DataDAO2();
		request.setAttribute("list", dao.selectBBSList());
	}
}
