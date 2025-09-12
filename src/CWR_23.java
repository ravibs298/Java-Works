import java.util.Scanner;
class Book{
    String title;
    String author;
    double price;
    Book(){
        title = "unknown";
        author = "unknown";
        price = 0.0;
    }
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: rs" + price);
        System.out.println("_____________________________");
    }
}
public class CWR_23 {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book2 = new Book("Wings of fire", "APJ Abdul Kalam");
        Book book3 = new Book("The Alchemist","Paulo Coelho",399.99);
        book1.display();
        book2.display();
        book3.display();
    }
}