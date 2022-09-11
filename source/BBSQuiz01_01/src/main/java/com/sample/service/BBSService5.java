package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO5;

public class BBSService5 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO5 dao = new DataDAO5();
		request.setAttribute("list", dao.selectBBSList());
	}
}
