package Oct19P1;

import java.util.Scanner;

public class MyProgram17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, v, sz;
		int count = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please give me the size of array : ");
		sz =  kb.nextInt();
		
		int[] ar1 = new int[sz];
		int[] ar2 = new int[sz];
 		
		for(i = 0 ; i < ar1.length ; i++) {
			ar1[i] = i * 5;
		}
		//print the array
	
		//so worng 
		//ar2 = ar1;
		
		for(i = 0 ; i < ar1.length ; i++) {
			ar2[i] = ar1[i];
		}
		
		ar1[0] = 99;
		
		
		System.out.println("the array number 1 is  : ");
		for(i = 0 ; i < ar1.length ; i++) {
			System.out.print(ar1[i] + "  ");
		}
		
		System.out.println();
		System.out.println("the array number 2 is  : ");
		for(i = 0 ; i < ar2.length ; i++) {
			System.out.print(ar2[i] + "  ");
		}
	}

}
