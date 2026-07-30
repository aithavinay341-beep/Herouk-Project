package com.automation.java_programs;

public class prime_number {
    public static void main(String args[]){

        for(int i = 0;i<=100;i++){
            int count = 0;
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
    }
    

