package c1;

import java.io.*;

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

class gamehelper {
	public String getuserinput(String prompt) {
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0)
				return null;
		} catch (IOException e) {
			System.out.println("IOException:" + e);
		}
		return inputLine;
	}
}

public class Book8 {
	public static void main(String[] args) {
		int numofguesses = 0;
		gamehelper helper = new gamehelper();
		simpledotcom thedotcom = new simpledotcom();
		int randomnum = (int) (Math.random() * 5);

		int[] locations = { randomnum, randomnum + 1, randomnum + 2 };
		thedotcom.setlocationcells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getuserinput("enter a number");
			String result = thedotcom.checkyourself(guess);
			numofguesses++;
			if (result.equals("kill")) {
				isAlive = false;
				System.out.print("you took " + numofguesses + " guesses");
			}
		}
	}
}
