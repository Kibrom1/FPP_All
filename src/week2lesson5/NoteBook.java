package week2lesson5;

public class NoteBook extends Computer {

	double height;
	double width;
	double weight;

	public NoteBook(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed, int height,
			int width) {
		// TODO Auto-generated constructor stub
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.width = width;
		this.height = height;
	}
	public double screenSize(){
		return height * width;
	}

}
