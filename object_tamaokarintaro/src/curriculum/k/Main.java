package curriculum.k;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator calculator = new SalaryCalculator();

        Kyuyo e1 = new FullTimeEmployee("山田", 8);
        Kyuyo e2 = new ContractEmployee("佐藤", 8);

        calculator.calculateSalary(e1);
        calculator.calculateSalary(e2);
    }
}






