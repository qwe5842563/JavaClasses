import java.util.Scanner;

/**
 * 實作時間記錄： 日期：<07/17>: <10:00>~<11:15>: <01:15>
 * 程式目標：使用Math.random()，產生0到9的亂數，並計算在執行10次，100次，1000次的情形下，每個數字出現的比例。
 * 設計規格：輸出每個數字各自的出現比率,出現比率以小數點後兩位顯示。
 * 設計想法：dblPercent(出現比率),hitCounts(命中數),executionFrequency(執行次數)
 * 用Scanner讓使用者輸入執行次數,產生random0到9的亂數,利用迴圈使hitCounts儲存產生0~9的命中數,
 * 再用迴圈使dblPercent算出每個數字的出現比率,用System.out.printf("%.2f")顯示小數後兩位。 
 * 虛擬碼：hitCounts = int[10] 產生一個長度為10的陣列
 * 用executionFrequency讓使用者輸入執行次數
 * 產生 0~9 random亂數
 * hitCounts儲存每個數字命中數 
 * 使用迴圈將每個數字比率 dblPercent =(hitCounts(0~9)/executionFrequency)*100 
 * output number 0~9 + 出現次數  + dblPercent
 */

public class countPercent {

	public static void main(String[] args) {

		int executionFrequency = 0; //宣告一個executionFrequency為存儲執行次數
		Scanner frequency = new Scanner(System.in);
		System.out.print("請輸入執行次數:"); //讓使用者輸入執行次數
		executionFrequency = frequency.nextInt();
		int[] hitCounts = new int[10]; //宣告一個陣列為iHitCnts,長度為10
		for (int id = 0; id < executionFrequency; id++) { // 迴圈執行次數為輸入次數
			int iNum = (int) (10 * Math.random()); //產生0~9的隨機亂數
			hitCounts[iNum]++; //將產生的亂數存放到陣列對應值進行累加
		}
		for (int id = 0; id < hitCounts.length; id++) { //
			double dblPercent = 100.0 * (hitCounts[id] / (double) executionFrequency);
			//計算百分比
			System.out.print("數字:" + id + " 出現	" + hitCounts[id] + "次" + "出現比率:");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");
		}

	}
}
