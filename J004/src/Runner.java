
public class Runner {

	public static void main(String[] args) {
		ChineseSpeaker cs = new ChineseSpeaker();

		EnglishSpeaker es = new EnglishSpeaker();

		for (int id = 0; id < 10; id++) {
			cs.speakRandomNum();
		}

		for (int id = 0; id < 10; id++) {
			es.speakRandomNum();
		}
	}

}
