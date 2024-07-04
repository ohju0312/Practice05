package Test.java;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		final double PI = 3.14159;
		Scanner scanner = new Scanner(System.in);

		System.out.print("반지름을 입력하세요: ");
		double radius = scanner.nextDouble();
		double area = PI * radius * radius;

		System.out.println("원의 면적: " + area);
		scanner.close();
	}

}
