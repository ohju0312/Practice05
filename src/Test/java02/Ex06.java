package Test.java02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("첫 번째 정수를 입력하세요: ");
	        int num1 = sc.nextInt();

	        System.out.print("두 번째 정수를 입력하세요: ");
	        int num2 = sc.nextInt();

	        System.out.print("세 번째 정수를 입력하세요: ");
	        int num3 = sc.nextInt();

	        double average = (num1 + num2 + num3) / 3.0;
	        System.out.println("세 수의 평균은: " + average);

	        sc.close();

	}

}
