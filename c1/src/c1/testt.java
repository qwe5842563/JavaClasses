package c1;
class Score1   //主類別 
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
   public Score1(String n,String lastname, char g, int id,  int c, int e, int m, int chem)
   {
	   nam=n;
       chi=c;
       eng=e;
       math=m;
       this.chem=chem;   
      student = new Data(lastname, id, g); // 自行定義的類別: 類別名稱叫Date
                                   //物件名稱: birthday
   }
   // 無輸入無回傳
   public void print()//輸出裝置 1
   {  // 
      System.out.println("[資料]============");
      System.out.println("chi: " + chi);
      System.out.println("eng: " + eng);
      System.out.println("math: " + math);
      System.out.println("chem: " + chem);
      student.printData();//呼叫並執行自行定義的類別的方法
   }
   public void ave(String n[],int c[],int e[],int m[],int chem[])
   {
	   float a[]={0,0};
	      for (int i=0;i<2;i++) {
		  a[i]=c[i]+e[i]+m[i]+chem[i]; 
		  a[i]=a[i]/4;	  
	     }
		  for (int i=0;i<2;i++)
	     	System.out.println(n[i]+"的平均： "+a[i]+" 分");
   }
   public void fail(String n[],int c[],int e[],int m[],int chem[]){
	   int nopass[]={0,0}; //描述每個學生有幾科不及格
		  for (int i=0;i<2;i++)
	      {if (c[i]<60) nopass[i]++; 
	      if (e[i]<60) nopass[i]++; 
	      if (m[i]<60) nopass[i]++; 
	      if (chem[i]<60) nopass[i]++;
	      System.out.println(n[i]+"有"+nopass[i]+"科不及格");
	      }
   }
}
class Data   // 自行定義的類別
{  // 三個屬性資料
   private String lastname; //日期
   private int id; //月份
   private char g;  //年分
   // 將主類別資料傳遞到自行定義的類別
   public Data(String lastname,int id, char g)//自行定義的類別:建構子
   {
      this.lastname = lastname; 
      this.id = id;
      this.g = g;
   }
   // 
   public void printData()
   {  //無輸入無回傳 
      System.out.println("lastname "+lastname);
      System.out.println("id "+id);
      System.out.println("gender "+g);
   }
}
// 
public class testt
{   // 
    public static void main(String[] args)
    {   // 
    	int [] chi ={85,72}; 
        int [] eng ={68,45}; 
        int [] math={47,52};
        int [] chem={54,89};
    	String []nam={"Wang","Chen"};
        Score1 wang = new Score1("Wang","TungYi",'M',6,85,68,47,54);
        wang.ave(nam,chi,eng,math,chem);
        wang.fail(nam,chi,eng,math,chem);
        wang.print(); // 呼叫物件的實例方法

    }
}