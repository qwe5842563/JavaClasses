package c1;
import java.util.*;


public class work2_2 {
	/*
	 * �D�ءG�@��K�l�ĤT���ͤU�Ĥ@��K�l�A����C�Ӥ�ͤU�@��K�l �]�p�G class RabbitCouple int bornMonthSeq;
	 * public RabbitCouple giveBirthTo(int monthSeq) if monthSeq - bornMonthSeq
	 * >= 2 then return new RabbitCouple(monthSeq) else return null constructor
	 * RabbitCouple(int bornMonthSeq)
	 * 
	 */

	public static void main(String[] args) {

		// �R�O�C�ѼơG��N��

		// �\��G�C�X�C��K�l��ơA�q�Ĥ@����N��

		/*
		 * 
		 * �]�p�G
		 * 
		 * ���ѥX�R�O�C�ѼơA�ӼƬ�1�A���ର��ơA��Ƥj��0
		 * 
		 * �����ͲĤ@��K�l�A���߸s ArrayList <RabbitCouple> alRabbitCouples
		 * 
		 * �q�Ĥ@����n��
		 * 
		 * �����Ҧ����ߤl��
		 * 
		 * �A�p��ߤl�Ӽ�
		 * 
		 * �L�X
		 * 
		 */

		// * ���ѥX�R�O�C�ѼơA�ӼƬ�1�A���ର��ơA��Ƥj��0
		
		if (args == null || args.length != 1) {

			System.out.println("�ѼƭӼƥ������@��!!");

			System.exit(1);

		}

		
		int monthSeq = 0;
		try {

			monthSeq = Integer.parseInt(args[0]);

			if (monthSeq <= 0) {

				System.out.println("��J�릸�����j�󵥩�1!!");

				System.exit(1);

			}

		} catch (Exception e) {

			System.out.println("��J��ƭȮ榡���~!!");

			System.exit(1);

		}

		// * �����ͲĤ@��K�l�A���߸s ArrayList <RabbitCouple> alRabbitCouples

		RabbitCouple rabbitCouple = new RabbitCouple(1);

		ArrayList<RabbitCouple> alRabbitCouples = new ArrayList<RabbitCouple>();

		alRabbitCouples.add(rabbitCouple);

		// * �q�Ĥ@����n��

		for (int monthId = 1; monthId <= monthSeq; monthId++) {

			// * �����Ҧ����ߤl��

			/*
			 * 
			 * ����{�b�ߤl���
			 * 
			 * �v���ˬd�ߤl�Ͳ����ΡA���ʹN�[�J�߸s
			 * 
			 * �o��]����ͪ��ߤl���|�͡A�ҥH�ˬd�J�����ߤl�Y�i
			 * 
			 */

			// * ����{�b�ߤl���

			int coupleCnt = alRabbitCouples.size();

			// * �o��]����ͪ��ߤl���|�͡A�ҥH�ˬd�J�����ߤl�Y�i=> index��즳���ߤl

			for (int id = 0; id < coupleCnt; id++) {

				// * �v���ˬd�ߤl�Ͳ����ΡA���ʹN�[�J�߸s

				RabbitCouple newRabbitCouple = alRabbitCouples.get(id).giveBirth(monthId);

				if (newRabbitCouple == null) {

					continue;

				}

				// ���ʹN�[�J�߸s

				alRabbitCouples.add(newRabbitCouple);

			}

			// * �A�p��ߤl�Ӽ�

			int totCoupleCnt = alRabbitCouples.size();

			// * �L�X

			System.out.println("�릸�G" + monthId + "\t�A�ߤl��ơG\t" + totCoupleCnt);

		}

	}

}

class RabbitCouple {

	private int bornMonthSeq;// �X�ͤ릸

	public RabbitCouple(int monthSeq) {

		this.bornMonthSeq = monthSeq;

	}

	public RabbitCouple giveBirth(int monthSeq) {

		if ((monthSeq - this.bornMonthSeq) >= 2) {// �ĤT�Ӥ��A�C��|�ͤ@��

			return new RabbitCouple(monthSeq);

		} else {

			return null;// �S����

		}

	}

}
