package day05_loop;

public class Quiz02 {

	public static void main(String[] args) {
		// 구구단 만들기
		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.print(k + " x " + i + " = " + (k * i) + "\t");
			}
			System.out.println();
		}

	}
}
