package Oct19P1;

import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sz;
		Scanner kb = new Scanner(System.in);
		System.out.print("please give me val from 1 to 15");
		sz = kb.nextInt();
		
		while(sz < 1 || sz > 15 ) {
			System.out.print("Invalid please give me val from 1 to 15");
			sz = kb.nextInt();
		}
		for(i = 1 ; i <= sz ; i++) {
			for(j = 1 ; j <= i ; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		
	}

}
