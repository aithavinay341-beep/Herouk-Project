package com.automation.java_programs;

public class reversing_string {
    public static void main(String[] args) {

        String name= "MADAM";
        String reversedName = " ";

    for(int i = name.length() - 1; i >= 0; i--)
        {
            reversedName = name.charAt(i) + reversedName;
        }

        System.out.println(reversedName);
    
    
}
}