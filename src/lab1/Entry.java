package lab1;

public class Entry {
	private String name;
	private String surname;
	private String phoneNumber;
	
	public Entry(String name, String surname, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
	}
	
	public Entry() {
		this.name = new String("John");
		this.surname = new String("Doe");
		this.phoneNumber = new String("+33 (0)3 32 12 43");
	}
	
	public boolean findMe(String str) {
		if(str.equalsIgnoreCase(name) || str.equalsIgnoreCase(surname) || str.equalsIgnoreCase(phoneNumber))
			return true;
		else
			return false;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return name + " " + surname + " " + phoneNumber;
	}
}
