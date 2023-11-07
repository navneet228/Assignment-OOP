package nov2pac3;

public class Vehicle3 {
	private int numofDoor;
	private double price;
	
	
	
	

	public int getNumofDoor() {
		return numofDoor;
	}





	public void setNumofDoor(int numofDoor) {
		this.numofDoor = numofDoor;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}





	public void printme() {                
		System.out.println("vehicle has "+ numofDoor + " number of doors.");
		System.out.println("vehicle price is $ "+ price);

	}
	}
