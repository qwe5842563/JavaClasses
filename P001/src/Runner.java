/**
 * 實作時間記錄： 日期：<07/27>: <00:00>~<00:00>: <00:05>
 * 程式目標：了解public void main的用處
 * 設計規格：產生一個Helloer,執行sayHello 
 * 設計想法：建立一個物件,物件呼叫方法
 * 虛擬碼：建立一個物件為helloer使用Helloer這個class
 * helloer呼叫class裡的方法sayHello輸出"I’m a helloer."
 * 
 */
public class Runner {

	public static void main(String[] args) {
		Helloer helloer = new Helloer();// 建立一個物件為helloer使用Helloer這個class
		helloer.sayHello();// helloer呼叫class裡的方法sayHello輸出"I’m a helloer."

	}

}
