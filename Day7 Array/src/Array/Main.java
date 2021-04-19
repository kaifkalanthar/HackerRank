package Array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = n-1; i > -1; i--) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
            System.out.println(arrItem);

        }

        scanner.close();
    }
}
