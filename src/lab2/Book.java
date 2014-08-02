package lab2;

public class Book {
	private String title;
	private String author;
	private int shelf;
	private String libraryCase;
	private int floor;
	
	public Book(String title, String author, int floor, String libraryCaseCode, int shelf) {
		this.title = title;
		this.author = author;
		this.floor = floor;
		this.libraryCase = libraryCaseCode;
		this.shelf = shelf;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		title = "Title";
		author = "Author";
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getShelf() {
		return shelf;
	}
	
	public String getLibraryCase() {
		return libraryCase;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public String toString() {
		return title + ", " + author;
	}
	
	public boolean equals(String title, String author){
		System.out.println(title + " ? " + this.title);
		System.out.println(author + " ? " + this.author);
		if(this.title.equals(title) && this.author.equals(title))
			return true;
		else
			return false;
	}
}
