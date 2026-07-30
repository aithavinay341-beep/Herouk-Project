package com.automation.java_programs;

public class methodwithpara_noreturns_value {

    public void add(int a, int b){
        int sum = a + b;
        System.out.println(sum);
        }

     public static void main(String args[]){
       methodwithpara_noreturns_value obj = new methodwithpara_noreturns_value();
       obj.add(4,5);
    }
    
}
