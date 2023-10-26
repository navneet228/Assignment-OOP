package Oct19P1;

import java.util.Scanner;

public class MyPRogram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double totalMark;
		char grade;
		System.out.print("Give me your mark?");
		totalMark = kb.nextDouble();
		if (totalMark >= 85) {
			grade = 'A';
		} else if (totalMark >= 75) {
			grade = 'B';
		} else if (totalMark >= 65)
			grade = 'C';
		else if (totalMark >= 50)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("based on your mark your grade is  " + grade);

	}

}
