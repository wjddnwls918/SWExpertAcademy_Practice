import java.util.Scanner;

public class Pro_1986 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n;
		int result;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			result =0;
			for(int j=1; j<=n; j++)
			{
				if(j%2 == 1)
					result+=j;
				else
					result-=j;
			}
			System.out.println("#"+i+" "+result);
		}
	}

}
