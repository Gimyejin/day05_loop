package day05_loop;

import java.util.Scanner;

public class MakeQuiz {

	public static void main(String[] args) {
		// 문제1. 0부터 10까지 모두 더한 값을 출력해보기.
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 문제2. 숫자를 5번 입력받고, 입력받을 때마다 더해지는 식 작성하기(숫자입력 : 5, 출력 : 5->숫자입력 : 6, 출력 : 11)
		Scanner input = new Scanner(System.in);
		int sum4 = 0;
		int count = 0;
		while (true) {
			System.out.println("수를 입력하시오");
			int num1 = input.nextInt();
			sum4 += num1;
			System.out.println(sum4);
			count++;
			if (count == 5)
				break;
		}

		// 문제3. 1부터 100까지 정수 중에서 3의 배수의 총합을 구하기
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.println("1~100까지 3의 배수의 총 합: " + sum3);

		// 문제4. 1부터 100의 숫자 중 2의 배수의 합은 sum1, 3의 배수의 합은 sum2로 출력하시오.
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
			if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);

	}

}
