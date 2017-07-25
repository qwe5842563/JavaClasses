package c1;
class score   
{
   private int nam;
   private int chi;
   private int eng;
   private int math;

public void score(int n,int c, int m, int e)
 	 {  // 檢查時間參數是否合法    
        nam  = n;
        chi  = c;                
        math = m;              
        eng  = e;
     }

public static void ave(String n[],int c[],int m[],int e[]){  

	      float a[]={0,0,0};
	      for (int i=0;i<3;i++) {
		  a[i]=c[i]+m[i]+e[i]; 
		  a[i]=a[i]/3;	  
	     }
		  for (int i=0;i<3;i++)
	     	System.out.println(n[i]+"號的平均： "+a[i]+" 分");
	}
   
public boolean allPass(int c, int m, int e)
   {
	   
   if ( c >= 60 && m >= 60 && e >= 60)
       return true;
   else
  	 return false;
   }
}

public class test{
    public static void main(String[] args){
    	score Yan = new score();
    	score Wang= new score();
    	score Kuo = new score();
    	String []nam={"Yan","Wang","Kuo"};
    	int [] chi ={75,48,67}; 
        int [] eng ={32,66,80}; 
        int [] math={78,45,62};
        score x = new score();
        Wang.ave(nam,chi,eng,math);
    	if(Yan.allPass(75,32,78))
    	 System.out.println("Yan all pass");
    	else
    	 System.out.println("Yan didn't all pass");
    	
    	if(Wang.allPass(48,66,45))
    	 System.out.println("Wang all pass");
    	else
    	 System.out.println("Wang  didn't all pass");
    	
    	if(Kuo.allPass(67,80,61))
    	 System.out.println("Kuo all pass");
    	else
    	 System.out.println("Kuo didn't all pass");

    }
}
