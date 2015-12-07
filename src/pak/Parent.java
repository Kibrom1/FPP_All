package pak;

class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}

	static {
		System.out.println("Parent static block");
	}

	{
		System.out.println("Parent initialisation  block");
	}
}

class Child extends Parent {
	{
		System.out.println("Child initialisation block");
	}

	static {
		System.out.println("Child static block");
	}

	public Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		new Child();
		printCharsReverse("Hello");
	}

	public static void printCharsReverse(String str) {
		if (str == null || str.equals(""))
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
}