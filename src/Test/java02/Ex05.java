package Test.java02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("원의 반지름을 입력하세요: ");
	        double radius = sc.nextDouble();

	        double area = Math.PI * radius * radius;
	        System.out.println("원의 면적: " + area);

	        sc.close();	

	}

}
