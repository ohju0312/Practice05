package Test.java02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("첫 번째 실수를 입력하세요: ");
	        double num1 = sc.nextDouble();

	        System.out.print("두 번째 실수를 입력하세요: ");
	        double num2 = sc.nextDouble();

	        double product = num1 * num2;
	        System.out.println("두 수의 곱은: " + product);

	        sc.close();

	}

}
