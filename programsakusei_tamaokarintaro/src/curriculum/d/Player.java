package curriculum.d;

import java.util.Random;

public class Player extends Question7 {

	public Player(String name) {
		super(
				name,
				new Random().nextInt(41) + 60,
				new Random().nextInt(6) + 10,
				new Random().nextInt(6) + 5);
	}
}
