package com.sample.service;

import javax.servlet.http.HttpServletRequest;

import com.sample.dao.DataDAO7;

public class BBSService7 {
	public void getBBSList(HttpServletRequest request) {
		DataDAO7 dao = new DataDAO7();
		request.setAttribute("list", dao.selectBBSList());
	}
}
