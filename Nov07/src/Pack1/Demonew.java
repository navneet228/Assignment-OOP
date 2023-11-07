package Pack1;
import java.util.Scanner;
public class Demonew {

	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter No of Doors");
	int nd= kb.nextInt();
	System.out.println("Enter price ");
	double pr= kb.nextDouble();
	System.out.println("Enter maxspeed ");
	int ms= kb.nextInt();
	
	
	Vehicles v1= new Vehicles(nd,pr,ms); 
	System.out.println("info of v1 :");
	v1.printme();
	
	Vehicles v2= new Vehicles(v1); 
	System.out.println("info of v1 :");
	v2.printme();
			}

}
