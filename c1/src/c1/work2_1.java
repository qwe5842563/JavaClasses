package c1;
import java.util.*;
public class work2_1 {
/*�D�ءG�j����D�G���@��ߤl�A�q�X�ͫ��3�Ӥ�_�C�Ӥ볣�ͤ@��ߤl�A�p�ߤl����ĤT�Ӥ��C�Ӥ�S�ͤ@
	��ߤl�A���p�ߤl�������A�ݨC�Ӥ몺�ߤl�`�Ƭ��h�֡H 1 1 2 3 5 8 13 21 34 ......*/
	public static void main(String[] args){
		fibo(1);
	}
	public static void fibo(int month) {
		int total,lastmon=1,llastmon=1;
		System.out.print("�п�J���:");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		if(month==1){
			System.out.println("��1�Ӥ�ߤl�`��:"+1+"��");
			}
		else if(month==2){
			System.out.println("��1�Ӥ�ߤl�`��"+1+"��");
			System.out.println("��2�Ӥ�ߤl�`��"+1+"��");
		}
		else if(month>=3){
			System.out.println("��1�Ӥ�ߤl�`��"+1+"��");
			System.out.println("��2�Ӥ�ߤl�`��"+1+"��");
			for(int i=3;i<=month;i++){
				total=lastmon+llastmon;
				System.out.println("��"+i+"�Ӥ�ߤl�`��"+total+"��");
				lastmon=llastmon;
				llastmon=total;
			}		
		}
	}
}
