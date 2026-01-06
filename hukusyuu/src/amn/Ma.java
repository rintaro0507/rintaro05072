package amn;

public class Ma {

	public static void main(String[] args) {
		Ani ani = new Ani();
		ani.setName("ライオン");
		ani.setLength(2.1);
		ani.setSpeed(80);
		
		System.out.println("動物名" + ani.getName());
		System.out.println("体長" + ani.getLength() + "m");
		System.out.println("速度" + ani.getSpeed());

	}

}
