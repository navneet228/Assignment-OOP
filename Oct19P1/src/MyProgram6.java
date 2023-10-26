package Oct19P1;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner kb = new Scanner(System.in);
		System.out.print("Give me your number between 1 to 12 ?");
		count = kb.nextInt();
		
		while(count < 1 || count > 12) {
			System.out.print("your number is not valid give me another");
			count = kb.nextInt();
		}
		//if you are here it means num is valid
		while(count <= LIMIT) {
			System.out.println(count);
			count = count + 1;
		}
		System.out.println("Done");
	}

}
