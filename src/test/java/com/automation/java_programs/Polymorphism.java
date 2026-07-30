package com.automation.java_programs;

public class Polymorphism {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]){
        Polymorphism obj = new Polymorphism();
        int sum1 = obj.add(5, 10);
        System.out.println(sum1);
        
        System.out.println(obj.add(1,2,3));
    }
    
}
