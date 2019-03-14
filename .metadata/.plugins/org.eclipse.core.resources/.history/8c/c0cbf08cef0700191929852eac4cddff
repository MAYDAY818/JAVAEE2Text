package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.news;

public class newsdao {
	public List<news> getSomeNews(int fromIndex,int count){
		List<news> List = new ArrayList<news>();
		Connection conn = database.getConnection();
		PreparedStatement pstmt = null;
		String sql ="select * from news limit ?,?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fromIndex);
			pstmt.setInt(2, count);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				news n1=new news(rs.getInt("id"),
						rs.getString("title"),
						rs.getString("info"),
						rs.getString("date"),
						rs.getString("img"),
						rs.getString("uri")
						); 
				
				List.add(n1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return List;
		
	}

}
