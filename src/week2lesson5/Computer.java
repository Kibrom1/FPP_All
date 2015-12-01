package week2lesson5;
//Computer class
public class Computer {

	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
//constructor
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}

	public double getRamSize() {

		return ramSize;

	}

	public double getDiskSize() {

		return diskSize;
	}

	public double getProcessorSpeed() {

		return processorSpeed;
	}

	public double computePower() {

		return ramSize * processorSpeed;
	}
}
