package Hackerrank;

import java.util.Scanner;

public class Main {
    static void solve(double meal_cost, double tip_percent, double tax_percent) {
        tip_percent = (tip_percent/100)*meal_cost;
        tax_percent = (tax_percent/100)*meal_cost;
        double total =meal_cost+tip_percent+tax_percent;
        int total1 =(int) Math.round(total);
        System.out.println(total1);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
