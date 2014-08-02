package lab2;

public class LibraryCase {
	private Shelf[] shelves;
	private int code;
	
	public LibraryCase(int code) {
		shelves = new Shelf[6];
		for(int i = 0; i < shelves.length; i++)
			shelves[i] = new Shelf();
		this.code = code;
	}
	
	public String getCode() {
		return "SC" + String.valueOf(code);
	}
	
	public boolean addBook(String title, String author, int floor, String libraryCaseCode, int shelf) {
		return shelves[shelf].addBook(title, author, floor, libraryCaseCode, shelf);
	}
	
	public String getBooks() {
		StringBuffer out = new StringBuffer();
		
		for(int i = 0; i < shelves.length; i++) {
			out.append("Shelf " + String.valueOf(i) + "\n");
			out.append(shelves[i].getBooks());
		}
		
		return out.toString();
	}
	
	public Book searchBook(String title, String author) {
		Book found;
		
		for(int i = 0; i < shelves.length; i++) {
			if((found = shelves[i].searchBook(title, author)) != null)
				return found;
		}
		
		return null;
	}
}
