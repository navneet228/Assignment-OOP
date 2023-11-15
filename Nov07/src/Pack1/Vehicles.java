package Pack1;

public class Vehicles {
		private int numofDoor;
		private double price;
		private  int maxSpeed;
		
		public Vehicles() {
			System.out.println("Creating obj from constructor: ");
			numofDoor= 2;
			price= 5000;
			maxSpeed = 500;
		}
		public Vehicles(int nd, int p, int ms) {
			System.out.println("Creating obj from parameter constructor: ");
			numofDoor= nd;
			price= p;
			maxSpeed = ms;
		}

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



		public void setmaxSpeed(int ms) {
			this. maxSpeed = ms;
		}
		public int getmaxSpeed()
		{
			return maxSpeed;
		}
		public Vehicles(int nd, double pr, int ms) {
			System.out.println("Creating obj from copy constructor 4: ");
			numofDoor= nd;
			price= pr;
			maxSpeed = ms;
		}
		public  Vehicles(Vehicles v) {
			numofDoor= v.numofDoor;
			price= v.price;
			maxSpeed = v.maxSpeed;
		}
//
//		public void showinfo() {                
//			System.out.println("vehicle has "+ numofDoor + " number of doors."+"vehicle price is $ "+ price+ " , Maximum speed is "+maxSpeed+"km/hr");


		public void printme() {                
			System.out.println("vehicle has "+ numofDoor + " number of doors."+"vehicle price is $ "+ price+ " , Maximum speed is "+maxSpeed+"km/hr");
//			System.out.println("vehicle price is $ "+ price);
		}
			@Override 
			public String toString() {
				return "Vehicles [numofDoor=" + numofDoor + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
			}
}
