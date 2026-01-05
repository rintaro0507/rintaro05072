package curricurum.h;

public class Main {

	public static void main(String[] args) {
		FullTimeEmployee fullTime = new FullTimeEmployee("", "");
		PartTimeEmployee partTime = new PartTimeEmployee("", "");

		int hours = 9;

		System.out.println(
				"正社員の給与: " + fullTime.calculateDailyWage(hours) + " 円");
		System.out.println(
				"パート社員の給与: " + partTime.calculateDailyWage(hours) + " 円");
	}

}
