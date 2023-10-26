package Oct19P1;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		final int MIN_AGE = 18;
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("Give me your name ?");
		String name  = kb.nextLine();
		System.out.println("Hellooo   " + name);
		System.out.print("Give me your age ?");
		int age = kb.nextInt();
		
		if(age < MIN_AGE) {
			System.out.println("sorry, You cant drink");
		}else {
			System.out.println("You can drink cheers");
		}
		
		System.out.println("Thank you ");
		
	}

}
