package curriculum.c;

import java.util.Random;

public class Enemy {

	private java.util.Random rand = new Random();
	
	public int gethand() {
		return rand.nextInt(3);
	}

}
