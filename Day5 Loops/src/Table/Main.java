package Table;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i =1;i<=10;i++){
            int product =n*i;
            System.out.println(n+" x "+i+" = "+product);
        }

        scanner.close();
    }
}
