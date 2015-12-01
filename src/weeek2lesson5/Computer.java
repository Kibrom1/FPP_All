package weeek2lesson5;

public abstract class Computer {

	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;

	public abstract double getRamSize();

	public abstract double getDiskSize();

	public abstract double getProcessorSpeed();

	public abstract double computePower();

	public abstract double costProduct();
}
