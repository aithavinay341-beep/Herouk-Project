package com.automation.java_programs;

public class two_di_array {

    public static void main(String[] args) {

        int[][] arr = {
            {11,22,33},
            {44,55,66}
        };

        for (int[] element : arr) {
            for(int j=0;j<element.length;j++){
                System.out.print(element[j]+" ");
            }
            System.out.println();
        }

        int[][] arrat = new int[2][3];

        arrat[0][0] = 10;
        arrat[0][1] = 20;
        arrat[0][2] = 30;
        arrat[1][0] = 40;
        arrat[1][1] = 50;
        arrat[1][2] = 60;
        // System.out.println(arrat[0][0]);
    }
}