package Methods;

import java.util.Scanner;

public class test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);  
		System.out.print("Enter the value 1: ");  
		double n1 = kb.nextDouble();  
		System.out.print("Enter the value 2: ");  
		double n2 = kb.nextDouble();  
		System.out.print("Enter the value 3: ");  
		double n3 = kb.nextDouble(); 
		quadraticequation(n1,n2,n3);
	kb.close();
	}
	
	public static void  quadraticequation(double a,double b, double c){
		double delta=(b*b) -4* a*c;
		if(delta >0) {
			double v1=(-b + Math.sqrt(delta))/ (2.0 * a);  
			double v2 = (-b - Math.sqrt(delta))/ (2.0 * a); 
			System.out.println("The roots are " + v1 + " and " + v2);
		}else if(delta==0.0) {
			double v1 = -b / (2.0 * a);  
			System.out.println("The root is " + v1);  
			}   
			else   
			{  
			System.out.println("Roots are not real.");  
			} 
	
	}

}
