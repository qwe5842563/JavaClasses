package c1;
class Score1   //�D���O 
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
   public Score1(String n,String lastname, char g, int id,  int c, int e, int m, int chem)
   {
	   nam=n;
       chi=c;
       eng=e;
       math=m;
       this.chem=chem;   
      student = new Data(lastname, id, g); // �ۦ�w�q�����O: ���O�W�٥sDate
                                   //����W��: birthday
   }
   // �L��J�L�^��
   public void print()//��X�˸m 1
   {  // 
      System.out.println("[���]============");
      System.out.println("chi: " + chi);
      System.out.println("eng: " + eng);
      System.out.println("math: " + math);
      System.out.println("chem: " + chem);
      student.printData();//�I�s�ð���ۦ�w�q�����O����k
   }
   public void ave(String n[],int c[],int e[],int m[],int chem[])
   {
	   float a[]={0,0};
	      for (int i=0;i<2;i++) {
		  a[i]=c[i]+e[i]+m[i]+chem[i]; 
		  a[i]=a[i]/4;	  
	     }
		  for (int i=0;i<2;i++)
	     	System.out.println(n[i]+"�������G "+a[i]+" ��");
   }
   public void fail(String n[],int c[],int e[],int m[],int chem[]){
	   int nopass[]={0,0}; //�y�z�C�Ӿǥͦ��X�줣�ή�
		  for (int i=0;i<2;i++)
	      {if (c[i]<60) nopass[i]++; 
	      if (e[i]<60) nopass[i]++; 
	      if (m[i]<60) nopass[i]++; 
	      if (chem[i]<60) nopass[i]++;
	      System.out.println(n[i]+"��"+nopass[i]+"�줣�ή�");
	      }
   }
}
class Data   // �ۦ�w�q�����O
{  // �T���ݩʸ��
   private String lastname; //���
   private int id; //���
   private char g;  //�~��
   // �N�D���O��ƶǻ���ۦ�w�q�����O
   public Data(String lastname,int id, char g)//�ۦ�w�q�����O:�غc�l
   {
      this.lastname = lastname; 
      this.id = id;
      this.g = g;
   }
   // 
   public void printData()
   {  //�L��J�L�^�� 
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
        wang.print(); // �I�s���󪺹�Ҥ�k

    }
}