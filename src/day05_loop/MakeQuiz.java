package day05_loop;

import java.util.Scanner;

public class MakeQuiz {

	public static void main(String[] args) {
		// ����1. 0���� 10���� ��� ���� ���� ����غ���.
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// ����2. ���ڸ� 5�� �Է¹ް�, �Է¹��� ������ �������� �� �ۼ��ϱ�(�����Է� : 5, ��� : 5->�����Է� : 6, ��� : 11)
		Scanner input = new Scanner(System.in);
		int sum4 = 0;
		int count = 0;
		while (true) {
			System.out.println("���� �Է��Ͻÿ�");
			int num1 = input.nextInt();
			sum4 += num1;
			System.out.println(sum4);
			count++;
			if (count == 5)
				break;
		}

		// ����3. 1���� 100���� ���� �߿��� 3�� ����� ������ ���ϱ�
		int sum3 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
			}
		}
		System.out.println("1~100���� 3�� ����� �� ��: " + sum3);

		// ����4. 1���� 100�� ���� �� 2�� ����� ���� sum1, 3�� ����� ���� sum2�� ����Ͻÿ�.
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
