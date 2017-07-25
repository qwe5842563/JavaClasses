package c1;
class StudentScores {
	private int num;
	private int chi;
	private int eng;
	private int math;

	public int sum() {
		int t = (chi + eng+math)/3;
		return t;
	}
	public void  ave(){
    	int id1=0;
    	id1=(chi+eng+math)/3;	  
    }

	public boolean allpass() {
		if (chi >= 60 && eng >= 60&& math>=60){
			return true;// 正確
		}else {
			return false;// 錯誤
		}
	}
	StudentScores(int num, int chi, int math, int eng){
		this.num = num;
		this.chi = chi;		
		this.eng = eng;
	    this.math = math;
	}
}
// 主程式

public class test2 { // 主程式
	public static void main(String[] args) { // 宣告Time類別型態的變數, 且建立物件
		
		StudentScores Yan = new StudentScores(1,75,48,67 );
	   StudentScores Wang = new StudentScores(2,32,66,80 );
		StudentScores Kuo = new StudentScores(3,78,45,62 );
		

		System.out.println("Yan 平均:" + Yan.sum());
		System.out.println("Wang 平均:" + Wang.sum());
		System.out.println(" Kuo 平均:" + Kuo.sum());
		

		if (Yan.allpass())
			System.out.println("Yan all pass");
		else
			System.out.println("Yan doesn't pass");

		if (Wang.allpass())
			System.out.println("Wang all pass");
		else
			System.out.println("Wang doesn't pass");

		if (Kuo.allpass())
			System.out.println("Kuo all pass");
		else
			System.out.println("Kuo doesn't pass");

		
	}

}
