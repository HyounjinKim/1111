package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Collection;

public class DB {
	
	Scanner sc = new Scanner(System.in);

	public void vInsertl() {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("insert into user (`id`,`password`) values ('aa','11')");

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cTable() {

		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement(
					"create table hint (hint varchar(255) not null,type varchar(255) not null,key(type))");

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void dropTable() {

		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("drop table hint");

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<String> wordList(String type) {
		List<String> word = new ArrayList<String>();
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select * from word where type='" + type + "'");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				word.add(rs.getString("word"));
			}
			return word;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return word;
	}

	public List<String> hintList(List<String> hint, String word) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select * from hint where word='" + word + "'");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				hint.add(rs.getString("hint"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hint;
	}

	public void rankInsert(int score, String type,String user_id) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("insert into ranking (`score`,`type`,`id`) values (?,?,?)");

			pstmt.setInt(1, score);
			pstmt.setString(2, type);
			pstmt.setString(3, user_id);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void rankList() {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement(
					"select rank() over (order by score desc) as ranking,score,type,id from ranking limit 5");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("ranking") + "등 " + rs.getString("score") + "점 " + rs.getString("type") + " " + rs.getString("id") + "님");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void idCheck(String user_id) {
		User cu = new User();
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select id from user where id='" + user_id+"'");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				if(rs.getString("id").equals(user_id)) {
					System.out.println("중복된 아이디입니다.");
					System.out.println("아이디를 다시 입력해주세요.");
					cu.dupl = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String userCheck(String user_id,String password) {
		User cu = new User();
		String str1 = user_id + "님 반갑습니다.";
		String str2 = "아이디와 비밀번호를 다시 입력해주세요";
		
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select * from user");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				if(rs.getString("id").equals(user_id) && rs.getString("password").equals(password)) {
					cu.dupl = false;
					return str1;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str2;
	}
	
	public void cUser(String id,String password) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("insert into user (id,password) values (?,?)");
			
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			pstmt.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void userSec(String user_id) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("delete from user where id='"+user_id+"'");
			PreparedStatement pstmt1 = con.prepareStatement("delete from ranking where id='"+user_id+"'");
			PreparedStatement pstmt2 = con.prepareStatement("delete from board where id='"+user_id+"'");
			
			pstmt.executeUpdate();
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void boardList() {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select rank() over(order by idx desc) as num,com,id from board limit 5 ");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("num")+" "+rs.getString("com")+" "+rs.getString("id"));
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myBoardList1(String user_id) {
		List<String> list = new ArrayList<String>();
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select idx,com,id from board where id='"+user_id+"'");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("idx")+" "+rs.getString("com")+" "+rs.getString("id"));
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<String> myBoardList2(String user_id) {
		List<String> list = new ArrayList<String>();
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("select idx,com,id from board where id='"+user_id+"'");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(rs.getString("idx"));
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void myBoardDel(String comNum) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("delete from board where idx='"+comNum+"'");
			
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void comInsert(String com,String id) {
		try {
			Connection con = DriverManager.getConnection(Info.url, Info.user, Info.pass);
			PreparedStatement pstmt = con.prepareStatement("insert into board (com,id) values (?,?)");
			
			pstmt.setString(1, com);
			pstmt.setString(2, id);
			
			pstmt.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
