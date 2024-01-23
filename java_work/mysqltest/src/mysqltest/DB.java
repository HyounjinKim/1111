package mysqltest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB {
	Scanner sc = new Scanner(System.in);

	public void insert(String id, String pasword) {
		System.out.println("DB에 할일입력");

		// 예외처리
		// DB 아이디 비번이 틀렸다
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con
					.prepareStatement("INSERT INTO test " + "(`id`, `pasword`) " + "VALUES " + "(?, ?); ");
			
			pstmt.setString(1, id);
			pstmt.setString(2, pasword);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selcet() {
		System.out.println("DB에 할일목록 보여주기");
		try {
			Connection con = DriverManager.getConnection(INFO.JDBC_URL, INFO.USERNAME, INFO.PASSWORD);
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM test");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("idx"));
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("pasword"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
