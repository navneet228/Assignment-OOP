package oct19pacage1;
import java.util.Scanner;
public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb= new Scanner(System.in);
double totalmark;
char grade;

System.out.print("Give me your mark! ");
totalmark= kb.nextDouble();

if (totalmark>=85)
	grade = 'A';
else if (totalmark>=75)
	grade = 'B';
else if (totalmark>=65)
	grade = 'C';
else if (totalmark>=50)
	grade = 'D';
else 
	grade = 'F';

System.out.print("As per your mark your grade! "+ grade);

	}

}
