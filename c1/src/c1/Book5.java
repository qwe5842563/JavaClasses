package c1;

/*
 * �D�ؿ�Xisland=Fiji
		island=Cozumel
		island=Bermuda
		island=Azores
 */
public class Book5 {
	public static void main(String[] args) {
		String[] islands = new String[4];// �ŧi�|��islands���r��
		int[] index = new int[4];// �ŧi�|��index���ܼ�
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		int ref; // �ŧiislands���s��
		int y = 0;
		while (y < 4) {
			System.out.print("island=");
			ref = index[y];
			System.out.println(islands[ref]);
			y = y + 1;
		}
	}
}
