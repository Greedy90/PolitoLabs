package lab3;

import java.util.ArrayList;

public class PlumbingSystem {
	private ArrayList<Element> elements;
	
	public PlumbingSystem() {
		elements = new ArrayList<Element>();
	}
	
	public void addElement(Element e) {
		elements.add(e);
	}
	
	public Element[] getElements() {
		return (Element[]) elements.toArray(new Element[elements.size()]);
	}
	
	public void simulation() {
		Element[] array = getElements();
		for(int i = 0; i < array.length; i++) {
			if(array[i] instanceof Source) {
				Source s = (Source) array[i];
				s.simulation();
			}
		}
	}
	
}
