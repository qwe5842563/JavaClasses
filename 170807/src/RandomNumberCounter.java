import java.util.Scanner;

/**
 * ��@�ɶ��O���G
 * ����G<08/07>: <00:00>~<00:00>: <02:00>
 * �{���ؼСG�]�p�üƲ��ͦ��Ʋέp��,�^���Ҧ��ƥت����ͦ��ơB���v,�^���ӧO�ƥت����ͦ��ơB���v�A�H�Φ^���Ҧ��ƥءC
 * �]�p�W��G�ѨϥΪ̿�J���榸��,�_�l���,�������,���O��X�Ҧ��ƥت����ͦ��ơB���v,�ӧO�ƥت����ͦ��ơB���v,�Ҧ��ƥءC
 * �]�p�Q�k�GallHitCounts(�Ҧ��ƥت����ͦ���),allHitPercents(�Ҧ��ƥت����;��v),
 * hitCountOf(�ӧO�ƥت����ͦ���),hitPercentOf(�ӧO�ƥت����;��v),
 * allNumbers(�Ҧ��ƥ�),dblPercent(�X�{��v),hitCounts(�R����),executionFrequency(���榸��)
 * ��random����0��9���ü�,�ѨϥΪ̿�J���榸��,�_�l���,�������,����C�Ӥ�k ���O��X�Ҧ��ƥت����ͦ���,�Ҧ��ƥت����;��v,
 * �ӧO�ƥت����ͦ���,�ӧO�ƥت����;��v,�H�ΩҦ��ƥءC
 * �����X�G�ŧi�@�Ӱ}�C��iHitCnts,���׬�10
 * �ŧi�@��executionFrequency���s�x���榸��
 * �ϥ�Scanner���ϥΪ̿�J���榸��
 * �ϥ�Scanner���ϥΪ̿�J�_�l���
 * �ϥ�Scanner���ϥΪ̿�J�������
 * ��random�����H���ü�
 * hitCounts�x�s�C�ӼƦr�R����
 * �]�w��kallHitCounts
 * �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���� 
 * output�C�ӼƦr���ͦ���
 * �]�w��kallHitPercents 
 * �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���� 
 * �ϥΰj��N�C�ӼƦr��v dblPercent =(hitCounts(0~9)/frequency)*100
 * output number 0~9 + �X�{����  + dblPercent
 * �]�w��khitCountOf
 * �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���� 
 * �ϥ�Scanner���ϥΪ̿�J�@�� output �@�ƩҲ��ͦ���
 * �]�w��khitPercentOf
 * �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���� 
 * �ϥ�Scanner���ϥΪ̿�J�@�� output �@�ƩҲ��;��v
 * �]�w��kallNumbers
 * �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���
 * 
 */

public class RandomNumberCounter {

	public RandomNumberCounter(int startInteger, int endInteger, int frequency) {
	}

	// �ŧi�@�Ӱ}�C��iHitCnts,���׬�10
	static int[] hitCounts = new int[10];

	public static int[] allHitCounts() {
		char yesNo;
		System.out.print("�O�_�n����Ҧ��ƥت����ͦ���?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				System.out.println("�Ʀr" + id + "����" + hitCounts[id] + "��");
			}
		}
		if (yesNo == 'n') {

		}
		return hitCounts;
	}

	public static double allHitPercents(int frequency) {
		char yesNo;
		double dblPercent = 0;
		// �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_����
		System.out.print("�O�_�n����Ҧ��ƥت����;��v?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				// �p��ʤ���
				dblPercent = 100.0 * (hitCounts[id] / (double) frequency);
				System.out.print("�Ʀr:" + id + "�X�{��v:");
				System.out.printf("%.2f", dblPercent);
				System.out.println("%");
			}
		}
		if (yesNo == 'n') {

		}
		return dblPercent;
	}

	public static int hitCountOf() {
		char yesNo;
		int numbers = 0;
		// �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_����
		System.out.print("�O�_�n����ӧO�ƥت����ͦ���?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {

			// ���ϥΪ̿�J0~9���@��
			System.out.print("�п�J0~9���Ʀr:");
			numbers = new Scanner(System.in).nextInt();

			System.out.println("�Ʀr" + numbers + "����" + hitCounts[numbers] + "��");
		}
		if (yesNo == 'n') {

		}
		return numbers;
	}

	public static double hitPercentOf(int frequency) {
		char yesNo;
		double dblPercent = 0;
		// �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_����
		System.out.print("�O�_�n����ӧO�ƥت����;��v?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			int numbers = 0;
			// ���ϥΪ̿�J0~9���@��
			System.out.print("�п�J0~9���Ʀr:");
			numbers = new Scanner(System.in).nextInt();
			// �p��ʤ���
			dblPercent = 100.0 * (hitCounts[numbers] / (double) frequency);
			System.out.print("�Ʀr:" + numbers + "�X�{��v:");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");
		}
		if (yesNo == 'n') {

		}
		return dblPercent;
	}

	public static int[] allNumbers() {
		char yesNo;
		// �ϥ�Scanner���ϥΪ̿�J(y/n)�O�_���
		System.out.print("�O�_�n��ܩҦ��ƥ�?(y/n)");
		yesNo = (char) new Scanner(System.in).next().charAt(0);
		if (yesNo == 'y') {
			for (int id = 0; id < hitCounts.length; id++) {
				System.out.println("�Ʀr" + id);
			}
		}
		if (yesNo == 'n') {
			System.out.println("�����");
		}
		return hitCounts;
	}

	public static void main(String[] args) {
		
		// �ŧi�@��executionFrequency���s�x���榸��
		int startInt = 0;
		int endInt = 0;
		int executionFrequency = 0;
		Scanner number = new Scanner(System.in);
		// ���ϥΪ̿�J���榸��
		System.out.print("�п�J���榸��:");
		executionFrequency = number.nextInt();
		// ���ϥΪ̿�J�_�l���
		System.out.print("�п�J�_�l���:");
		startInt = number.nextInt();
		// ���ϥΪ̿�J�������
		System.out.print("�п�J�������:");
		endInt = number.nextInt();
		// �j����榸�Ƭ���J����
		for (int id = 0; id < executionFrequency; id++) {
			// �����H���ü�
			int iNum = (int) (Math.random() * (endInt - startInt + 1)) + startInt;
			// �N���ͪ��üƦs���}�C�����ȶi��֥[
			hitCounts[iNum]++;
		}
		allHitCounts();
		allHitPercents(executionFrequency);
		hitCountOf();
		hitPercentOf(executionFrequency);
		allNumbers();
	}

}
