package org.example;

import org.example.mh.Member;
import org.example.mh.MemberDB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDB md = new MemberDB();

        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("이름 입력");
        String name = sc.nextLine();
        System.out.println("주소 입력");
        String addr = sc.nextLine();
        System.out.println("패스워드 입력");
        String password = sc.nextLine();

        Member member = new Member(email,name,addr,password);

        md.insert(member);
    }
}