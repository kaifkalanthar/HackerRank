package Abstract;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book{
    // String title ;
    //String author;
    int price;
    public MyBook(String title, String author,int price){
        super(title,author);
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
