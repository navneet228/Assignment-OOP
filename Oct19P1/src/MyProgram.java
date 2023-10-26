

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner kb = new Scanner(System.in);
		
		do {
			System.out.print("give me another");
			count = kb.nextInt();
		}while(count < 1 || count > 12);
		
		do {
			System.out.println(count);
			count = count + 1;
		}while(count <= LIMIT);
		
		System.out.print("Done");
	}

}
