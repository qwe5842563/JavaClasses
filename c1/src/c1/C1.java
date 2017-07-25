package c1;

public class C1 {

	public static void main(String[] args) {
		int chi []={75,	74,	43,	45,	85,	42};
		float aa=ave(chi);
		System.out.println("國文的平均"+aa);
        int eng[]={42,54,55,70,42,85};
        System.out.println("英文的平均"+ave(eng));
        fail(chi);
        int math []={86,35,45,62,66,65};
        int bb=max(math); //數學最高分座號
        System.out.println("數學最高分的座號:"+(bb+1)+"號"); //數學最高分座號
        min(math);//數學最低分
        total(math,eng,chi);//總和最高的座號
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
			System.out.println("不及格的座號: " + (i+1));
	}
	public static int max(int z[]) //數學最高分的座號
	{
		int ii=0,ww=0;
		for(int i=0;i<6;i++)
		if(ii<z[i]){
		ii=z[i];
		ww=i;
		}
		return ww;
	}
	public static void min(int xx[]){ //數學最低分
		int qq=xx[0];
		for(int i=0;i<6;i++)
    		if (qq>xx[i]) 
    			{
    			qq=xx[i];
    			}
		System.out.println("數學最低分是:"+qq+"分");
	}
	public static void total(int gg[],int cc[],int ff[]){ //總和最高的座號
		int oo=0,pp=0;
		for(int i=0;i<6;i++)
			if(oo<gg[i]+cc[i]+ff[i]){
				oo=gg[i]+cc[i]+ff[i];
				pp=i;
			}
		System.out.println("總和最高分的座號:"+(pp+1)+"號");
	}
	}
