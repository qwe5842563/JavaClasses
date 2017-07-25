/*
 * 發牌(deal)、洗牌(Shuffling)、撲克牌(playing cards)、發牌者(dealer)
 * 紅心(heart)、黑桃(spade)、方塊(diamond)、梅花(club)
 */
import java.util.*;

public class Dealer {
	int randomPoker = 0;
	ArrayList<Integer> handsPlayingCard = new ArrayList<Integer>();
	ArrayList<Integer> dealPlayingCard = new ArrayList<Integer>();
	int pokerNumber = 0;// 撲克牌張數
	String flower = ""; // 花色
	String pokerNumbering[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	// 撲克牌編號
	String poker_no = "";// 第幾張

	public void shuffling() {
		// 產生52張牌
		for (int id1 = 0; id1 < 52; id1++) {
			handsPlayingCard.add(id1);

		}

	}

	public void deal() {
		for (int id1 = 0; id1 < 52; id1++) {
			randomPoker = (int) (Math.random() * handsPlayingCard.size());
			dealPlayingCard.add(handsPlayingCard.get(randomPoker));// 發出去的牌
			handsPlayingCard.remove(randomPoker);// 將發出去的牌從手中移除
		}
		for (int id1 = 0; id1 < dealPlayingCard.size(); id1++) {
			pokerNumber = dealPlayingCard.get(id1);
			if (pokerNumber >= 1 && pokerNumber <= 13) {
				flower = "♠"; // 黑桃
				poker_no = pokerNumbering[pokerNumber - 1];
			}
			if (pokerNumber >= 14 && pokerNumber <= 26) {
				flower = "♣"; // 梅花
				poker_no = pokerNumbering[pokerNumber - 14];
			}
			if (pokerNumber >= 27 && pokerNumber <= 39) {
				flower = "♥"; // 愛心
				poker_no = pokerNumbering[pokerNumber - 27];
			}
			if (pokerNumber >= 40 && pokerNumber <= 52) {
				flower = "♦"; // 方塊
				poker_no = pokerNumbering[pokerNumber - 40];
			}

			if ((id1 % 13) == 0 && id1 != 0)
				System.out.println("");

			if ((id1 % 13) == 0)
				System.out.print("玩家" + ((id1 / 13) + 1) + "的牌 : ");

			System.out.print(flower + poker_no + " ");
		}
	}

	public static void main(String[] args) {
		Dealer Dealer = new Dealer();
		Dealer.shuffling();
		Dealer.deal();

	}

}
