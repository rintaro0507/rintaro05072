package curriculum.d;

public class Question7 {
	private String name;
	private int hp;
	private int at;
	private int sp;

	public Question7(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAt() {
		return at;
	}

	public int getSp() {
		return sp;
	}

	public void takeDamage(int damage) {
		hp -= damage;
	}

	public boolean isAlive() {
		return hp > 0;
	}
}
