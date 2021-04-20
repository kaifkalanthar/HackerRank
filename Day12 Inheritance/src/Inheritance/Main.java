package Inheritance;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
    private String firstName;
    private String lastName;
    private int identification;
    int a =0;
    Student(String firstName, String lastName, int identification,int [] testScores){
        super(firstName,lastName,identification);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identification = identification;
        this.testScores=testScores;
    }

    public char calculate(){
        for(int i =0; i<testScores.length;i++){
            a =a+testScores[i];
        }
        a=a/testScores.length;
        if(a>=90 && a<=100){
            return 'O';
        }
        else if(a>=80 && a<90){
            return 'E';
        }
        else if(a>=70 && a<80){
            return 'A';
        } else if(a>=55 && a<70){
            return 'P';
        } else if(a>=40 && a<45){
            return 'D';
        }
        else if (a<45){
            return 'T';
        }
        return ' ';
    }

}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: "+s.calculate());
    }
}
