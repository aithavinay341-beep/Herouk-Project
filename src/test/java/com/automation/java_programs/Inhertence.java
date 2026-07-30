package com.automation.java_programs;

public class Inhertence {
    public void display() {
        System.out.println("This is Inheritance");
    }
    public static void main(String args[]) {
    ChildClass child = new ChildClass();
    child.display();
}
}

class ChildClass extends Inhertence {

}

