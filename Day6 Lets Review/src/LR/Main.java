package LR;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for (int j=0;j<t;j++) {
            String name = sc.next();
            for (int i = 0; i < name.length(); i = i + 2) {
                System.out.print(name.charAt(i));

            }
            System.out.print(" ");
            for (int i = 1; i < name.length(); i = i + 2) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
