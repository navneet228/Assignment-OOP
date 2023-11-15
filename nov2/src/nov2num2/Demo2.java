package nov2num2;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1= new Vehicle();
		int nd= v1.getNumofDoor();
		double p= v1.getPRice();		
		v1.setNUmberofDoor(5);
		v1.setPRice(4000);
	
	v1.printme();
	
	System.out.print(v1);
	
	}

}
