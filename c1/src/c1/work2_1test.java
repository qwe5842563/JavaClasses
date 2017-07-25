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
            System.out.println("第一月 ："+1);  
        }else if(month == 2){  
            System.out.println("第一月 ："+1);  
            System.out.println("第二月 : " + 1);  
        }else if(month > 2){  
            System.out.println("第1月："+1);  
            System.out.println("第2月 : " + 1);  
            for(int j = 3 ; j <= month ; j++ ){  
                total = pre + prepre ;  
                System.out.println("第" + j + "：" + total);  
                prepre = pre ;  
                pre = total ;  
            }  
        }  
    }  
}  
