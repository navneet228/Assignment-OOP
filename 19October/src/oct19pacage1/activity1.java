package oct19pacage1;

import java.util.Scanner;

public class activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//q1
		
		Scanner kk= new Scanner(System.in);
    	System.out.print("enter a number ");

		int a= kk.nextInt();
		
		if(a%2!=0){
			System.out.println(a +" number is odd ");
		}else {
			System.out.println(a +" number is even ");
		}
//		//q2
		System.out.println(a +" number is even ");

		System.out.print("enter a number 1 ");
        double num1=kk.nextDouble();
		System.out.print("enter a number 2 ");
		double num2=kk.nextDouble();
		System.out.print("enter a number 3 ");
		double num3=kk.nextDouble();
				double average= (num1+num2+num3)/3;
		System.out.println(" the average is : " + average);
//		
//		//q3
//		System.out.print("enter a number 1 ");
//        int num1= kk.nextInt();
//		System.out.print("enter a number 1 ");
//        int num2= kk.nextInt();
//        
//        if(num1>num2) {
//    		System.out.println( num1 + "is greater than " +num2);
//        }else{
//    		System.out.println(num1 + "is less than "+ num2);
//        }
//        System.out.println("maximum number is  "+Math.max(num1,num2)); 
     //q4
		
//      System.out.print("enter a number "); 
//
//        int num1= kk.nextInt();
//        int factorial=1;
//        for(int i=1; i<=num1; i++) {
//        	factorial=factorial*i;
//        }
//      System.out.println("factorial of " +num1 +" is "+ factorial); 
		
//q5
//		System.out.print("Enter a number : ");
//		int nn= kk.nextInt();
//		
//		if(nn>=0){
//			System.out.println(nn);
//			
//		}else {
//			System.out.println(nn*(-1));
//		}
		
		//q6
		
//		System.out.print("enter a number 1 ");
//      int num1= kk.nextInt();
//		System.out.print("enter a number 2 ");
//      int num2= kk.nextInt();
//    int num3= num1;
//     num1=num2;
//    num2=num3;
//    System.out.println("After swapping the numbers ")
//	System.out.println("now num1 is  " + num1);
//	System.out.println("now num2 is  "+ num2);
		
		//q7
		
//		System.out.print("enter a number  ");
//      int num1= kk.nextInt();
//      boolean primenum= true;
//      
//      if(num1<=1) {
//    	  primenum=false;
////  		System.out.print("enter a number  ");
//    	  }else {
//    		  for(int i=2;i<num1; i++) {
//    			  if(num1%i==0) {
//    				  primenum =false;
//    				  break;
//    			  }
//    		  }
//    	  }
//      if(primenum) {
//    	  System.out.print(num1 + "is a prime number.");
//      }else {
//    	  System.out.print(num1 + "is not a prime number.");
//
//      }
		//8--------
		
		//q9
//		System.out.print("Enter your age :");
//		int age= kk.nextInt();
//		
//		if(age>=18) {
//			System.out.print("You are eligible to vote");
//		}else {
//			System.out.print("Sorry! You are not eligible to vote");
//
//		}
      //q10
		System.out.print("enter a number  ");
      int num= kk.nextInt();
      
      if(num<0) {
    	  System.out.print( num+ " number is a negative number");
      }else if(num>0) {
    	  System.out.print( num+ " number is a positive number");
      }else{
    	  System.out.print( num+ " number is equals to 0");
      }
		
		//q11
//		System.out.print(" enter num1  ");
//		int num1=kk.nextInt();
//		System.out.print(" enter num2  ");
//		 int num2=kk.nextInt();
//			System.out.print(" enter num3 ");
//			int num3= kk.nextInt();
//		 
//		if(num1>=num2 && num1>=num3) {
//			System.out.print( num1+ " number is the largest number");
//		}
//		else if(num2>=num1 && num2>=num3) {
//			System.out.print( num2+ " number is the largest number");
//		}else {
//			System.out.print( num3+ " number is the largest number");
//		}
		//12
//		char cc= kk.next().charAt(0);
//		if(cc=='a' || cc=='e' || cc=='i' || cc=='o' || cc=='u') {
//		System.out.print(cc+ " is a Vowel");
//		}else{
//			System.out.print(cc+ " is consonant");
//		}
		
		//13
//		System.out.print( "Enter Year : ");
//		int year= kk.nextInt();
//		
//		if(year%400==0 || year%4==0 && year%100!=0) {
//			System.out.print(year + " is a leap year");
//		}else {
//			System.out.print(year + " is not a leap year");
//		}
		
		//q14
//		String a= kk.next();
//		String b= kk.next();
//		if(a.equals(b)){
//		System.out.print("both strings are equal ");
//		}else {
//			System.out.print("both strings are not equal ");
//		}
		
		//q15
//		System.out.print(" enter num1  ");
//		int num1=kk.nextInt();
//		System.out.print(" enter num2  ");
//		 int num2=kk.nextInt();
//			System.out.print(" enter num3 ");
//			int num3= kk.nextInt();
//			System.out.print(" enter num4 ");
//			int num4= kk.nextInt();
//		 
//		if(num1>=num2 && num1>=num3 && num1>=num4) {
//			System.out.print( num1+ " number is the largest number");
//		}
//		else if(num2>=num1 && num2>=num3 && num2>=num4) {
//			System.out.print( num2+ " number is the largest number");
//			
//		}
//		else if(num3>=num1 && num3>=num2 && num3>=num4) {
//			System.out.print( num3+ " number is the largest number");
//		}else {
//			System.out.print( num4+ " number is the largest number");
//		}
		
		//16-----
		
		//17
		
//		System.out.print(" enter num1  ");
//		int num1=kk.nextInt();
//		System.out.print(" enter num2  ");
//		 int num2=kk.nextInt();
//			System.out.print(" enter num3 ");
//			int num3= kk.nextInt();
//			
//			if(num1>=num2){
//				if(num1>=num3) {
//				System.out.print( num1+ " number is the largest number");
//			}else{
//				System.out.print( num3+ " number is the largest number");		
//			}
//		    }else{
//				if(num2>=num3) {
//				System.out.print( num2+ " number is the largest number");
//			}else{
//				System.out.print( num3+ " number is the largest number");		
//			}
//		    }
		
		//18 (same as 10)
		
		//19
//		
//		System.out.print("enter a number  ");
//      int n= kk.nextInt();
//      
//      if(n%2==0 && n>0) {
//    	  System.out.print( n+ "  is even and positive number");
//      }else if(n%2!=0 && n>0) {
//    	  System.out.print( n+ "  is not a even but positive number");
//      }else{
//    	  System.out.print( n+ " is not even and a negative number");
//      }
		
		//20
		
//			int num1=66;
//			int num2= 72;
//			int num3= 59;
//			
//			if(num1>=num2){
//				if(num1>=num3) {
//				System.out.print( num1+ " number is the largest number");
//			}else{
//				System.out.print( num3+ " number is the largest number");		
//			}
//		    }else{
//				if(num2>=num3) {
//				System.out.print( num2+ " number is the largest number");
//			}else{
//				System.out.print( num3+ " number is the largest number");		
//			}
//		    }
		
		//21
		
		
		
		
		
		
        }
	}

		
	


