package week1lesson3;

import java.util.Random;
//main class to check pairofdice class
public class Main {
	public static void main(String[] args) {
		// Create two object for the PairOfDice

		// Roll the two pairs of dice for both objects until the totals are
		// same.

		// Display how many times needed to get the same total

		PairOfDice pairdie1 = new PairOfDice();
		PairOfDice pairdie2 = new PairOfDice();

		int total1 = pairdie1.die1 + pairdie1.die2;
		int total2 = pairdie2.die1 + pairdie2.die2;
		System.out.println("Total 1 : " + total1 + " and  Total 2: " + total2);
		int numberOfRoll = 1;
		while (total1 != total2) {
			pairdie1.roll();
			total1 = pairdie1.die1 + pairdie1.die2;
			pairdie2.roll();
			total2 = pairdie2.die1 + pairdie2.die2;
			numberOfRoll++;
			System.out.println("Total 1 : " + total1 + " and  Total 2: " + total2);
		}
		System.out.println("The number of rolls made are: " + numberOfRoll);

	}

}
