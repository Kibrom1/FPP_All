package week2lesson7;

import jdk.Exported;
import sun.awt.DisplayChangedListener;

class Outer {
	private String text1 = "I am Outer Class!";

	public void callinner() {
		Inner iobj = new Inner();
		iobj.printText();
	}

	class Inner {
		private String text2 = "I am Inner Class!";

		void printText() {
			this.text2 = "This is inside";
			System.out.println(text1);
			System.out.println(text2);
		}
	}
}

class Main {
	static int ki;
	static String mm;

	void disply() {
		class Message {
			int length;
			String messages;

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + length;
				result = prime * result + ((messages == null) ? 0 : messages.hashCode());
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
				Message other = (Message) obj;
				if (length != other.length)
					return false;
				if (messages == null) {
					if (other.messages != null)
						return false;
				} else if (!messages.equals(other.messages))
					return false;
				return true;
			}

			@Override
			protected Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				String str = length + " and " + messages;
				return super.toString();
			}

			Message(int len, String mes) {
				System.out.println("length" + this.length + " and message" + this.messages);
			}
		}
		Message mes = new Message(12, "Selamta");
	}
	static class StatClass{
		static void showmess(){
			System.out.print("Ki is " + ki + " and " + mm);
		}
	}
	public static void main(String args[]) {
		// Object for outer class
		Outer ot = new Outer();
		ot.callinner();
		// object for inner class
		Outer.Inner obj = new Outer().new Inner();
		obj.printText();
		Main mm = new Main();
		mm.disply();
	}
}
