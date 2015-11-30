package week1lesson3;
//driver class to test Television class
public class driver {
	
	public static void main(String[] args) {
		Television tv = new Television("Sasung", 21);
		System.out.println("Manufacturer: " + tv.getManufacturer());
		System.out.println("The size of the screen is: " + tv.getScreenSize());
		tv.setVolume(20);
		System.out.println("Initial Volume: " + tv.getVolume());
		tv.setChannel(3);
		System.out.println("Initial Channel:" + tv.getChannel());
		tv.power();
		tv.decreaseVolume();
		System.out.println("Volume after decreased: " + tv.getVolume());
		tv.increaseVolume();
		System.out.println("Volume after increased: " + tv.getVolume());
		System.out.println("The Channel is: " + tv.getChannel());
		System.out.println("The Current Volume is: " + tv.getVolume());
		System.out.println("The Manufucturer is: " + tv.getManufacturer() );
		System.out.println("The Curent screen size of television: " + tv.getScreenSize());

	}

}
