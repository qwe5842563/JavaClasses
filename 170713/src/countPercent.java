import java.util.Scanner;

/**
 * ��@�ɶ��O���G ����G<07/17>: <10:00>~<11:15>: <01:15>
 * �{���ؼСG�ϥ�Math.random()�A����0��9���üơA�íp��b����10���A100���A1000�������ΤU�A�C�ӼƦr�X�{����ҡC
 * �]�p�W��G��X�C�ӼƦr�U�۪��X�{��v,�X�{��v�H�p���I������ܡC
 * �]�p�Q�k�GdblPercent(�X�{��v),hitCounts(�R����),executionFrequency(���榸��)
 * ��Scanner���ϥΪ̿�J���榸��,����random0��9���ü�,�Q�ΰj���hitCounts�x�s����0~9���R����,
 * �A�ΰj���dblPercent��X�C�ӼƦr���X�{��v,��System.out.printf("%.2f")��ܤp�ƫ���C 
 * �����X�GhitCounts = int[10] ���ͤ@�Ӫ��׬�10���}�C
 * ��executionFrequency���ϥΪ̿�J���榸��
 * ���� 0~9 random�ü�
 * hitCounts�x�s�C�ӼƦr�R���� 
 * �ϥΰj��N�C�ӼƦr��v dblPercent =(hitCounts(0~9)/executionFrequency)*100 
 * output number 0~9 + �X�{����  + dblPercent
 */

public class countPercent {

	public static void main(String[] args) {

		int executionFrequency = 0; //�ŧi�@��executionFrequency���s�x���榸��
		Scanner frequency = new Scanner(System.in);
		System.out.print("�п�J���榸��:"); //���ϥΪ̿�J���榸��
		executionFrequency = frequency.nextInt();
		int[] hitCounts = new int[10]; //�ŧi�@�Ӱ}�C��iHitCnts,���׬�10
		for (int id = 0; id < executionFrequency; id++) { // �j����榸�Ƭ���J����
			int iNum = (int) (10 * Math.random()); //����0~9���H���ü�
			hitCounts[iNum]++; //�N���ͪ��üƦs���}�C�����ȶi��֥[
		}
		for (int id = 0; id < hitCounts.length; id++) { //
			double dblPercent = 100.0 * (hitCounts[id] / (double) executionFrequency);
			//�p��ʤ���
			System.out.print("�Ʀr:" + id + " �X�{	" + hitCounts[id] + "��" + "�X�{��v:");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");
		}

	}
}
