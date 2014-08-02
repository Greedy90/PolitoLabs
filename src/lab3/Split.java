package lab3;

public class Split extends Element {
	protected Element[] outputs;

	public Split(String name) {
		super(name);
		outputs = new Element[2];
	}

	public void connect(Element e, int port) {
		outputs[port] = e;
	}
	
	public Element[] getOutputs() {
		return outputs;
	}
}
