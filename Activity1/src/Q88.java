import java.util.Scanner;

public class Q88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kk = new Scanner(System.in);
	      System.out.print("Enter average of your marks (less than 100): ");
	      int average = kk.nextInt();
	      char grade;

	      if(average>=100){
	         grade = 'E';
	      }else if(average>=80 && average<100){
	         grade = 'V';
	      }
	      else if(average>=60 && average<80){
	         grade = 'G';
	      }else if(average>=40 && average<60){
	          grade = 'A';
	      }
	      else {
	         grade = 'F';
	      }
	      System.out.println("Your grade is " + grade);
	      kk.close();
	}

}
