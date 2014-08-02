package lab3;

public class Valve extends Element {

	private boolean opened;
	
	public Valve(String name) {
		super(name);
		opened = false;
	}
	
	public void setOpen(boolean val) {
		opened = val;
	}

}
