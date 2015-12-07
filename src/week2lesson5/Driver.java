package week2lesson5;

//driver class to test if computer and notebook classes are working correctly
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook notepad1 = new NoteBook("Sumsung", "intel", 4, 256, 2.2, 4, 4);
		System.out.println("The notepad's computing power is: " + notepad1.computePower());
		System.out.println("The Screen size of the notepad is: " + notepad1.screenSize());

		Computer comp = notepad1;

		System.out.println("The computer's computing power is: " + comp.computePower());

	}

}
//Output
//=========
//The notepad's computing power is: 8.8
//The Screen size of the notepad is: 16.0
//The computer's computing power is: 8.8

