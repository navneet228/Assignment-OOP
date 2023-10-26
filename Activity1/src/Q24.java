import java.util.Scanner;

public class Q24 {
//check if a number is even, odd, or prime using else-if statements.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cc=new Scanner(System.in);
		System.out.println("Enter a number");
		int DD= cc.nextInt();
		
		
		if(DD%2==0) {
			System.out.println(DD + " is a even number");
		}else{
			System.out.println(DD + " is a odd number");
		}
			if (isPrime(DD)) {
	            System.out.println(DD + " is prime.");
	        } else {
	            System.out.println(DD + " is not prime.");
	            }
			}
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
    }
}