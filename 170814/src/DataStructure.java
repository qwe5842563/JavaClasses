import java.util.Scanner;

/**
 * ��@�ɶ��O���G
 * ����G<08/15>: <00:00>~<00:00>: <02:00>
 * 	   <08/16>: <00:00>~<00:00>: <02:15>
 * �{���ؼСG�]�p�@��������Ƶ��c�A�Ψө���
 * �\��y�z
 * �@�ӥi�H��mn�Ӿ�ƪ��w�İ�
 * ��ƨ̦���m
 * �Ŷ������ɡA�q�Ĥ@�Ӿ�ƶ}�l���U�л\
 * �]�p�W��G
 * �غc�G
 * 	�ǤJ����n�A�غc�@���׬�n���w�İ�
 * �g�J�G
 * 	�@�Ӿ��
 * �g�J�G
 * 	�@�Ӿ�ư}�C
 * Ū�X�G
 * 	�ثe�b�w�İϪ���ơA�Ш̸�ƶ��ǱƦC
 * �]�p�Q�k�G���إ߫غc���A�g�@��write����k�i�H�g�J�@�Ӿ�ơA�g�@��writeArray����k�i�H�g�J�@�Ӿ�ư}�C�A
 * �g�@��readOut����k�i�HŪ�X�ثe�w�İϪ���ơC
 * 
 * �����X�G
 * �]�w�غc�l�̶ǤJ���ȨM�w�}�C�j�p
 * 
 * �]�wwrite����k:
 * �p���W�L�w�İ�
 * �N��J�ȥ[�Jbuffer��
 * �W�L�w�İϮ�
 * �N��J���ȥ[�Jbuffer��
 * ���J�ȵ���}�C�̤j�Ȯɭ��Y�ӹL
 * 
 * �]�wwriteArray����k:
 * �p���W�L�w�İ�
 * �N��J�ȥ[�Jbuffer��
 * �W�L�w�İϮ�
 * �N��J���ȥ[�Jbuffer��
 * ���J�ȵ���}�C�̤j�Ȯɭ��Y�ӹL
 */

public class DataStructure {
	private int[] buffer;
	private int length;
	private int firstLocation = 0;
	private int size = 0;

	// �]�w�غc�l�̶ǤJ���ȨM�w�}�C�j�p
	public DataStructure(int length) {
		buffer = new int[length];
		this.length = length;
	}

	// �g�J�@�Ӿ��
	public void write(int number) {
		// ���W�L�w�İ�
		if (size < length) {
			// �N��J���ȥ[�Jbuffer��
			buffer[size] = number;
			size++;
			// �W�L�w�İ�
		} else {
			// �N��J���ȥ[�Jbuffer��
			buffer[size] = number;
			size++;
			// ���J�ȵ���}�C�̤j�Ȯɭ��Y�ӹL
			if (size == buffer.length) {

				size = 0;
			}
		}
	}

	// �g�J�@�Ӿ�ư}�C
	public void writeArray(int[] array) {
		for (int id1 = 0; id1 < array.length; id1++) {
			// ���W�L�w�İ�
			if (size < length) {
				// �N��J���ȥ[�Jbuffer��
				buffer[size] = array[id1];
				size++;
				// �W�L�w�İ�
			} else {
				// �N��J���ȥ[�Jbuffer��
				buffer[size] = array[id1];
				size++;
				// ���J�ȵ���}�C�j�p�ɭ��Y�ӹL
				while (size == buffer.length) {
					size = 0;
				}
			}
		}
	}

	public int[] readOut() {
		if (size <= 0) {
			return null;
		}
		int[] array = new int[size];
		for (int id1 = 0; id1 < size; id1++) {
			array[id1] = buffer[(firstLocation + id1) % length];
		}
		return array;
	}

}
