package c1;
class rowboat extends boat{
	public void rowTheboat(){
		System.out.print("stoke natasha");
	}
}
class boat{
private int length ;
public void setLength(int len){
	length = len;
}
public int getLength(){
	return length;
}
public void move(){
	System.out.print("drift ");
}
}
class sailboat extends boat{
	public void move(){
		System.out.print(" hoist sail");
	}
}
public class Book12 {

	public static void main(String[] args) {
		boat b1 = new boat();
		sailboat b2 = new sailboat();
		rowboat b3 = new rowboat();
		b2.setLength(32);
		b1.move();
		b3.move();
		b2.move();
		

	}

}
