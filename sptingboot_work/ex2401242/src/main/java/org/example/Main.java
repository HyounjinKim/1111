package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Friend[] f = new Friend[5];

        f[0] = new UniFriend("honggil","com","0106666666");
        f[1] = new ComFriend("comf","eee","01062224111");
//        System.out.println(f[0]);
//        System.out.println(f[1]);
        System.out.println(Arrays.toString(f));

        List<Friend> list = new ArrayList<>();
        list.add(new UniFriend("honggil","com","0106666666"));
        list.add(new ComFriend("comf","eee","01062224111"));

        System.out.println(list);
    }
}