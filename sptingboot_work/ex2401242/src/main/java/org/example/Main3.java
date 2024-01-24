package org.example;

public class Main3 {
    public static void main(String[] args) {
        Print prn = new Print();
        prn.print();

        Printerble printerble = new Printerble() {
            @Override
            public void print() {
                System.out.println("인터페이스");
            }
        };
        printerble.print();

        Printerble lamda1 = ()->{
            System.out.println("람다");
        };
        lamda1.print();
    }

}
