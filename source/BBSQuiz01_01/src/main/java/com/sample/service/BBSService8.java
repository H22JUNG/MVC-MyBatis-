package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO8;

public class BBSService8 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO8 dao = new DataDAO8();
		request.setAttribute("list", dao.selectBBSList());
	}
}
