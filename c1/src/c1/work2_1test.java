package c1;

public class work2_1test {
	public static void main(String[] args) {  
        fibo(7);  
    }  
    private static void fibo(int month) {   
        int pre = 1 ;  
        int prepre = 1 ;  
        int total ;  
        if(month == 1){  
            System.out.println("�Ĥ@�� �G"+1);  
        }else if(month == 2){  
            System.out.println("�Ĥ@�� �G"+1);  
            System.out.println("�ĤG�� : " + 1);  
        }else if(month > 2){  
            System.out.println("��1��G"+1);  
            System.out.println("��2�� : " + 1);  
            for(int j = 3 ; j <= month ; j++ ){  
                total = pre + prepre ;  
                System.out.println("��" + j + "�G" + total);  
                prepre = pre ;  
                pre = total ;  
            }  
        }  
    }  
}  
