package lab2;

public class Floor {
	private LibraryCase[] libraryCases;
	
	public Floor() {
		libraryCases = new LibraryCase[30];
		for(int i = 0; i < libraryCases.length; i++)
			libraryCases[i] = new LibraryCase(i);
	}
	
	private int getIndex(String code) {
		return Integer.parseInt(code.substring(2));
	}
	
	public boolean addBook(String title, String author, int floor, String libraryCaseCode, int shelf) {
		return libraryCases[getIndex(libraryCaseCode)].addBook(title, author, floor, libraryCaseCode, shelf);
	}
	
	public String getBooks(String libraryCaseCode) {
		return libraryCases[getIndex(libraryCaseCode)].getBooks();
	}
	
	public Book searchBook(String title, String author) {
		Book found;
		
		for(int i = 0; i < libraryCases.length; i++) {
			if((found = libraryCases[i].searchBook(title, author)) != null)
				return found;
		}
		
		return null;
	}
}
