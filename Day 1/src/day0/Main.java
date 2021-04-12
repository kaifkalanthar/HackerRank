package day0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int I = scan.nextInt();
        double D =scan.nextDouble();
        String S =scan.nextLine();
        S= scan.nextLine();
        System.out.println(i+I);
        System.out.println(d+D);
        System.out.println(s+S);

        scan.close();

    }
}
