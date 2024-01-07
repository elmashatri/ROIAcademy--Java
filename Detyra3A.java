package Detyra3A;
import java.util.*;

public class Detyra3A {
public static void main (String [] args) {
	
	Scanner esh=new Scanner (System.in);
	
	// Krijimi i objektit te klases Book
	
	Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
    Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
    Book.add_Book(book1);
    Book.add_Book(book2);
    ArrayList < Book > bookCollection = Book.get_BookCollection();
    System.out.println("List of books:");
    for (Book book: bookCollection) {
      System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
    }
    Book.remove_Book(book1);
    System.out.println("\nAfter removing " + book1.get_Title() + ":");
    System.out.println("List of books:");
    for (Book book: bookCollection) {
      System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
    }
	
	// Krijimi i objektit te klases Temperatura
	double temp=100.5;
	char ch='F';
	
	Temperatura temp1=new Temperatura (temp,ch);
	
	System.out.println("Temperatura 1:");
	if(ch=='c' || ch=='C') {
		System.out.println("Vlera ne Celsius:"+temp1.tempCelsius());
	}else {
		System.out.println("Vlera ne Farenheit:"+temp1.tempFarenheit());
	}
	
}
}

// Detyra 1
class Book {
	  private String title;
	  private String author;
	  private String ISBN;
	  private static ArrayList < Book > bookCollection = new ArrayList < Book > ();

	  public Book(String title, String author, String ISBN) {
	    this.title = title;
	    this.author = author;
	    this.ISBN = ISBN;
	  }

	  public String get_Title() {
	    return title;
	  }

	  public void set_Title(String title) {
	    this.title = title;
	  }

	  public String get_Author() {
	    return author;
	  }

	  public void set_Author(String author) {
	    this.author = author;
	  }

	  public String get_ISBN() {
	    return ISBN;
	  }

	  public void set_ISBN(String ISBN) {
	    this.ISBN = ISBN;
	  }

	  public static void add_Book(Book book) {
	    bookCollection.add(book);
	  }

	  public static void remove_Book(Book book) {
	    bookCollection.remove(book);
	  }

	  public static ArrayList < Book > get_BookCollection() {
	    return bookCollection;
	  }
	}

// Detyra 2
class Temperatura{
	
	private double temp;
	private char ch;
	
	public Temperatura(double temp, char ch) {
		this.temp=temp;
		this.ch=ch;
	}
	
	public double getTemp() {
		return this.temp;
	}
	
	public void setTemp(double temp) {
		this.temp=temp;
	}
	
	public char getCh() {
		return this.ch=ch;
	}
	
	public void setCh(char ch) {
		this.ch=ch;
	}
	
	public double tempCelsius() {
		return (this.temp-32)*5/9;
	}
	
	public double tempFarenheit() {
		return (this.temp*9/5)+32;
	}
	
}

// Detyra 3
/*

 Problemi qendron te metoda 'depozito(double sasia)', te this.balanca=sasia. Pra, qe te mund te shfaqet edhe vlera negative e balnces, kjo duhet te jete this.balanca+=sasia;

 */
