package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {

	public void insert(String score) {
		try {
			
			Connection con = DriverManager.getConnection(Info.url,Info.userid,Info.password);
			PreparedStatement pstmt = con.prepareStatement("insert into test" + 
														   "(`score`)" + 
															"values " + "(?)");
			
//			con.prepareStatement("INSERT INTO test " + "(`score`) " + "VALUES " + "(?); ");
			pstmt.setString(1, score);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
