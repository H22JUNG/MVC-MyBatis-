package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO6;

public class BBSService6 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO6 dao = new DataDAO6();
		request.setAttribute("list", dao.selectBBSList());
	}
}
