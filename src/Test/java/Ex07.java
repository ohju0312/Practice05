package Test.java;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 // 상수 선언
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        // 원의 면적 계산
        double area = PI * radius * radius;

        System.out.println("반지름 " + radius + "인 원의 면적은 " + area + "입니다.");
        scanner.close();

	}

}
