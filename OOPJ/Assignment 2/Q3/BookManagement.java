/**
    Book Inventory Management System
        You are required to write a Java program to implement a Book class that can be used to manage 
        a book inventory system. 
        The Book class should have the following fields:
            a. title: A string field to store the title of the book.
            b. author: A string field to store the name of the author of the book.
            c. publisher: A string field to store the name of the publisher of the book.
            d. isbn: A string field to store the ISBN number of the book.
            e. year: An integer field to store the year in which the book was published.
            f. price: A double field to store the price of the book.
            g. quantity: An integer field to store the quantity of the book in the inventory.

        The Book class should have following methods

            a. Constructors, 
            b. Getter & setter methods
            c. Business Logic methods
                I. increaseQuantity(int quantity ): A method to increase the quantity of the book in 
                    the inventory by the specified amount.
                II. decreaseQuantity(int quantity): A method to decrease the quantity of the book in 
                    the inventory by the specified amount.
                III. getInventoryValue(): A method to calculate the total value of the inventory of 
                    the book, which is the product of the price and the quantity of the book.
 */
import java.util.*;
 class Book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    Book(){
        //Parameterless constructor
    }
    void setTitle(String title){
        this.title=title;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPublisher(String publisher){
        this.publisher=publisher;
    }
    void setIsbn(String isbn){
        this.isbn=isbn;
    }
    void setYear(int year){
        this.year=year;
    }
    void setPrice(double price){
        this.price=price;
    }
    void setQuantity(int quant){
        this.quantity=quant;
    }
    //Getter

    String getTitle( ){
        return this.title;
    }
    String getAuthor( ){
        return this.author;
    }
    String getPublisher( ){
       return this.publisher;
    }
    String getIsbn( ){
      return this.isbn;
    }
    int getYear( ){
       return this.year;
    }
    double getPrice( ){
       return this.price;
    }
    int getQuantity( ){
      return this.quantity;
    }


 }
class Operations{
    Book bookObj= new Book();
    Scanner sc=new Scanner(System.in);

    void acceptBook(){
        System.out.println("Enter the book details ::");
        System.out.print("Title : ");
        bookObj.setTitle(sc.nextLine());
        System.out.print("Author : ");
        bookObj.setAuthor(sc.nextLine());
        System.out.print("Publisher : ");
        bookObj.setPublisher(sc.nextLine());
        System.out.print("Isbn : ");
        bookObj.setIsbn(sc.nextLine());
        System.out.print("Year : ");
        bookObj.setYear(sc.nextInt());
        System.out.print("Price : ");
        bookObj.setPrice(sc.nextDouble());
        System.out.print("Quantity : ");
        bookObj.setQuantity(sc.nextInt());
    }
    void increaseQuantity(int quantity ){
        bookObj.setQuantity(bookObj.getQuantity()+quantity);
        System.out.println("Book Title : "+bookObj.getTitle()+" quantity increased by 500 to - "+bookObj.getQuantity());
    }
    void decreaseQuantity(int quantity){
        bookObj.setQuantity(bookObj.getQuantity()-quantity);
        System.out.println("Book Title : "+bookObj.getTitle()+" quantity decreased by 100 to - "+bookObj.getQuantity());
    }
    void getInventoryValue(){
        System.out.println("Total value of the inventory of the book Title : "+bookObj.getTitle()+" is - "+(bookObj.getQuantity()*bookObj.getPrice()));
    }
}
 class BookManagement{
    public static void main(String args[]){
        Operations op =new Operations();
        op.acceptBook();
        op.increaseQuantity(500);
        op.decreaseQuantity(100);
        op.getInventoryValue();
    }
 }