package day05_loop;

public class Quiz01 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.println(i + ". hello");

		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum == 528) {
				System.out.println("гуюл 528: " + i);
			}

		}

		for (int i = 1; i <= 25; i++) {
			if(i%5==0) {
				System.out.print(i+"\t\t\t\t");
				
			}else {
				System.out.print(i+"   ");
			}
		}
	}

}
