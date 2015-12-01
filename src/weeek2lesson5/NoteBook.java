package weeek2lesson5;

public class NoteBook extends Computer {

	double cost;

	public NoteBook(String manufacturer, double cost) {
		this.manufacturer = manufacturer;
		this.cost = cost;
	}

	@Override
	public double getRamSize() {
		// TODO Auto-generated method stub
		return ramSize;
	}

	@Override
	public double getDiskSize() {
		// TODO Auto-generated method stub
		return diskSize;
	}

	@Override
	public double getProcessorSpeed() {
		// TODO Auto-generated method stub
		return processorSpeed;
	}

	@Override
	public double computePower() {
		// TODO Auto-generated method stub
		return ramSize * processorSpeed;
	}

	@Override
	public double costProduct() {
		// TODO Auto-generated method stub
		return cost;
	}

}
