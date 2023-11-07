package Pack1;

public class Nnew {

	public static void main(String[] args) {
	add();
	add(6);
	add(4,5);
	add(5,6,7);
	}
	public static int add() {
		return 4+6;
	}
	public static int add( int x) {
		return 4+x;
	}
	public static int add(int x, int y) {
		return x+y;
	}
	
	
}
