package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {

	public void insert(int score) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("insert into score" + "(`score`)" + "values" + "(?)");
			pstmt.setInt(1, score);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select() {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select score from (`score`)" + "order by (`score`) desc " + "limit 5");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("score"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
