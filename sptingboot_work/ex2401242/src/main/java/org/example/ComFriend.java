package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class ComFriend extends Friend {

    private String department;

    public ComFriend(String name, String department, String phone) {
        super(name,phone);
        this.department = department;
    }

    @Override
    public String toString() {
        return "ComFriend{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
