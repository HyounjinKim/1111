package org.example.member;

import java.util.Scanner;

public class MemberCLI {
    public Member inputMember(){

        Scanner sc = new Scanner(System.in);

        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("이름 입력");
        String name = sc.nextLine();
        System.out.println("주소 입력");
        String addr = sc.nextLine();
        System.out.println("패스워드 입력");
        String password = sc.nextLine();

        return Member.builder()
                .email(email)
                .password(password)
                .name(name)
                .addr(addr)
                .build();
    }

    public Member loginMember(){

        Scanner sc = new Scanner(System.in);

        System.out.println("이메일 입력");
        String email = sc.nextLine();
        System.out.println("패스워드 입력");
        String password = sc.nextLine();

        return Member.builder()
                .email(email)
                .password(password)
                .build();
//        return new Member(email,null,null,password);
    }
}
