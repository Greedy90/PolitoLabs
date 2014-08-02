package lab3;

public class DistributionBlock extends Split {
	private float[] distributionRates;

	public DistributionBlock(String name, int numOutputs) {
		super(name);
		outputs = new Element[numOutputs];
		//distributionRates = new float[numOutputs];
	}

	public void connect(Element e, int port) {
		outputs[port] = e;
	}
	
	public Element[] getOutputs() {
		return outputs;
	}
	
	public int getNumOutputs() {
		return outputs.length;
	}
	
	public void setDistributionRates(float[] array) {
		distributionRates = array;
	}
}
