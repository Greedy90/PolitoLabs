package lab1;

import java.util.ArrayList;

public class Rubrica {
	private String name;
	private ArrayList<Entry> list;
	
	public Rubrica() {
		name = new String("My Rubrica");
		list = new ArrayList<Entry>();
	}
	
	public Rubrica(String name) {
		this.name = name;
		list = new ArrayList<Entry>();
	}
	
	public String getName() {
		return name;
	}
	
	public void insertEntry(String name, String surname, String phoneNumber) {
		list.add(new Entry(name, surname, phoneNumber));
	}
	
	public void insertEntry() {
		list.add(new Entry());
	}
	
	public String giveFirst() {
		return list.get(0).toString();
	}
	
	public String giveAt(int index) {
		return list.get(index - 1).toString();
	}
	
	public String giveList() {
		StringBuffer outStr = new StringBuffer("(");
		for(int i = 0; i < list.size(); i++) {
			if(i == (list.size() - 1))
				outStr.append(list.get(i).toString());
			else
				outStr.append(list.get(i).toString() + ", ");
		}
		outStr.append(")");
		return outStr.toString();
	}
	
	public String search(String str) {
		for(Entry entry : list) {
			if(entry.findMe(str))
				return entry.toString();
		}
		return "Nope";
	}
}
