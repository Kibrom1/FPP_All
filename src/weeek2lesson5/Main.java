package weeek2lesson5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer[] computers = {new Desktop("Sumsang",2000), 
								new MainFrame("LG",20000), new NoteBook("Apple", 500)};
		
		for(Computer comps: computers){
			String type = comps.getClass().getSimpleName();
			System.out.println("The computer is " + type + ": " + comps.costProduct());
		}
	}

}
