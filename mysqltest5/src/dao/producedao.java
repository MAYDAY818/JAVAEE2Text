package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.gtalk;
import bean.produce;

public class producedao {
	public List<produce> getproduce(){
		List<produce> List = new ArrayList<produce>();
		Connection conn = database.getConnection();
		PreparedStatement pstmt = null;
		String sql ="select * from produces";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				produce r1=new produce(rs.getInt("id"),
						rs.getString("img"),
						rs.getString("info"),
						rs.getString("price"),
						rs.getString("uri")
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
