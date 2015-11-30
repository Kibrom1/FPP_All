package week1lesson4;

import java.lang.String;
import java.util.Arrays;

public class Recurssion {
	// mergesort using recursive function
	String mergeSort(String str1, String str2) {
		if ((str1 == null || str1.equals("")) && (str2 == null || str2.equals("")))
			return null;
		else if ((str1 == null || str1.equals("")) && (!(str2 == null || str2.equals(""))))
			return str2;
		else if ((str2 == null || str2.equals("")) && (!(str1 == null || str1.equals(""))))
			return str1;
		else {
			if (str1.charAt(0) < str2.charAt(0))
				return str1.charAt(0) + mergeSort(str1.substring(1), str2.substring(0));
			else
				return str2.charAt(0) + mergeSort(str1.substring(0), str2.substring(1));
		}
	}

	// find minimum character in a string
	char findMinimumChar(String str) {

		if (str.length() == 1)
			return str.charAt(0);
		else {
			if ((str.charAt(0) < str.charAt(str.length() - 1)) && (str.length() > 2)) {
				return findMinimumChar(str.substring(0, str.length() - 2));
			} else if (str.charAt(0) < str.charAt(str.length() - 1)) {

				return findMinimumChar(str.substring(0, 1));
			} else if (str.charAt(0) > str.charAt(str.length() - 1)) {

				return findMinimumChar(str.substring(1, 2));
			} else {
				return findMinimumChar(str.substring(1, str.length() - 1));
			}

		}

	}

	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

		if (start < end) {
			int mid = start + (end - start) / 2;
			if (key < sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, start, mid, key);

			} else if (key > sortedArray[mid]) {
				return recursiveBinarySearch(sortedArray, mid + 1, end, key);

			} else {
				return mid;
			}
		}
		return -(start + 1);
	}

	// BinarySearch
	int binarySearch(int[] arr, int target, int start, int end) {

		if (end > start) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid])
				return binarySearch(arr, target, start, mid);
			else if (target > arr[mid])
				return binarySearch(arr, target, mid + 1, end);
			else
				return mid;
		}
		return -1;
	}

	// Finding the sum of arrays
	double sum(double[] arr, int index) {

		if (index == 0)
			return arr[0];
		else
			return arr[index] + sum(arr, index - 1);
	}

	// Check if the String is Palindrome
	boolean isPalindrome(String str, int up, int down) {

		if (down < up)
			return false;
		else if (str.charAt(up) != str.charAt(down))
			return false;
		else
			isPalindrome(str, ++up, --down);
		return true;
	}

	public static void main(String[] args) {

		Recurssion rr = new Recurssion();
		// For MergeSort
		String str1 = "ace", str2 = "bdf";
		String str = rr.mergeSort(str1, str2);
		System.out.println("1.Merge Sort of " + str1 + " and " + str2 + " is: " + str);
		// For finding minimum Character
		String str3 = "akel";
		System.out.println("2.The Minimal Character in the string " + str3 + " is: " + rr.findMinimumChar("akel"));
		int[] sortedArray = { 2, 45, 234, 567, 876, 900, 976, 999 };
		System.out.println("3.The target element is found at index: " + rr.binarySearch(sortedArray, 900, 0, sortedArray.length - 1));
		// For Summing up of arrays
		double[] arr = { 1.0, 2.3, 3.9, 4.0, 5.3 };
		System.out.println("4. The sum of the array is: " + rr.sum(arr, arr.length - 1));
		// For checking if a string is palindrome
		String str4 = "12321";
		System.out.println("5. The Specified String is Palindrome: " + rr.isPalindrome(str4, 0, str4.length() - 1));

	}

}
