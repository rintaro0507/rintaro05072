package curriculum.k;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator calculator = new SalaryCalculator();

        Kyuyo e1 = new FullTimeEmployee("", 8);
        Kyuyo e2 = new ContractEmployee("", 8);

        calculator.calculateSalary(e1);
        calculator.calculateSalary(e2);
    }
}






