package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new FullTimeEmployee("1", "佐藤"));
		employees.add(new ContractEmployee("2", "山田"));
		employees.add(new FullTimeEmployee("3", "川西"));

		int hoursWorked = 9;

		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(hoursWorked);
			System.out.println(emp.getName() + " の給料: " + wage + " 円");
		}
	}
}
