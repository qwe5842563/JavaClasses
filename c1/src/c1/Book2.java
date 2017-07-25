package c1;

class Drumkit {
	boolean topHat = true;
	boolean snare = true;

	void playsnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}

public class Book2 {
	public static void main(String[] args) {
		Drumkit d = new Drumkit();
		d.snare = false;
		d.playsnare();
		d.playTopHat();
		if (d.snare == true) {
			d.playsnare();
		}

	}

}
