package org.example.mh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private String email;
    private String name;
    private String addr;
    private String password;
}
