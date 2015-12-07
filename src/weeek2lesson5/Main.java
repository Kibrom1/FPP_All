package weeek2lesson5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer[] computers = {new Desktop("Sumsang",2000), 
								new MainFrame("LG",20000), new NoteBook("Apple", 500)};
		
		for(Computer comps: computers){
			String type = comps.getClass().getSimpleName();
			System.out.println("The price of computer is " + type + ": " + comps.costProduct());
		}
	}

}
//Output
//======
//The price of computer is Desktop: 2000.0
//The price of computer is MainFrame: 20000.0
//The price of computer is NoteBook: 500.0

