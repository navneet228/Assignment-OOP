package oct19pacage1;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		final int MIN_AGE=18;
		// TODO Auto-generated method stub
//
//		int val1=22;
//		int val2=34;
//		int total=val1+val2;
//		System.out.println(total);
		
////		String name="NAV";
		Scanner kb= new Scanner(System.in);
//		System.out.print("Give name ");
//		String name=kb.nextLine();
//		System.out.print("Hello  "+ name);
		System.out.print("Give age number ");
		 int age=kb.nextInt();
//		System.out.print("Hello  "+ age);
		
		if(age<MIN_AGE) {
			System.out.print("You cannot Drink. ");
			}else {
				System.out.print("You can Drink. ");

			}
	}

}
