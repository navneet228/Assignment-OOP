import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System. in);
		System.out.print("Enter the month (1-12): ");
        String month ;
		int days= kk.nextInt();
		switch(days){
		case 1:
			month="jan has 31 days ";
		case 2:
			month="feb has 27 days ";
		case 3:
			month="march has 31 days ";
		case 4:
			month="april has 30 days ";
		case 5:
			month="may has 31 days ";
			
		case 6:
			month="june has 30 days ";
		case 7:
			month="july has 31 days ";
			break;
		case 8:
			month="aug has 31 days ";
			break;
		case 9:
			month="sep has 30 days ";
			break;
		case 10:
			month="oct has 31 days ";
			break;

		case 11:
			month="nov has 30 days ";
			break;

		case 12:
			month="dec has 31 days ";
			break;
		default:
			month="Not defined";
			break;
		}
		
		System.out.print( month);
		
		kk.close();
	}
		
}
