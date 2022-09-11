package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO3;

public class BBSService3 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO3 dao = new DataDAO3();
		request.setAttribute("list", dao.selectBBSList());
	}
}
