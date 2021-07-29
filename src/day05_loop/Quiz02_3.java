package day05_loop;

public class Quiz02_3 {

	public static void main(String[] args) {
		//2중 for문을 이용하여
		for(int i=0;i<=20;i++) {
			for(int k=1;k<=5;k++) {
				System.out.print((i+k)+"\t");
			}System.out.println();
			i+=4;
		}
		
	}

}
