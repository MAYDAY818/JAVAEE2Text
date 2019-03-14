package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.DataRead;



public class readdao {
	public List<DataRead> getSomeReads(int fromIndex,int count){
		List<DataRead> List = new ArrayList<DataRead>();
		Connection conn = database.getConnection();
		PreparedStatement pstmt = null;
		String sql ="select * from articles limit ?,?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, fromIndex);
			pstmt.setInt(2, count);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				DataRead n1=new DataRead(rs.getInt("id"),
						rs.getString("title"),
						rs.getString("info"),
						
						rs.getString("img"),
						rs.getString("uri"),
						rs.getString("date")
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
