
package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Billable 型のリスト
		List<Billable> list = new ArrayList<>();

		// 社員を追加（型は Billable）
		list.add(new FullTimeEmployee("E001", "山田"));
		list.add(new ContractEmployee("C001", "田中"));
		list.add(new FullTimeEmployee("E002", "佐藤"));

		int hoursWorked = 9;

		// for-each で共通処理
		for (Billable b : list) {
			System.out.println(b.costForDay(hoursWorked) + " 円");
		}
	}
}
