package c1;

import java.util.*;

class simpledotcom {
	int[] locationcells;
	int numofhits = 0;

	public void setlocationcells(int[] locs) {
		locationcells = locs;
	}

	public String checkyourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationcells) {
			if (guess == cell) {
				result = "hit";
				numofhits++;
				break;
			}
		}
		if (numofhits == locationcells.length) {
			result = "kill";

		}
		
		System.out.println(result);

		return result;
	}
}

public class Book7 {
	public static void main(String[] args) {
		simpledotcom dot = new simpledotcom();
		String userguess;
		int x = 0;
		int[] locations = { 1, 2, 3 };
		dot.setlocationcells(locations);
		while (x < 3) {
			System.out.print("enter a number ");
			Scanner num = new Scanner(System.in);
			userguess = num.nextLine();
			String result = dot.checkyourself(userguess);
			
		}
	}

}
