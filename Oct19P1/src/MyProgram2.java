package Oct19P1;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int minvVal;
		Scanner kb = new Scanner(System.in);
		System.out.print("Give me all vals ?");
		num1 = kb.nextInt();
		num2 = kb.nextInt();
		num3 = kb.nextInt();

		if (num1 < num2) {
			if (num1 < num3) {
				minvVal = num1;
			} else {
				minvVal = num3;
			}
		} else {
			if (num2 < num3)
				minvVal = num2;
			else
				minvVal = num3;
		}
		System.out.println("your min value is  " + minvVal);

	}

}
