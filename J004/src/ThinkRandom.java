
public abstract class ThinkRandom {
	protected int getRandomNum() {
		int random = (int) (Math.random() * 10) + 1;

		return random;
	}

	public abstract void speakRandomNum();
	
}
