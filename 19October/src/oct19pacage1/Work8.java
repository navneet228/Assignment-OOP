package oct19pacage1;

import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar1 =new int[10];
		ar1[0]= 2;
		ar1[1]=5;
		ar1[2]=7;
		ar1[3]= 33;
		ar1[4]= 10;
		ar1[5]= 55;
		ar1[6]=33;
		ar1[7]=59;
		ar1[8]=43;
		ar1[9]=26;
		Scanner kb= new Scanner(System.in);

		System.out.print("Enter a number ");
		int n= kb.nextInt();
		int counter=0;
		for(int i=0; i<ar1.length; i++) {
		     if(ar1[i]==n) {
					System.out.println(ar1[i]+ "the value found at index: "+i);
//					break;
					counter++;
					}
		     if(counter==10) {
					System.out.println(ar1[i]+ "the value is not found");
	}
		}
}}
