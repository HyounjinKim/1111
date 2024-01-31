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
			PreparedStatement pstmt = con.prepareStatement("select * from hint where num=1");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("hint"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
