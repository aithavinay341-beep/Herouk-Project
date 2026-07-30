package com.automation.java_programs;

public class nested_if {

    // Writeing  if inside another if is called nested if

    public static void main(String args[]){

        int age = 25;
        if(age > 18){
            boolean userhasVoterIdCard = true;
            if(userhasVoterIdCard){
                System.out.println("Eligible for voting");
            }
            else{
                System.out.println("Not eligible for voting");
            }
        }

    }
    
}
