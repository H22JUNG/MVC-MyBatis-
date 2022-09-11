package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO4;

public class BBSService4 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO4 dao = new DataDAO4();
		request.setAttribute("list", dao.selectBBSList());
	}
}
