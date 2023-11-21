package oops;
/*Create a Book class with the following attributes:
title (String)
author (String)
isbn (String)
year (int)
Implement three constructors for the Book class:

Default constructor that sets default values for title, author, isbn, and year.
Constructor that takes title, author, and isbn as parameters and sets the year to the current year (use java.time.Year).
Constructor that takes all four attributes as parameters.*/

//importing year to sets the year to the current year.
import java.time.Year;
public class Book 
{
    private String title;
    private String author;
    private String isbn;
    private int year;
    
    
    //Default constructor for title, author, isbn, and year.
	public Book() 
	{
		title = "ACCIDENTS DO NOT HAPPEN";
		author = "Dr Sankar Rajeev";
		isbn="978-81-933904-8-1";
		year= 2018;
	}

	//Constructor for title, author, and isbn as parameters and sets the year to the current year
	public Book(String title, String author, String isbn) 
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = Year.now().getValue();
	}
    
	//Constructor for title, author, isbn, and year.
	public Book(String title, String author, String isbn, int year) 
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
	}

	//getter methods for title
    public String getTitle()
    {
    	return title;
    }
    
    //getter methods for author
    public String getAuthor()
    {
    	return author;
    }
    
    //getter methods for isbn
    public String getIsbn()
    {
    	return isbn;
    }
    
    //getter methods for year
    public int getYear()
    {
    	return year;
    }

	public static void main(String[] args) 
	{
		// Creating objects using different constructors
		Book Book1 = new Book();//Default constructor
		Book Book2 = new Book("SANSRITI", "Dr.Vibha Manoj Sharma", "978-81-933904-0-5");// Constructor with title, author and isbn as parameter
		Book Book3 = new Book("An Eco-Critical Appraisal of the Selected Novels of Amitav Ghosh","Rabia Mukhtar", "978-81-933904-9-8",2018);// Constructor with title, author,isbn, and year as parameters
		
		// Getting information using getter methods
		System.out.println(" Title is:  " +  Book1.getTitle()  + " ||  Author is : " + Book1.getAuthor() + " || Isbn is : " +  Book1.getIsbn()  + " || Year is:  " + Book1.getYear());
		System.out.println(" Title is: "+Book2.getTitle() + " || Author is : " + Book2.getAuthor() + " ||  Isbn is :" + Book2.getIsbn() + " || Year is: " + Book2.getYear());
		System.out.println(" Title is: "+Book3.getTitle() + " || Author is : " + Book3.getAuthor() + " || Isbn is :" + Book3.getIsbn() + " || Year is: " + Book3.getYear());

	}
}


