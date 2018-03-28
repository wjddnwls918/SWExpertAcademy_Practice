import java.util.Scanner;

public class Pro_1936 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a =in.nextInt();
		int b = in.nextInt();
		if (a == 1 && b == 3)
			System.out.println("B");
		else if( a==3 && b ==1)
			System.out.println("A");
		else if( a + 1 == b)
			System.out.println("B");
		else if( a == b+1)
			System.out.println("A");
	}

}
