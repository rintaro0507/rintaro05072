package curriculum.b;

public class Question5 {

	public static void helloWorld() {
		System.out.println("Hello, World!");
	}

	public static int doubleValue(int num) {
		return num * 2;
	}
	
	public static boolean isEven(int num2) {
		return num2 % 2 == 0;
	}

	public static void main(String[] args) {
		helloWorld();

		int value = 10;
		int result = doubleValue(value);
		System.out.println(value + "を2倍すると" + result + "です");
		
		int n1 = 7;
		int n2 = 10;
		if(isEven(n2)) {
			System.out.println(n2 + "は偶数です");
		} else {
			System.out.println(n2 + "は奇数です");
		}
		if(isEven(n1)) {
			System.out.println(n1 + "は偶数です");
		} else {
			System.out.println(n1 + "は奇数です");
		}
		

	}

}
