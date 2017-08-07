import java.util.Scanner;

/**
 * 實作時間記錄：
 * 日期：<08/07>: <00:00>~<00:00>: <02:00>
 * 程式目標：設計亂數產生次數統計器,回應所有數目的產生次數、機率,回應個別數目的產生次數、機率，以及回應所有數目。
 * 設計規格：由使用者輸入執行次數,起始整數,結束整數,分別輸出所有數目的產生次數、機率,個別數目的產生次數、機率,所有數目。
 * 設計想法：allHitCounts(所有數目的產生次數),allHitPercents(所有數目的產生機率),
 * hitCountOf(個別數目的產生次數),hitPercentOf(個別數目的產生機率),
 * allNumbers(所有數目),dblPercent(出現比率),hitCounts(命中數),executionFrequency(執行次數)
 * 用random產生0到9的亂數,由使用者輸入執行次數,起始整數,結束整數,執行每個方法 分別輸出所有數目的產生次數,所有數目的產生機率,
 * 個別數目的產生次數,個別數目的產生機率,以及所有數目。
 * 虛擬碼：宣告一個陣列為iHitCnts,長度為10
 * 宣告一個executionFrequency為存儲執行次數
 * 使用Scanner讓使用者輸入執行次數
 * 使用Scanner讓使用者輸入起始整數
 * 使用Scanner讓使用者輸入結束整數
 * 用random產生隨機亂數
 * hitCounts儲存每個數字命中數
 * 設定方法allHitCounts
 * 使用Scanner讓使用者輸入(y/n)是否執行 
 * output每個數字產生次數
 * 設定方法allHitPercents 
 * 使用Scanner讓使用者輸入(y/n)是否執行 
 * 使用迴圈將每個數字比率 dblPercent =(hitCounts(0~9)/frequency)*100
 * output number 0~9 + 出現次數  + dblPercent
 * 設定方法hitCountOf
 * 使用Scanner讓使用者輸入(y/n)是否執行 
 * 使用Scanner讓使用者輸入一數 output 一數所產生次數
 * 設定方法hitPercentOf
 * 使用Scanner讓使用者輸入(y/n)是否執行 
 * 使用Scanner讓使用者輸入一數 output 一數所產生機率
 * 設定方法allNumbers
 * 使用Scanner讓使用者輸入(y/n)是否顯示
 * 
 */

public class RandomNumberCounter {

	public RandomNumberCounter(int startInteger, int endInteger, int frequency) {
	}

	// 宣告一個陣列為iHitCnts,長度為10
	static int[] hitCounts = new int[10];

	public static int[] allHitCounts() {
		char yesNo;
		System.out.print("是否要執行所有數目的產生次數?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				System.out.println("數字" + id + "產生" + hitCounts[id] + "次");
			}
		}
		if (yesNo == 'n') {

		}
		return hitCounts;
	}

	public static double allHitPercents(int frequency) {
		char yesNo;
		double dblPercent = 0;
		// 使用Scanner讓使用者輸入(y/n)是否執行
		System.out.print("是否要執行所有數目的產生機率?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				// 計算百分比
				dblPercent = 100.0 * (hitCounts[id] / (double) frequency);
				System.out.print("數字:" + id + "出現比率:");
				System.out.printf("%.2f", dblPercent);
				System.out.println("%");
			}
		}
		if (yesNo == 'n') {

		}
		return dblPercent;
	}

	public static int hitCountOf() {
		char yesNo;
		int numbers = 0;
		// 使用Scanner讓使用者輸入(y/n)是否執行
		System.out.print("是否要執行個別數目的產生次數?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {

			// 讓使用者輸入0~9任一數
			System.out.print("請輸入0~9的數字:");
			numbers = new Scanner(System.in).nextInt();

			System.out.println("數字" + numbers + "產生" + hitCounts[numbers] + "次");
		}
		if (yesNo == 'n') {

		}
		return numbers;
	}

	public static double hitPercentOf(int frequency) {
		char yesNo;
		double dblPercent = 0;
		// 使用Scanner讓使用者輸入(y/n)是否執行
		System.out.print("是否要執行個別數目的產生機率?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			int numbers = 0;
			// 讓使用者輸入0~9任一數
			System.out.print("請輸入0~9的數字:");
			numbers = new Scanner(System.in).nextInt();
			// 計算百分比
			dblPercent = 100.0 * (hitCounts[numbers] / (double) frequency);
			System.out.print("數字:" + numbers + "出現比率:");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");
		}
		if (yesNo == 'n') {

		}
		return dblPercent;
	}

	public static int[] allNumbers() {
		char yesNo;
		// 使用Scanner讓使用者輸入(y/n)是否顯示
		System.out.print("是否要顯示所有數目?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				System.out.println("數字" + id);
			}
		}
		if (yesNo == 'n') {
			System.out.println("不顯示");
		}
		return hitCounts;
	}

	public static void main(String[] args) {
		
		// 宣告一個executionFrequency為存儲執行次數
		int startInt = 0;
		int endInt = 0;
		int executionFrequency = 0;
		Scanner number = new Scanner(System.in);
		// 讓使用者輸入執行次數
		System.out.print("請輸入執行次數:");
		executionFrequency = number.nextInt();
		// 讓使用者輸入起始整數
		System.out.print("請輸入起始整數:");
		startInt = number.nextInt();
		// 讓使用者輸入結束整數
		System.out.print("請輸入結束整數:");
		endInt = number.nextInt();
		// 迴圈執行次數為輸入次數
		for (int id = 0; id < executionFrequency; id++) {
			// 產生隨機亂數
			int iNum = (int) (Math.random() * (endInt - startInt + 1)) + startInt;
			// 將產生的亂數存放到陣列對應值進行累加
			hitCounts[iNum]++;
		}
		allHitCounts();
		allHitPercents(executionFrequency);
		hitCountOf();
		hitPercentOf(executionFrequency);
		allNumbers();
	}

}
