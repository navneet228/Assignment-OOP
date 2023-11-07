package nov2num2;

public class Vehicle {

	private int numofDoor;
	private double price;
	
	
	
	public int getNumofDoor() {
		return numofDoor;
	}
	public void setNUmberofDoor(int nd) {
		if(nd<0 || nd>8) {
			System.out.println("I can not set it");
		}
		numofDoor=nd;                //to modify 
	}                         //create nd &p
	
	public double getPRice() {
		return price;
	}
	public void setPRice(int p) {
		if(p<0 || p>100000) {
			price=p;}
		else {
			System.out.println("I can not set it");
		}
		   
		}
	
	public void printme() {                
		System.out.println("vehicle has "+ numofDoor + " number of doors.");
		System.out.println("vehicle price is $ "+ price);

	}
}