package org.example.member;

import org.example.DBINFO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDB {
    private MemberCLI cli = new MemberCLI();
    
    public void insert(){
        Member member = cli.inputMember();
       boolean result = findByEmail(member.getEmail());

        if(!result) {
            try {
                Connection con = (Connection) DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.password);
                PreparedStatement pstmt = con.prepareStatement("insert into member " +
                        "(reg_time, update_time, created_by, modified_by," +
                        " address, email, name, password, role) " +
                        "values " +
                        "(now(),now(),'','',?,?,?,?,'user') ");
                pstmt.setString(1, member.getAddr());
                pstmt.setString(2, member.getEmail());
                pstmt.setString(3, member.getName());
                pstmt.setString(4, member.getPassword());
                pstmt.executeUpdate();
                System.out.printf("입력되었습니다");
            } catch (Exception e) {
                System.out.printf("여기");
                e.printStackTrace();
            }
        }
        else {
            System.out.println("중복 회원가입 실패");
        }
        
    }

    public boolean findByEmail(String email){
        try {
            Connection con = DriverManager.getConnection(DBINFO.url,DBINFO.user,DBINFO.password);
            PreparedStatement pstmt = con.prepareStatement("select * from member where email=?");
            pstmt.setString(1,email);

            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public Member login() {
        Member member = cli.loginMember();

        try {
            Connection con = DriverManager.getConnection(DBINFO.url,DBINFO.user,DBINFO.password);
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM member\n" +
                    "WHERE email=? AND PASSWORD=?");
            pstmt.setString(1,member.getEmail());
            pstmt.setString(2,member.getPassword());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                member.setRole(rs.getString("role"));
                return member;
            }else{
                System.out.println("이메일과 패스워드를 확인해주세요.WWWWW");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
