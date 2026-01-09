package jikosyoukai;

public class Person {

	String name;
	int age;
	double height;
	double weight;

	static int count = 0;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	double bmi() {
		return weight / (height * height);
	}

	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年齢は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

}
