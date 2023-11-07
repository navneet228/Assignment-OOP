package nov2;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                //here - class for bicycle
		Bicycle v1= new Bicycle();                          // create obj from bicycle=v1
		System.out.println("My first cas info : ");
		v1.printme();
		
		Bicycle v2= new Bicycle();
		v2.numofDoor=2;
		v2.price= 20000;
		System.out.println("My v2 cas info : ");
//		v2.printme();
		System.out.println("number of doors is "+ v2.numofDoor);

		Bicycle v3= new Bicycle();
		Scanner kb= new Scanner(System.in);
		System.out.println("My v3 cas info : ");
		System.out.println("enter number of doors : ");
		v3.numofDoor=kb.nextInt();
		System.out.println("Enter the price : ");
		v3.price= kb.nextInt();
		
		v3.printme();
	}

}
