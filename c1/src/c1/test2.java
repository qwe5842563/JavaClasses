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
			return true;// ���T
		}else {
			return false;// ���~
		}
	}
	StudentScores(int num, int chi, int math, int eng){
		this.num = num;
		this.chi = chi;		
		this.eng = eng;
	    this.math = math;
	}
}
// �D�{��

public class test2 { // �D�{��
	public static void main(String[] args) { // �ŧiTime���O���A���ܼ�, �B�إߪ���
		
		StudentScores Yan = new StudentScores(1,75,48,67 );
	   StudentScores Wang = new StudentScores(2,32,66,80 );
		StudentScores Kuo = new StudentScores(3,78,45,62 );
		

		System.out.println("Yan ����:" + Yan.sum());
		System.out.println("Wang ����:" + Wang.sum());
		System.out.println(" Kuo ����:" + Kuo.sum());
		

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
