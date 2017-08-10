import java.util.Scanner;
/**
 * 實作時間記錄：
 * 日期：<08/08>: <00:00>~<00:00>: <04:00>
 * 程式目標：
 * 	利用本程式來展示Unit test的做法
 *   
 * 設計規格：
 * 	基本：命令列：請輸入阿拉伯數字將轉換為中文(ex: 123)，輸出：一百二十三
 * 設計想法：
 * 	宣告兩個陣列，一個陣列放0到9的常數，另一個放單位，讓使用者輸入值，先判斷輸入值是否為負然後將輸入值轉為字串，
 * 再用迴圈取出每個值，用StringBuffer的append方法將值一一加上，再利用insert將單位值插入，
 * 最後根據零以及其他數字的擺放位子不同做修正。
 * 虛擬碼：
 *  宣告一個陣列存放零到九的字串
 *  宣告一個陣列存放單位
 *  判斷輸入值為負數將結果設定為"負"
 *  將輸入值轉為字串
 *  取出字串的每個索引值
 *  將取出的每個索引值轉換為int型別後代入陣列並逐一加上
 *  將單位的值逐一插入
 *  將有零以及根據位子說法不同做替換
 *  讓使用者輸入一串阿拉伯數字
 */

public class NumberSpeaker {

	public static String transScriptOf(int num) {
		// 宣告一個陣列存放零到九的字串
		String[] numbers = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
		// 宣告一個陣列存放單位
		String[] unit = { "", "十", "百", "千", "萬", "十", "百", "千", "億", "十" };
		String result = "";
		// 判斷輸入值為負數將結果設定為"負"
		if (num < 0) {
			num = Math.abs(num);
			result = "負";
		}
		// 將輸入值轉為字串
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer();
		for (int id = 0; id < str.length(); id++) {
			// 取出字串的每個索引值
			String index = String.valueOf(str.charAt(id));

			// 將取出的每個索引值轉換為int型別後代入陣列並逐一加上
			sb = sb.append(numbers[Integer.parseInt(index)]);

		}
		int initial = 0;
		// 將單位的值逐一插入
		for (int id = sb.length(); id > 0; id--) {
			sb = sb.insert(id, unit[initial++]);
		}
		// 將有零以及根據位子說法不同做替換
		System.out.println(result + sb.toString().replaceAll("零千零百零十零萬", "").replaceAll("零千零百零十", "零")
				.replaceAll("零千零百", "零").replaceAll("零萬", "萬").replaceAll("零千", "零").replaceAll("零百零十", "零")
				.replaceAll("零百", "零").replaceAll("零十", "零").replaceAll("零萬", "萬").replaceAll("零零零", "")
				.replaceAll("零零", "").replaceAll("一十", "十").replaceAll("百十", "百一十").replaceAll("十零", "十")
				.replaceAll("二千", "兩千").replaceAll("二百", "兩百"));
		return result;
	}

	public static void main(String[] args) {
		int stringNumbers;
		// 讓使用者輸入一串阿拉伯數字
		System.out.print("請輸入阿拉伯數字將轉換為中文:");
		stringNumbers = new Scanner(System.in).nextInt();
		transScriptOf(stringNumbers);
	}

}
