package org.example.member;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class Member {
    private String email;
    private String name;
    private String addr;
    private String password;
    private String role;
}
