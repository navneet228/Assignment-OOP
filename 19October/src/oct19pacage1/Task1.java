package oct19pacage1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Scanner kb= new Scanner(System.in);
//  System.out.print("num1");
//   int num1= kb.nextInt();
////   System.out.print("num2");
//
//	int num2= kb.nextInt();
////	  System.out.print("num3");
//
//	int num3= kb.nextInt();
//	int minvVal;
//	if(num1 <num2)
//	  if(num1 <num3)
//		  minvVal= num1;
//	  else
//		  minvVal=num3;
//	else
//		if(num2 <num3)
//			  minvVal= num2;
//		  else
//			  minvVal=num3;
//	  System.out.print("num values "+ minvVal);
	
	Scanner kb= new Scanner(System.in);
	System.out.println("Give me a number ");
	int count = kb.nextInt();
	int limit=15;
//		 if(count <1 || count >12) 
//				System.out.println("number is invalid ");
	 while(count <1 || count >12) {
			System.out.println("number is invalid repeat");}
while (count <= limit) {
	System.out.println(count);
  count++;
}
System.out.print("DONE! :)");

		 }
		 

	}


