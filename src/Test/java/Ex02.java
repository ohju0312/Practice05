package Test.java;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();
		double converted = num;

		System.out.println("변환된 값: " + converted);
		scanner.close();

	}

}
