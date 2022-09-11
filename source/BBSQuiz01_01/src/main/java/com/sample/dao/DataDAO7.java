package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.conn.JDBCConnection;
import com.sample.vo.BBSVO2;

public class DataDAO7 {
	private PreparedStatement pstmt;
	private ResultSet rs;

	public List<BBSVO2> selectBBSList() {

		ArrayList<BBSVO2> list = new ArrayList<BBSVO2>();
		Connection conn = JDBCConnection.getConn();

		try {
			String query = "select id, title, owner, content, "
					+ "date_format(create_date, '%Y-%m-%d') date, "
					+ "date_format(create_date, '%T') time "
					+ "from bbs order by create_date desc";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BBSVO2 vo = new BBSVO2();
				vo.setId(rs.getInt("id"));
				vo.setTitle(rs.getString("title"));
				vo.setOwner(rs.getString("owner"));
				vo.setContent(rs.getString("content"));
				vo.setDate(rs.getString("date"));
				vo.setTime(rs.getString("time"));
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
