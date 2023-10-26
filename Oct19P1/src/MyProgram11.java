package Oct19P1;

public class MyProgram11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13,...
		int a = 0;
		int b = 1;
		
		for(int i= 0 ; i<10 ; i++) {
			int c = a + b ;
			a = b;
			b = c;
			System.out.print(c+"  ");
		}
		
	}

}
