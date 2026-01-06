
package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		List<Billable> list = new ArrayList<>();

	
		list.add(new FullTimeEmployee("", ""));
		list.add(new ContractEmployee("", ""));
		list.add(new FullTimeEmployee("", ""));

		int hoursWorked = 9;

		
		for (Billable b : list) {
			System.out.println(b.costForDay(hoursWorked) + " 円");
		}
	}
}
