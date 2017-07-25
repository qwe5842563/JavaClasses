package c1;
import java.util.*;
public class work2_1 {
/*題目：古典問題：有一對兔子，從出生後第3個月起每個月都生一對兔子，小兔子長到第三個月後每個月又生一
	對兔子，假如兔子都不死，問每個月的兔子總數為多少？ 1 1 2 3 5 8 13 21 34 ......*/
	public static void main(String[] args){
		fibo(1);
	}
	public static void fibo(int month) {
		int total,lastmon=1,llastmon=1;
		System.out.print("請輸入月份:");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		if(month==1){
			System.out.println("第1個月兔子總數:"+1+"隻");
			}
		else if(month==2){
			System.out.println("第1個月兔子總數"+1+"隻");
			System.out.println("第2個月兔子總數"+1+"隻");
		}
		else if(month>=3){
			System.out.println("第1個月兔子總數"+1+"隻");
			System.out.println("第2個月兔子總數"+1+"隻");
			for(int i=3;i<=month;i++){
				total=lastmon+llastmon;
				System.out.println("第"+i+"個月兔子總數"+total+"隻");
				lastmon=llastmon;
				llastmon=total;
			}		
		}
	}
}
