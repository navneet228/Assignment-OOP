import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb= new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num=kb.nextInt();
		int fibonacci,fibonacci1, fibonacci2;
		fibonacci= fibonacci1= 1;
		int i= 1;
		System.out.print(fibonacci+" "+fibonacci1);
		
		while(i<num){
			i++;
			fibonacci2=fibonacci+fibonacci1;
			fibonacci=fibonacci1;
			fibonacci1= fibonacci2;
			System.out.print(" ");
			System.out.print(fibonacci2);
		}
		kb.close();
	}

}
