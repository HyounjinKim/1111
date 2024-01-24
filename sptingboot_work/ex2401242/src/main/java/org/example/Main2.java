package org.example;

class ParentAdder{
    public void add(int num1,int num2){
        System.out.println("합 " + (num1+num2));
    }
}

class ChilldAeedr extends ParentAdder{

    @Override
    public void add(int num1, int num2) {
        System.out.println("덧셈 진행");
        super.add(num1, num2);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ChilldAeedr ca = new ChilldAeedr();
        ca.add(10,20);
    }
}
