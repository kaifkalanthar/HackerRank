package Pn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int sum =0;
        System.out.println("Enter a number");
        long no =sc.nextLong();
        for (int i =1;i<=no;i++){
            if (no%i ==0){
                sum+=i;
            }
        }
        if (sum ==no+1){
            System.out.println("prime");
        }
        else if(no==1){
            System.out.println("Not prime");
        }
        else {
            System.out.println("Not prime");
        }

    }
}
