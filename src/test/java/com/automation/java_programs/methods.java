package com.automation.java_programs;

public class methods {
    // 1. No Parameters + No Return
    public void method1() {
        System.out.println("Method 1");
    }

    // 2. No Parameters + Return
    public int method2() {
        return 100;
    }

    // 3. Parameters + No Return
    public void method3(int a, int b) {
        System.out.println(a + b);
    }

    // 4. Parameters + Return 
    public int method4(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        methods obj = new methods();
        obj.method1();
        System.out.println(obj.method2());
        obj.method3(4,5);
        System.out.println(obj.method4(4,3));

    }
    
}
