package lab2;

import org.polito.po.Console;

public class LibraryManagement {
	private Console console;
	private Library library;
	
	public LibraryManagement(Console console, Library library) {
		this.console = console;
		this.library = library;
	}
	
	public void start() {
		console.println("Welcome");
		while(true) {
			String author, title, libraryCaseCode;
			int floor, shelf;
			console.print("> ");
			String cmd = console.readLine();
			
			switch(cmd) {
				case "add":
					console.println("BOOK INFORMATION");
					console.print("Author: ");
					author = console.readLine();
					console.print("Title: ");
					title = console.readLine();
					console.println("\nPLACEMENT");
					console.print("Floor: ");
					floor = Integer.parseInt(console.readLine());
					console.print("Library case code: ");
					libraryCaseCode = console.readLine();
					console.print("Shelf: ");
					shelf = Integer.parseInt(console.readLine());
					if(library.addBook(title, author, floor, libraryCaseCode, shelf))
						console.println("Saved.");
					else
						console.println("Error.");
					break;
				case "list":
					console.println("LIST BOOKS");
					console.print("Floor: ");
					floor = Integer.parseInt(console.readLine());
					console.print("Library case code: ");
					libraryCaseCode = console.readLine();
					console.println(library.getBooks(floor, libraryCaseCode));
					break;
				case "book":
					console.println("SEARCH BOOK");
					console.print("Title: ");
					title = console.readLine();
					console.print("Author: ");
					author = console.readLine();
					console.println(library.searchBook(title, author));
					break;
				case "quit":
					console.println("BYE");
					return;
				default:
					console.println("Command unknown.");
					break;
			}
		}
	}
	
	public static void main (String[] args) {
		Console console = new Console();
		Library library = new Library();
		LibraryManagement ui = new LibraryManagement(console, library);
		ui.start();
	}
}
