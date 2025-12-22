package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0;
		byteNum = 10;
		short shortNum = 0;
		shortNum = 100;
		int intNum = 0;
		intNum = 1000;
		long longNum = 0L;
		longNum = 10000;
		float floatNum = 0.0f;
		floatNum = 9.5f;
		double doubleNum = 0.0;
		doubleNum = 10.5;
		char letter = 'R';
		letter = 'a';
		String letters = "null";
		letters = "ハロー";
		boolean isBoolean =  false;
		isBoolean = true;
		System.out.println(byteNum + shortNum + intNum);
		System.out.println(floatNum + doubleNum);
		System.out.println(letter + letters + isBoolean);
		System.out.println(byteNum + shortNum + intNum + floatNum + doubleNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		int age;
		age = 25;
		System.out.println("年齢：" + age + "歳");
		
		int num1;
		num1 = 10;
		int num2;
		num2 = 5;
		System.out.println(num1 + num2);
		
		int score;
		score = 80;
		score += 20;
		System.out.println("最終スコア：" + score);
		
		double price;
		price = 99.99;
		int iprice = (int)price;
		System.out.println("整数価格：" + iprice);
		
		String numStr;
		numStr = "123";
		int inumStr = Integer.parseInt(numStr);	
		System.out.println("変換後の値" + (inumStr +10));
		
		int num;
		num = 50;
		String Snum = String.valueOf(num);
		System.out.println("得点：" + Snum + "点");
		
		int a;
		a = 10;
		int b;
		b = 20;
		boolean result;
		result = (a < b) ? true : false;
		System.out.println(result);
		
		int x;
		x = 15;
		String Sresult = (x >= 10) ? "OK" : "NG";
		System.out.println(Sresult);
		
		String text;
		text = "私はJavaが好きです。Javaは楽しい！";
		text = text.replace("Java", "Python");
		System.out.println(text);
		
		
		
	}


}