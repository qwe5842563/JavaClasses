package c1;

class Score   //主類別 
{  // 
   private int chi;         // 編號:成員函數1
   private int eng;
   private int math;
   private int chem;
   private String lastname;
   private char gender;// 等級:成員函數2
   private Data student;  // 生日:自行定義的類別
   private int id;
   private String nam;
   // 建構子: 使用參數設定初始值
   public Score(String n,String lastname, char g, int id,  int c, int e, int m, int chem)
   {
	   nam=n;
       chi=c;
       eng=e;
       math=m;
       this.chem=chem;   
      student = new Data(lastname, id, g); // 自行定義的類別: 類別名稱叫Date
                                   //物件名稱: birthday
   }
   public void ave(String n[],int c[],int e[],int m[],int chem[])
   {
	   float a[]={0,0};
	      for (int i=0;i<4;i++) {
		  a[i]=c[i]+e[i]+m[i]+chem[i]; 
		  a[i]=a[i]/4;	  
	     }
		  for (int i=0;i<2;i++)
	     	System.out.println(n[i]+"的平均： "+a[i]+" 分");
   }
   public void fail(int x,int y,int z,int q){
	   int nopass=0; //描述每個學生有幾科不及格
		  for (int i=0;i<6;i++)
	      {if (x<60) nopass++; 
	      if (y<60) nopass++; 
	      if (z<60) nopass++; 
	      if (q<60) nopass++;
	      System.out.print("不及格:"+nopass);
	      }
   }
}
// 
public class tt
{   // 
    public static void main(String[] args)
    {   // 
    	int [] chi ={85,72}; 
        int [] eng ={68,45}; 
        int [] math={47,52};
        int [] chem={54,89};
    	String []nam={"Wang","Chen"};
        Score wang = new Score("Wang","TungYi",'M',6,85,68,47,54);
        wang.ave(nam,chi,eng,math,chem);
    }
}
