package week2lesson5;

public class ComputerClass {
	private NoteBookI notePad;
	public Object clone() throws CloneNotSupportedException {
		
		ComputerClass c=(ComputerClass)super.clone(); 
		 // Need to clone the Address reference variable too
		 c.notePad = (NoteBookI)this.notePad.clone();
		 return c;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ComputerNew pc1= new ComputerNew("Dell","Inter Xron",8,1000);
		ComputerNew pc2 = new ComputerNew("Dell","Inter Xron",8,1000);
		NoteBookI noteBook2 = new NoteBookI("Dell","Inter Xron",8,1000, 100, 23, 9,3);
		System.out.println("PC1 and PC2 are equal: " + pc1.equals(pc2));

		NoteBookI noteBook = (NoteBookI) noteBook2.clone();
		System.out.println("noteBook is clon of notebook2, as a result both are equal:" + noteBook.equals(noteBook2));
	}

}
class ComputerNew
{
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	ComputerNew(String manufacturer, String processor, int ramSize,
			int diskSize) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = 16;
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
	public double computPower()
	{
		return ramSize * processorSpeed;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diskSize;
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((processor == null) ? 0 : processor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(processorSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ramSize;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComputerNew other = (ComputerNew) obj;
		if (diskSize != other.diskSize)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (processor == null) {
			if (other.processor != null)
				return false;
		} else if (!processor.equals(other.processor))
			return false;
		if (Double.doubleToLongBits(processorSpeed) != Double
				.doubleToLongBits(other.processorSpeed))
			return false;
		if (ramSize != other.ramSize)
			return false;
		return true;
	}

}

class NoteBookI extends Computer implements Cloneable
{
	NoteBookI(String manufacturer, String processor, int ramSize, int diskSize,double processorSpeed,
			double height, double width, double weight) {
		super(manufacturer, processor, ramSize, diskSize,processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}

	@Override

	  public Object clone() throws CloneNotSupportedException {

		NoteBookI clone=(NoteBookI)super.clone();	   
	    return clone;

	  }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(width);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBookI other = (NoteBookI) obj;
		if (Double.doubleToLongBits(height) != Double
				.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(weight) != Double
				.doubleToLongBits(other.weight))
			return false;
		if (Double.doubleToLongBits(width) != Double
				.doubleToLongBits(other.width))
			return false;
		return true;
	}

	double height;
	double width;
	double weight;
	
	double screensize()
	{
		return height * width;
	}
}
