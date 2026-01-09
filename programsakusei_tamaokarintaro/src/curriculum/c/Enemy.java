package curriculum.c;

import java.util.Random;

public class Enemy {

	Random rand = new Random();

	public int getHand() {
		return rand.nextInt(3);
	}

}
