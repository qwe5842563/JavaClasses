package c1;

/*題目輸出如下
 * result543345
 */
public class Book6 {
	public static void main(String[] args) {
		puzzle4b obs[] = new puzzle4b[6]; // 宣告一個物件為obs的陣列 用class puzzle4b 變數有六個
		int y = 1;
		int x = 0;
		int result = 0;
		while (x < 6) {
			obs[x] = new puzzle4b();
			obs[x].ivar = y;
			y = y * 10;
			x = x + 1;
		}
		x = 6;
		while (x > 0) {
			x = x - 1;
			result = result + obs[x].dostuff(x);
		}
		System.out.println("result" + result);
	}
}

class puzzle4b {
	int ivar;

	public int dostuff(int factor) {
		if (ivar > 100) {
			return ivar * factor;
		} else {
			return ivar * (5 - factor);
		}
	}
}
