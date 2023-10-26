package Oct19P1;

import java.util.Scanner;

public class MyProgram14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 = new int[10];
		Scanner kb = new Scanner(System.in);
		ar1[0] = 2;
		ar1[1] = 5;
		ar1[2] = 6;
		ar1[3] = 22;
		ar1[4] = 39;
		ar1[5] = 18;
		ar1[6] = 22;
		ar1[7] = 52;
		ar1[8] = 29;
		ar1[9] = 12;
		System.out.println("What number you want to search");
		int v = kb.nextInt();
		int i;
		for ( i = 0; i < ar1.length; i++) {
			if(ar1[i] == v) {
				System.out.println("the value found at index : " + i);
				break;
			}
		}
		if(i == 10) {
			System.out.println("not found");
		}
		
		

	}

}
