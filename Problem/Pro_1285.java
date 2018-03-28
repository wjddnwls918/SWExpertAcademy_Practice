import java.util.Scanner;

public class Pro_1285 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n;
		int ran[];
		int min;
		int cnt;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			
			ran = new int[n];
		
			for(int j=0; j<n; j++)
			{
				ran[j] = in.nextInt();
			}
			min = 1000001;
			cnt = 0;
			
			for(int j=0; j<n; j++)
			{
				if( Math.abs( ran[j] ) < min )
				{
					min = Math.abs(ran[j]);
				}
			}
			
			for(int j =0; j<n; j++)
			{
				if( Math.abs(ran[j]) == min)
					cnt++;
			}
			
			
			System.out.println("#"+i+" "+min+" "+cnt);
			
		}
		
	}

}
