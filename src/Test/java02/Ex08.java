package Test.java02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요: ");
		char ch = sc.next().charAt(0);

		int ascii = (int) ch;
		System.out.println("입력한 문자의 아스키 값: " + ascii);

		sc.close();

	}

}
