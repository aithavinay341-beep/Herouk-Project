package com.automation.java_programs;

public class one_di_array {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    // one more array declaration and initialization
        int[] arrays = new int[2];
        arrays[0] = 10;
        arrays[1] = 20;
        for(int i=0; i<arrays.length; i++){
            System.out.print(arrays[i] + " ");
    }
}
}