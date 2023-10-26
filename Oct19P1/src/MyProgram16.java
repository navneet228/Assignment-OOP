package Oct19P1;

import java.util.Scanner;

public class MyProgram16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, v, sz;
		int count = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("please give me the size of array : ");
		sz =  kb.nextInt();
		
		int[] ar1 = new int[sz];
		
		for(i = 0 ; i < ar1.length ; i++) {
			ar1[i] = i * 5;
		}
		//print the array
		System.out.println("the array is  : ");
		for(i = 0 ; i < ar1.length ; i++) {
			System.out.print(ar1[i] + "  ");
		}
		
		System.out.println("What number you want to search");
		v = kb.nextInt();
		
		for ( i = 0; i < ar1.length; i++) {
			if(ar1[i] == v) {
				System.out.println("the value found at index : " + i);	
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("not found");
		}
	}

}
