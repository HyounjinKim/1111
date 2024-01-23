package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {
	Scanner sc = new Scanner(System.in);

	public void insert(String score) {
		try {

			Connection con = DriverManager.getConnection(Info.url, Info.userid, Info.password);
			PreparedStatement pstmt = con.prepareStatement("insert into test" + "(`score`)" + "values " + "(?)");

//			con.prepareStatement("INSERT INTO test " + "(`score`) " + "VALUES " + "(?); ");
			pstmt.setString(1, score);

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void select() {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.userid, Info.password);
			PreparedStatement pstmt = con.prepareStatement("SELECT h.word\r\n" + "     , `SUBJECT`\r\n"
					+ "     , GROUP_CONCAT(hint SEPARATOR  ',') AS \"hint\"\r\n" + "  FROM word w\r\n"
					+ "  JOIN word_hint h\r\n" + "    ON h.word = w.word\r\n" + " GROUP BY h.word\r\n"
					+ " ORDER BY 2 ASC");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("hint"));
//				System.out.println(rs.getString("word"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
