import java.util.Scanner;

public class Pro_2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long result = 1;
		System.out.print(result +" ");
		for(int i=1; i<=n; i++)
		{
			result *= 2;
			System.out.print(result);
			if(i == n)
				System.out.println();
			else
				System.out.print(" ");
			
		}
	}

}
