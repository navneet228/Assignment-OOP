import java.util.Scanner;

public class Q23 {
//determine the day of the week based on a number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daynum;
		String day;
		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a number  ");
		 daynum= kb.nextInt();
		switch(daynum){
		case 1:
			day = "Monday";
			break;
		case 2:
			day= "Tuesday";
			break;
		case 3:
			day= "wednesday";
			break;
		case 4:
			day= "Thursday";
			break;
		case 5:
			day= "Friday";
			break;
		case 6:
			day= "Saturday";
			break;
		case 7:
			day= "Sunday";
		default:
			day="Not defined";
			break;
			}
		System.out.print("As per your input day is  "+ day);
	}

}
