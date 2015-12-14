package week3lesson9;

import java.util.Stack;

public class Palindrom {

	static boolean isPalindrome(String str) {

		Stack<Character> mystack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {

			mystack.push(str.charAt(i));

		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != mystack.pop())
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		if (isPalindrome("Beautiful")) {
			System.out.println("It is palindrome");
		} else
			System.out.println("It is not palindrome");

	}
}
//Output
/*
It is not palindrome
*/