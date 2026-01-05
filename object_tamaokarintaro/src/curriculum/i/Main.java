package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new FullTimeEmployee("", ""));
		employees.add(new ContractEmployee("", ""));
		employees.add(new FullTimeEmployee("", ""));

		int hoursWorked = 9;

		for (Employee emp : employees) {
			int wage = emp.calculateDailyWage(hoursWorked);
			System.out.println(emp.name + " の給料: " + wage + " 円");
		}
	}
}
