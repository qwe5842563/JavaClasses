package c1;

public class C2 {

	public static void main(String[] args) {
		String[] s =new String[]{"座號" ,"國文","英文","數學","總分", "平均分數"}; 
		String sr[] = {"國文","英文","數學"}; 
		for(int i =0 ;i<s.length; i++){ 
		System.out.print(s[i] + "\t" +" ");//先印出第一行文字部分 加上\t 使文字有間隔 
		} 
		System.out.println(); 
		int ast[][] = {{90,80,70},{87,79,89},{78,85,86},{84,61,77},{92,88,90}}; 
		int i,j,k=0; 
		for( i=0;i<ast.length;i++){ 
		System.out.println((i+1) + "號得分:"); //在第一個迴圈印出座號 
		int ss = 0; 
		for( j=0;j<ast[j].length;j++){ 
		System.out.print("\t" + ast[i][j]); //利用\t平行跳格始分數與上方科目對齊 
		ss+=ast[i][j]; 
		} 
		System.out.println(" " + ss+" "+ ss/3); //利用 " " 使間隔大些 
		} 
		System.out.println(); 
		int sum2=0; 
		for(int [] x : ast){ 
		for(int y : x){ 
		sum2+=y; 
		} 
		} 
		for(int h=0;h<ast[h].length;h++){//ast[h].length為二維陣列外圈的一維陣列長度的h有五個元素 
		int totole = 0; 
		for(int f=0;f<ast.length;f++){ 
		totole+=ast[f][h]; //使用雙迴圈取出陣列中所有分數加總 
		} 
		System.out.println("每科" + sr[h]+"平均分: "+totole/5); 
		} 
		System.out.println("全班總平均分:" + sum2/5); 
		} 
		} 