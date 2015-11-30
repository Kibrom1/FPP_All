package week1lesson3;
//Television class
public class Television {

	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;

	public Television(String brand, int size) {

		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void power() {
		this.powerOn = true;
	}
	public void increaseVolume() {
		this.setVolume(this.getVolume() + 1);
	}

	public void decreaseVolume() {
		this.setVolume(this.getVolume() - 1);
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public String getManufacturer() {
		return MANUFACTURER;
	}

	public int getScreenSize() {
		return SCREEN_SIZE;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
