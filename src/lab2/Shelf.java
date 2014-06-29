package lab2;

import java.util.ArrayList;

public class Shelf {
	private ArrayList<Book> books;
	private int numBooks;
	
	public Shelf() {
		books = new ArrayList<Book>();
		numBooks = 0;
	}
	
	public boolean addBook(String title, String author, int floor, String libraryCaseCode, int shelf) {
		if(numBooks == 10)
			return false;
		books.add(new Book(title, author, floor, libraryCaseCode, shelf));
		numBooks++;
		return true;
	}
	
	public String getBooks() {
		StringBuffer out = new StringBuffer();
		for(int i = 0; i < books.size(); i++)
			out.append(books.get(i).toString() + "\n");
		return out.toString();
	}
	
	public Book searchBook(String title, String author) {
		Book found;
		
		for(int i = 0; i < books.size(); i++) {
			found = books.get(i);
			/*if(found.equals(title, author))
				return found;*/
			if(found.getAuthor().equals(author) && found.getTitle().equals(title))
				return found;
		}
		
		return null;
	}
}
