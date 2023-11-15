import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int []arr= {12,33,44,56,28,11,16};
Scanner kk= new Scanner(System.in);
System.out.print("Give me number for array elements: ");
int find= kk.nextInt();
boolean ff=false;
for(int element:arr) {
	if(element==find){
	ff=true;
	break;
}
	
}
if(ff) {
	System.out.println("The array cont. the value "+ find);
}else {
	System.out.println("The array dose not cont. the value "+find);

}
kk.close();
	}

}
