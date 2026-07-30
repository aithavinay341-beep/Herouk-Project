package com.automation.java_programs;

public class strings {
    public static void main(String[] args){

        String name = "Vinay A";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("A"));
        System.out.println(name.substring(0, 5));
        System.out.println(name.substring(6));
        System.out.println(name.replace("A", "B"));
        System.out.println(name.equals("Vinay A"));
        System.out.println(name.equalsIgnoreCase("vinay a"));
        System.out.println(name.trim());
        System.out.println(name.split(" ")[0]);
        System.out.println(name.split(" ")[1]);
        System.out.println(name.contains("Vinay"));
        System.out.println(name.startsWith("V"));
        System.out.println(name.endsWith("A"));
        System.out.println(name.isEmpty());


        String name2 = "   ";
        System.out.println(name2);
        System.out.println(name2.isEmpty());
        System.out.println(name2.trim().isEmpty());

    }
    
}
