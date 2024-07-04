package Test.java;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		 // 상수 선언
        final double HALF = 0.5;

        // Scanner 객체를 생성하여 사용자 입력을 받음
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 밑변을 입력하라고 요청
        System.out.print("삼각형의 밑변을 입력하세요: ");
        double base = scanner.nextDouble(); // 밑변 입력받기

        // 사용자에게 높이를 입력하라고 요청
        System.out.print("삼각형의 높이를 입력하세요: ");
        double height = scanner.nextDouble(); // 높이 입력받기

        // 삼각형의 넓이를 계산
        double area = HALF * base * height;

        // 결과를 출력
        System.out.println("밑변 " + base + "와 높이 " + height + "인 삼각형의 넓이는 " + area + "입니다.");

        // Scanner 객체를 닫음
        scanner.close();

	}

}
