import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perfect square
				int num;

				Scanner kb = new Scanner(System.in);
				
				System.out.print("Enter your Num : ");
				num = kb.nextInt();
				
				if(num % num == 0) {
					System.out.print(num + " is a perfect square");
				}
				else {
					System.out.print(num + "is not a perfect square");
				}
			}

	}


