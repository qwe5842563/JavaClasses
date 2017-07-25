package c1;

/*
 * 題目輸出island=Fiji
		island=Cozumel
		island=Bermuda
		island=Azores
 */
public class Book5 {
	public static void main(String[] args) {
		String[] islands = new String[4];// 宣告四個islands的字串
		int[] index = new int[4];// 宣告四個index的變數
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int ref; // 宣告islands的編號
		int y = 0;
		while (y < 4) {
			System.out.print("island=");
			ref = index[y];
			System.out.println(islands[ref]);
			y = y + 1;
		}
	}
}
