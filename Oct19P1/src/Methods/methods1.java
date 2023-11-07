package Methods;

import java.util.Scanner;

public class methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk= new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1= kk.nextInt();
		System.out.print("Enter n2: ");
		int n2= kk.nextInt();
		System.out.print("Enter operation: ");
		char op= kk.next().charAt(0);
		if(op=='+') {
			System.out.print(add(n1,n2));	
		}else if(op=='-') {
			System.out.print(sub(n1,n2));
		}else if(op=='*') {
			System.out.print(mul(n1,n2));
		}else if (op=='/'){
			System.out.print(div(n1,n2));
		}
	}

	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
		}
	public static int mul(int a, int b) {
		return a*b;
		}
	public static int div(int a, int b) {
		return a/b;
		}
}
