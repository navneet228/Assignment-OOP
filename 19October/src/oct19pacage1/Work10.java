package oct19pacage1;

import java.util.Scanner;

public class Work10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		 int i,v,sz;
 int count=0;
		System.out.print("Enter a number ");
		sz= kb.nextInt();
		int[] ar1 =new int[sz];
		int[] ar2 =new int[sz];
		
		for (i=0; i<ar1.length; i++) {
			ar1[i]=i*2;
		}
		System.out.println("The array 1 is: ");
		for (i=0; i<ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
		for (i=0; i<ar1.length; i++) {
 ar2[i]=ar1[i]	;	
	System.out.println();

 System.out.println("The array 2 is: ");
	for (i=0; i<ar1.length; i++) {
		System.out.print(ar1[i]+" ");
	}
	}
	}
}
