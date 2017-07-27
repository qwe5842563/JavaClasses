/**
 * 實作時間記錄： 日期：<07/27>: <00:00>~<00:00>: <00:10>
 * 程式目標：直接使用Helloer的public void main來執行Runner的工作
 * 設計規格：使用方法sayHello在螢幕上印出"I’m a helloer."
 * 設計想法：建立方法sayHello方法內輸出"I’m a helloer.
 * 在main中建立一個物件為helloer再呼叫方法sayhello
 * 虛擬碼：
 * 建立方法sayHello
 * 方法輸出"I’m a helloer."
 * 建立物件為helloer
 * 呼叫sayhello輸出"I’m a helloer.
 */

public class Helloer {
	void sayHello() { //建立方法sayHello
		System.out.print("I’m a helloer."); //方法輸出"I’m a helloer."
	}

	public static void main(String[] args) {
		Helloer helloer = new Helloer(); //建立物件為helloer
		helloer.sayHello(); //呼叫sayhello輸出"I’m a helloer.

	}

}
