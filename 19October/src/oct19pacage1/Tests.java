package oct19pacage1;

import java.util.Scanner;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	        int totalCost = 0;
	        int personCount = 0;

	        System.out.println("PERSON 1");
	        System.out.print("How old are you? ");
	        int age = scanner.nextInt();
	        personCount++;

	        if (age < 18) {
	            totalCost += 15;
	        } else {
	            totalCost += 30;
	        }

	        String anotherPerson = "Y";
	        while (anotherPerson.equalsIgnoreCase("Y")) {
	            System.out.println("\nAnother person (Y/N)?");
	            anotherPerson = scanner.next();

	            if (anotherPerson.equalsIgnoreCase("Y")) {
	                System.out.println("\nPERSON " + (personCount + 1));
	                System.out.print("How old are you? ");
	                age = scanner.nextInt();
	                personCount++;

	                if (age < 18) {
	                    totalCost += 15;
	                } else {
	                    totalCost += 30;
	                }
	            }
	        }

	        System.out.println("\nPerson count: " + personCount);
	        System.out.println("Total Cost: $" + totalCost);
	}

}
