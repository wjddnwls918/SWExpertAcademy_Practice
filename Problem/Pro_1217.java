import java.util.Scanner;

public class Pro_1217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num,a,b;
		for(int i=0; i<10; i++)
		{
			num = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			System.out.println("#"+num+" "+(int)Math.pow(a, b));
		}
		
	}

}

///문제가 ...
//재귀로 하라긴햇는데 뭐하러