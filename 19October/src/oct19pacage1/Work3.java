package oct19pacage1;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
//		System.out.println("Give me a number from 1 to 15 ");
//		int count = kb.nextInt();
//		int limit=15;

int i,j,sz;
System.out.println("Give me a number from 1 to 15 ");
sz= kb.nextInt();

while(sz<1 || sz> 15 ) {
System.out.println("Give me a number from 1 to 15 ");
sz= kb.nextInt();

}

for(i=1;i<=sz; i++) {
	for(j=1;j<=i; j++) {
		System.out.print(j);
	}
	System.out.println();

}
//		do {
//			System.out.println("Give me a number ");
//}
//		while(count <1 || count >12);
//		do {
//			System.out.println(count);
//  count++;
//}
//		while (count <= limit);
//System.out.print("DONE! :)");	

}}
