/**
 * ��@�ɶ��O���G ����G<07/27>: <00:00>~<00:00>: <00:10>
 * �{���ؼСG�����ϥ�Helloer��public void main�Ӱ���Runner���u�@
 * �]�p�W��G�ϥΤ�ksayHello�b�ù��W�L�X"I��m a helloer."
 * �]�p�Q�k�G�إߤ�ksayHello��k����X"I��m a helloer.
 * �bmain���إߤ@�Ӫ���helloer�A�I�s��ksayhello
 * �����X�G
 * �إߤ�ksayHello
 * ��k��X"I��m a helloer."
 * �إߪ���helloer
 * �I�ssayhello��X"I��m a helloer.
 */

public class Helloer {
	void sayHello() { //�إߤ�ksayHello
		System.out.print("I��m a helloer."); //��k��X"I��m a helloer."
	}

	public static void main(String[] args) {
		Helloer helloer = new Helloer(); //�إߪ���helloer
		helloer.sayHello(); //�I�ssayhello��X"I��m a helloer.

	}

}
