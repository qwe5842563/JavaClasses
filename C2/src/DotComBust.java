import java.io.*;
import java.util.*;

class DotCom {
	private ArrayList<String> locationCells;
	private String name;

	public void setLocationCells(ArrayList<String> loc) {// 更新DotCom位置
		locationCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Ouch! You sunk" + name + " : (");
			} else {
				result = "hit";
			}
		}
		return result;
	}
}

class GameHelper {
	private static final String alphabet = "abcdefg";
	  private int gridLength = 7;
	  private int gridSize = 49;
	  private int [] grid = new int[gridSize];
	  private int comCount = 0;


	  public String getUserInput(String prompt) {
	     String inputLine = null;
	     System.out.print(prompt + "  ");
	     try {
	       BufferedReader is = new BufferedReader(
		 new InputStreamReader(System.in));
	       inputLine = is.readLine();
	       if (inputLine.length() == 0 )  return null; 
	     } catch (IOException e) {
	       System.out.println("IOException: " + e);
	     }
	     return inputLine.toLowerCase();
	  }

	public ArrayList<String> placeDotCom(int comSize) {
		 ArrayList<String> alphaCells = new ArrayList<String>();
		    String [] alphacoords = new String [comSize];      
		    String temp = null;                                
		    int [] coords = new int[comSize];                 
		    int attempts = 0;                                  
		    boolean success = false;                           
		    int location = 0;                                  
		    
		    comCount++;                                       
		    int incr = 1;                                     
		    if ((comCount % 2) == 1) {                       
		      incr = gridLength;                               
		    }

		while (!success & attempts++ < 200) {
			location = (int) (Math.random() * gridSize);

			int x = 0;
			success = true;
			while (success && x < comSize) {
				if (grid[location] == 0) {
					coords[x++] = location;
					location += incr;
					if (location >= gridSize) {
						success = false;
					}
					if (x > 0 & (location % gridLength == 0)) {
						success = false;
						}
					} else {
						success = false;
					}

				}
			}

		int x = 0;
		int row = 0;
		int column = 0;

		while (x < comSize) {
			grid[coords[x]] = 1;
			row = (int) (coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));

			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;

		}

		return alphaCells;
	}
}

class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setupGame() {
		// 建立三個DotCom物件 並指派名稱與放入ArrayList
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		System.out.println("Your goal is to sink three dot coms.");
		System.out.println("pets.com,eToys.com,Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");

		for (DotCom dotComToset : dotComsList) {

			ArrayList<String> newLocation = helper.placeDotCom(3); // 要求DotCom的位置

			dotComToset.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");// 取得玩家輸入
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;

		String result = "miss"; // 先假設沒有命中

		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess); // 要求DotCom檢查是否命中或擊沉
			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result); // 列出結果
	}

	private void finishGame() {
		System.out.println("All Coms are dead! Your stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you" + numOfGuesses + "guesses.");
			System.out.println("You goy out before your options sank.");
		} else {
			System.out.println("Took you long enough." + numOfGuesses + "guesses.");
			System.out.println("Fish are dance with your options");
		}
	}

	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setupGame();
		game.startPlaying();

	}
}
