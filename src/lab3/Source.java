package lab3;

public class Source extends Element {

	float flowRate;
	
	public Source(String name) {
		super(name);
		flowRate = 0;
	}
	
	public void setFlowRate(float flowRate) {
		this.flowRate = flowRate;
	}
	
	public void simulation() {
		System.out.println("Source " + name + ", flow rate: " + flowRate);
		output.simulation();
	}

}
