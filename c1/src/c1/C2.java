package c1;

public class C2 {

	public static void main(String[] args) {
		String[] s =new String[]{"�y��" ,"���","�^��","�ƾ�","�`��", "��������"}; 
		String sr[] = {"���","�^��","�ƾ�"}; 
		for(int i =0 ;i<s.length; i++){ 
		System.out.print(s[i] + "\t" +" ");//���L�X�Ĥ@���r���� �[�W\t �Ϥ�r�����j 
		} 
		System.out.println(); 
		int ast[][] = {{90,80,70},{87,79,89},{78,85,86},{84,61,77},{92,88,90}}; 
		int i,j,k=0; 
		for( i=0;i<ast.length;i++){ 
		System.out.println((i+1) + "���o��:"); //�b�Ĥ@�Ӱj��L�X�y�� 
		int ss = 0; 
		for( j=0;j<ast[j].length;j++){ 
		System.out.print("\t" + ast[i][j]); //�Q��\t�������l���ƻP�W���ع�� 
		ss+=ast[i][j]; 
		} 
		System.out.println(" " + ss+" "+ ss/3); //�Q�� " " �϶��j�j�� 
		} 
		System.out.println(); 
		int sum2=0; 
		for(int [] x : ast){ 
		for(int y : x){ 
		sum2+=y; 
		} 
		} 
		for(int h=0;h<ast[h].length;h++){//ast[h].length���G���}�C�~�骺�@���}�C���ת�h�����Ӥ��� 
		int totole = 0; 
		for(int f=0;f<ast.length;f++){ 
		totole+=ast[f][h]; //�ϥ����j����X�}�C���Ҧ����ƥ[�` 
		} 
		System.out.println("�C��" + sr[h]+"������: "+totole/5); 
		} 
		System.out.println("���Z�`������:" + sum2/5); 
		} 
		} 