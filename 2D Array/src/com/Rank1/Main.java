package com.Rank1;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int[][] arr = new int[6][6];
        int Row1=0;
        int Row2=0;
        int Row3=0;
        int Row4=0;

        int Row11=0;
        int Row12=0;
        int Row13=0;
        int Row14=0;

        int Row21=0;
        int Row22=0;
        int Row23=0;
        int Row24=0;

        int Row31=0;
        int Row32=0;
        int Row33=0;
        int Row34=0;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                Row1 =arr[0][0]+arr[0][1]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][1]+arr[2][2];
                Row2 =arr[0][1]+arr[0][2]+arr[0][3]+arr[1][2]+arr[2][1]+arr[2][2]+arr[2][3];
                Row3=arr[0][2]+arr[0][3]+arr[0][4]+arr[1][3]+arr[2][2]+arr[2][3]+arr[2][4];
                Row4=arr[0][3]+arr[0][4]+arr[0][5]+arr[1][4]+arr[2][3]+arr[2][4]+arr[2][5];

                Row11 =arr[1][0]+arr[1][1]+arr[1][2]+arr[2][1]+arr[3][0]+arr[3][1]+arr[3][2];
                Row12 =arr[1][1]+arr[1][2]+arr[1][3]+arr[2][2]+arr[3][1]+arr[3][2]+arr[3][3];
                Row13=arr[1][2]+arr[1][3]+arr[1][4]+arr[2][3]+arr[3][2]+arr[3][3]+arr[3][4];
                Row14=arr[1][3]+arr[1][4]+arr[1][5]+arr[2][4]+arr[3][3]+arr[3][4]+arr[3][5];

                Row21 =arr[2][0]+arr[2][1]+arr[2][2]+arr[3][1]+arr[4][0]+arr[4][1]+arr[4][2];
                Row22 =arr[2][1]+arr[2][2]+arr[2][3]+arr[3][2]+arr[4][1]+arr[4][2]+arr[4][3];
                Row23=arr[2][2]+arr[2][3]+arr[2][4]+arr[3][3]+arr[4][2]+arr[4][3]+arr[4][4];
                Row24=arr[2][3]+arr[2][4]+arr[2][5]+arr[3][4]+arr[4][3]+arr[4][4]+arr[4][5];

                Row31 =arr[3][0]+arr[3][1]+arr[3][2]+arr[4][1]+arr[5][0]+arr[5][1]+arr[5][2];
                Row32 =arr[3][1]+arr[3][2]+arr[3][3]+arr[4][2]+arr[5][1]+arr[5][2]+arr[5][3];
                Row33=arr[3][2]+arr[3][3]+arr[3][4]+arr[4][3]+arr[5][2]+arr[5][3]+arr[5][4];
                Row34=arr[3][3]+arr[3][4]+arr[3][5]+arr[4][4]+arr[5][3]+arr[5][4]+arr[5][5];

            }
        }

        int []Array =new int[]{Row1,Row2,Row3,Row4,Row11,Row12,Row13,Row13,Row14,Row21,Row22,Row23,Row24,
                Row31,Row32, Row33,Row34};

        int max=Array[0];

        for (int i=0;i< Array.length;i++){
            if (Array[i]>max){
                max =Array[i];
            }
        }
        System.out.println(max);

    }
}
