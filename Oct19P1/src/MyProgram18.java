package Oct19P1;

import java.util.Scanner;

public class MyProgram18 {

	public static void main(String[] args) {
		int i, v, sz1, sz2;
		int count = 0;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the sizes  ar1 & ar2, ");
		sz1 = kb.nextInt();
		sz2 = kb.nextInt();
		
		int[] ar1 = new int[sz1];
		int[] ar2 = new int[sz2];

		
		// Just initialize
		for (i = 0; i < ar1.length; i++)
		{
			ar1[i] = i * 5;
			
		}
		
		
		// Now copy the ar1 to ar2. 
		if (ar1.length == ar2.length)
		{
			for (i = 0; i < ar2.length; i++)	 									
			{									 
				ar2[i] = ar1[i];				
				
			}			
		}
		else if (ar1.length > ar2.length)
		{
			// copy only what ar2 can hold
			System.out.println("ar2 is smaller than the length of ar1.");
			System.out.println("partial copy");
			for (i = 0; i < ar2.length; i++)	 									
			{									 
				ar2[i] = ar1[i];				
				
			}
			
		}
		else
		{
	 
			System.out.println("ar1 is smaller ar2.");
			System.out.println("partial copy will be made. ");
			for (i = 0; i < ar1.length; i++)	 								
			{									 
				ar2[i] = ar1[i];				
				
			}
			
			
		}
		
		
		// Show the contents of the arrays
		System.out.println(" ar1: ");
		for (i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println(" ar2: ");
		for (i = 0; i < ar2.length; i++)
		{
			System.out.print(ar2[i] + " ");
		}
	
		
	}

}
