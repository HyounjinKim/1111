package org.example;

class Man{
    private String name;

    Man(){
        super();
        System.out.println("부모생성자");
    }
    Man(String name){
        this.name = name;
    }
    public  void yourName(){
        System.out.println("name = " + name);
    }
}

class BusinesMan extends Man{
    private String company;
    private String position;

    BusinesMan(){
        super();
        System.out.println("기본생성자");
    }
    BusinesMan(String company,String position,String name){
        super(name);
        System.out.println("다른생성자");
        this.company = company;
        this.position = position;
    }

    public void yourInfo(){
        System.out.println("company = " + company);
        System.out.println("position = " + position);
        yourName();
    }
}

public class Main1 {
    public static void main(String[] args) {
    BusinesMan bm1 = new BusinesMan("그린","학생","김씨");
    bm1.yourInfo();
    }
}
