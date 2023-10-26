package oct19pacage1;

import java.util.Scanner;

public class Work6 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=10; j++){
//				System.out.printf("%5d", i*j);
//				
//			}
//			System.out.println();
		
//		int a=0;
//		int b=1;
//		for(int i=0; i<10; i++) {
//   int c=a+b;
//   a=b;
//   b=c;
//   System.out.print(c+" ");
Scanner kb= new Scanner(System.in);
		final int LIMIT= 6;
		int counter= 0;
        double val1,val2;
	System.out.println("please enter -1 to stop");
	
	while (counter<LIMIT) {
		counter++;
		System.out.println("Division # :"+counter );
		System.out.println("please give me two numbers");
		val1= kb.nextDouble();
		val2= kb.nextDouble();
		
		if (val1== -1 && val2==-1) {
			break;
		}
		if(val2==0) {

			System.out.println("you lost the turn");

			continue;

			}

			//if you are here everything is happy

			System.out.println("Division #" + counter + " and result is " + val1/val2);

			}

			System.out.println("done");
	}

		
		
}
	


