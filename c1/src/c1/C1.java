package c1;

public class C1 {

	public static void main(String[] args) {
		int chi []={75,	74,	43,	45,	85,	42};
		float aa=ave(chi);
		System.out.println("��媺����"+aa);
        int eng[]={42,54,55,70,42,85};
        System.out.println("�^�媺����"+ave(eng));
        fail(chi);
        int math []={86,35,45,62,66,65};
        int bb=max(math); //�ƾǳ̰����y��
        System.out.println("�ƾǳ̰������y��:"+(bb+1)+"��"); //�ƾǳ̰����y��
        min(math);//�ƾǳ̧C��
        total(math,eng,chi);//�`�M�̰����y��
	}
	public static float ave(int x[])
	{  int ss=0;
	for (int i=0;i<6;i++)
		ss=ss+x[i];
	ss=ss/6;
	return ss;
	}
	public static void fail(int y[])
	{ 
		for (int i=0;i<6;i++)
		if (y[i]<60)
			System.out.println("���ή檺�y��: " + (i+1));
	}
	public static int max(int z[]) //�ƾǳ̰������y��
	{
		int ii=0,ww=0;
		for(int i=0;i<6;i++)
		if(ii<z[i]){
		ii=z[i];
		ww=i;
		}
		return ww;
	}
	public static void min(int xx[]){ //�ƾǳ̧C��
		int qq=xx[0];
		for(int i=0;i<6;i++)
    		if (qq>xx[i]) 
    			{
    			qq=xx[i];
    			}
		System.out.println("�ƾǳ̧C���O:"+qq+"��");
	}
	public static void total(int gg[],int cc[],int ff[]){ //�`�M�̰����y��
		int oo=0,pp=0;
		for(int i=0;i<6;i++)
			if(oo<gg[i]+cc[i]+ff[i]){
				oo=gg[i]+cc[i]+ff[i];
				pp=i;
			}
		System.out.println("�`�M�̰������y��:"+(pp+1)+"��");
	}
	}
