import java.util.Scanner;

public class Pro_1933 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
				System.out.print(i+" ");
			if(i==n)
				System.out.println();
		}
	}

}
