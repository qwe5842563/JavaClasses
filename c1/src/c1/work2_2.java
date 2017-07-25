package c1;
import java.util.*;


public class work2_2 {
	/*
	 * 題目：一對免子第三月後生下第一對免子，之後每個月生下一對免子 設計： class RabbitCouple int bornMonthSeq;
	 * public RabbitCouple giveBirthTo(int monthSeq) if monthSeq - bornMonthSeq
	 * >= 2 then return new RabbitCouple(monthSeq) else return null constructor
	 * RabbitCouple(int bornMonthSeq)
	 * 
	 */

	public static void main(String[] args) {

		// 命令列參數：第N月

		// 功能：列出每月免子對數，從第一月到第N月

		/*
		 * 
		 * 設計：
		 * 
		 * 先解出命令列參數，個數為1，能轉為整數，整數大於0
		 * 
		 * 先產生第一對免子，放到兔群 ArrayList <RabbitCouple> alRabbitCouples
		 * 
		 * 從第一月到第n月
		 * 
		 * 先讓所有的兔子生
		 * 
		 * 再計算兔子個數
		 * 
		 * 印出
		 * 
		 */

		// * 先解出命令列參數，個數為1，能轉為整數，整數大於0
		
		if (args == null || args.length != 1) {

			System.out.println("參數個數必須為一個!!");

			System.exit(1);

		}

		
		int monthSeq = 0;
		try {

			monthSeq = Integer.parseInt(args[0]);

			if (monthSeq <= 0) {

				System.out.println("輸入月次必須大於等於1!!");

				System.exit(1);

			}

		} catch (Exception e) {

			System.out.println("輸入整數值格式錯誤!!");

			System.exit(1);

		}

		// * 先產生第一對免子，放到兔群 ArrayList <RabbitCouple> alRabbitCouples

		RabbitCouple rabbitCouple = new RabbitCouple(1);

		ArrayList<RabbitCouple> alRabbitCouples = new ArrayList<RabbitCouple>();

		alRabbitCouples.add(rabbitCouple);

		// * 從第一月到第n月

		for (int monthId = 1; monthId <= monthSeq; monthId++) {

			// * 先讓所有的兔子生

			/*
			 * 
			 * 先算現在兔子對數
			 * 
			 * 逐個檢查兔子生產情形，有生就加入兔群
			 * 
			 * 這邊因為初生的兔子不會生，所以檢查既有的兔子即可
			 * 
			 */

			// * 先算現在兔子對數

			int coupleCnt = alRabbitCouples.size();

			// * 這邊因為初生的兔子不會生，所以檢查既有的兔子即可=> index到原有的兔子

			for (int id = 0; id < coupleCnt; id++) {

				// * 逐個檢查兔子生產情形，有生就加入兔群

				RabbitCouple newRabbitCouple = alRabbitCouples.get(id).giveBirth(monthId);

				if (newRabbitCouple == null) {

					continue;

				}

				// 有生就加入兔群

				alRabbitCouples.add(newRabbitCouple);

			}

			// * 再計算兔子個數

			int totCoupleCnt = alRabbitCouples.size();

			// * 印出

			System.out.println("月次：" + monthId + "\t，兔子對數：\t" + totCoupleCnt);

		}

	}

}

class RabbitCouple {

	private int bornMonthSeq;// 出生月次

	public RabbitCouple(int monthSeq) {

		this.bornMonthSeq = monthSeq;

	}

	public RabbitCouple giveBirth(int monthSeq) {

		if ((monthSeq - this.bornMonthSeq) >= 2) {// 第三個月後，每月會生一對

			return new RabbitCouple(monthSeq);

		} else {

			return null;// 沒有生

		}

	}

}
