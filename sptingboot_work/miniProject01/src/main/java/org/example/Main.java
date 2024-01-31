package org.example;

import org.example.item.ItemDB;
import org.example.member.Member;
import org.example.member.MemberDB;
import org.example.util.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MemberDB md = new MemberDB();
        ItemDB id = new ItemDB();

        while (true) {

            int select = 0;

            if (Login.member != null && Login.getRole().equalsIgnoreCase("admin"))
                select = printMenuAdmin();
            else
                select = printMenuUser();

            if (select == 1) {
                md.insert();
            } else if (select == 2) {
                if(!Login.login){
                    Member dbmember = md.login();
                    System.out.println("dbMember = " + dbmember);
                    if (dbmember!=null){
                        Login.login = true;
                        Login.member = dbmember;
                    }
                }else {
                    System.out.println("이미 로그인하셨습니다");
                }

            }
            else if(select == 3){
                if(!Login.login){
                    System.out.println("로그인을 하셔야 로그아웃 할 수 있습니다.");
                }
                else {
                    Login.login = false;
                    Login.member = null;
                    System.out.println("로그아웃 하셨습니다.");
                }
            }
            else if (select == 7) {
                System.out.println("종료됩니다");
                System.exit(0);
            }
            else if(select == 8 && Login.member != null && Login.getRole().equalsIgnoreCase("admin")){
                try {
                    id.insert();
                    System.out.println("상품등록 성공");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static int printMenuUser(){
        System.out.println("1.회원가입");
        System.out.println("2.로그인");
        System.out.println("3.로그아웃");
        System.out.println("4.물품보기");
        System.out.println("5.장바구니");
        System.out.println("6.주문목록");
        System.out.println("7.종료");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        return menu;
    }

    public static int printMenuAdmin(){
        System.out.println("1.회원가입");
        System.out.println("2.로그인");
        System.out.println("3.로그아웃");
        System.out.println("4.물품보기");
        System.out.println("5.장바구니");
        System.out.println("6.주문목록");
        System.out.println("7.종료");
        System.out.println("8.상품등록");
        System.out.println("9.회원목록");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        return menu;
    }
}