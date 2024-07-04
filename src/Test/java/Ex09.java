package Test.java;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int b = scanner.nextInt();

		System.out.println("더하기: " + (a + b));
		System.out.println("빼기: " + (a - b));
		System.out.println("곱하기: " + (a * b));
		System.out.println("나누기: " + (a / b));
		System.out.println("나머지: " + (a % b));

		scanner.close();

	}

}
