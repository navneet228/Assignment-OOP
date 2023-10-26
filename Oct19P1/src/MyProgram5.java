package Oct19P1;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNum;
		String monthName;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me the num of month");
		
		monthNum = kb.nextInt();
		
		switch(monthNum) {
		case 1:
			monthName = "January";
			System.out.println(monthName);
			
		case 2:
			monthName = "Feb";
			System.out.println(monthName);
			
		case 3:
			monthName = "March";
			System.out.println(monthName);
		
		case 4:
			monthName = "Apr";
			System.out.println(monthName);
			
		case 5:
			monthName = "May";
			System.out.println(monthName);
		
		case 6:
			monthName = "June";
			System.out.println(monthName);
		
		case 7:
			monthName = "July";
			System.out.println(monthName);
		
		case 8:
			monthName = "Aug";
			System.out.println(monthName);
		
		case 9:
			monthName = "Sep";
			System.out.println(monthName);
		case 10:
			monthName = "Oct";
			System.out.println(monthName);
		
		case 11:
			monthName = "Nov";
			System.out.println(monthName);
			break;
			
		case 12:
			monthName = "Des";
			System.out.println(monthName);
		
		default:
			monthName = "It is not define";
		
		
		}
		
		System.out.println("based on your num the month is  " + monthName);
		
		
	}

}
