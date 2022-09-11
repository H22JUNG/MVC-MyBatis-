package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.conn.JDBCConnection;
import com.sample.vo.BBSVO1;

public class DataDAO2 {
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<BBSVO1> selectBBSList() {

		ArrayList<BBSVO1> list = new ArrayList<BBSVO1>();
		Connection conn = JDBCConnection.getConn();

		try {
			String query = "select id, title, owner, content, "
					+ "date_format(create_date, '%Y-%m-%d %T') create_date "
					+ "from bbs order by id desc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BBSVO1 vo = new BBSVO1();
				vo.setId(rs.getInt("id"));
				vo.setTitle(rs.getString("title"));
				vo.setOwner(rs.getString("owner"));
				vo.setContent(rs.getString("content"));
				vo.setCreateDate(rs.getString("create_date"));
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}
}
