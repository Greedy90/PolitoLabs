package lab3;

public class Element {
	protected String name;
	protected Element output;
	
	public Element(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void connect(Element e) {
		output = e;
	}
	
	public Element getOutput() {
		return output;
	}
	
	public void simulation() {
		System.out.println("");
	}
}
