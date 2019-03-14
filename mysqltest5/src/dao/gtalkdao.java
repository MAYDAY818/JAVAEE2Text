package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.gtalk;


public class gtalkdao {
	public List<gtalk> getgtalks(){
		List<gtalk> List = new ArrayList<gtalk>();
		Connection conn = database.getConnection();
		PreparedStatement pstmt = null;
		String sql ="select * from gtalk";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				gtalk r1=new gtalk(rs.getInt("id"),
						rs.getString("icon"),
						rs.getString("name"),
						rs.getString("date"),
						rs.getString("title"),
						rs.getString("img"),
						rs.getString("content")
						); 
				
				List.add(r1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return List;
		
	}
	

}
