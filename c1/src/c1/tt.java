package c1;

class Score   //�D���O 
{  // 
   private int chi;         // �s��:�������1
   private int eng;
   private int math;
   private int chem;
   private String lastname;
   private char gender;// ����:�������2
   private Data student;  // �ͤ�:�ۦ�w�q�����O
   private int id;
   private String nam;
   // �غc�l: �ϥΰѼƳ]�w��l��
   public Score(String n,String lastname, char g, int id,  int c, int e, int m, int chem)
   {
	   nam=n;
       chi=c;
       eng=e;
       math=m;
       this.chem=chem;   
      student = new Data(lastname, id, g); // �ۦ�w�q�����O: ���O�W�٥sDate
                                   //����W��: birthday
   }
   public void ave(String n[],int c[],int e[],int m[],int chem[])
   {
	   float a[]={0,0};
	      for (int i=0;i<4;i++) {
		  a[i]=c[i]+e[i]+m[i]+chem[i]; 
		  a[i]=a[i]/4;	  
	     }
		  for (int i=0;i<2;i++)
	     	System.out.println(n[i]+"�������G "+a[i]+" ��");
   }
   public void fail(int x,int y,int z,int q){
	   int nopass=0; //�y�z�C�Ӿǥͦ��X�줣�ή�
		  for (int i=0;i<6;i++)
	      {if (x<60) nopass++; 
	      if (y<60) nopass++; 
	      if (z<60) nopass++; 
	      if (q<60) nopass++;
	      System.out.print("���ή�:"+nopass);
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
