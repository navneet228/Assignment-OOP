package Oct19P1;

import java.util.Scanner;

public class MyProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 6;
		int counter = 0;
		double val1,val2;
		Scanner kb = new Scanner(System.in);
		System.out.println("You have 6 tries, please put -1 -1 to stop");
		
		while(counter<LIMIT) {
			counter++;
			System.out.println("Division # :  " + counter );
			System.out.println("please give me 2 num");
			val1 = kb.nextDouble();
			val2 = kb.nextDouble();
			
			if(val1 == -1 && val2 == -1) {
				break;//this is out of while loop
			}
			
			if(val2==0) {
				System.out.println("you lost the turn ");
				continue;
			}
			//if you are here everythgings is happy
			System.out.println("Division #  " + counter +
					" and result is  " + val1/val2 );
		}
		
		System.out.println("done");
	}

}
