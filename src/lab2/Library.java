package lab2;

public class Library {
	private Floor[] floors;
	
	public Library() {
		floors = new Floor[3];
		for(int i = 0; i < floors.length; i++)
			floors[i] = new Floor();
	}
	
	public boolean addBook(String title, String author, int floor, String libraryCaseCode, int shelf) {
		return floors[floor].addBook(title, author, floor, libraryCaseCode, shelf);
	}
	
	public String getBooks(int floor, String libraryCaseCode) {
		return floors[floor].getBooks(libraryCaseCode);
	}
	
	public String searchBook(String title, String author) {
		Book found;
		
		for(int i = 0; i < floors.length; i++) {
			if((found = floors[i].searchBook(title, author)) != null)
				return "Found at floor " + found.getFloor() +
					   ", library case code " + found.getLibraryCase() +
					   ", shelf " + found.getShelf();
		}
		
		return "Not found.";
	}
}
