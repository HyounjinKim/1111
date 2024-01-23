package org.example;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        AA.doB();
        AA a1 = new AA();
        a1.doA();
        System.out.println(a1.getA());

    }
}