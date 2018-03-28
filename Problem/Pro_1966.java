import java.util.Arrays;
import java.util.Scanner;

public class Pro_1966 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		
		
		int arr[];
		for(int i=1; i<=t; i++)
		{
			int n = in.nextInt();
			arr = new int[n];
			for(int j=0; j<n; j++)
				arr[j] = in.nextInt();
			Arrays.sort(arr);
			System.out.print("#"+i+" ");
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[j]);
				if(j==n-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

}
