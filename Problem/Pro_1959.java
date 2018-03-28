import java.util.Scanner;

public class Pro_1959 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n,m;
		int a[];
		int b[];
		int max;
		int temp;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			m = in.nextInt();
			
			a = new int[n];
			b = new int[m];
			
			for(int j=0; j<n; j++)
			{
				a[j] = in.nextInt();
			}
			for(int j=0; j<m; j++)
			{
				b[j] = in.nextInt();
			}
			
			max = -1;
			int l;
			
			if( a.length <= b.length)
			{
				for(int j=0; j <= m - n; j++)
				{
					temp =0;
					l = 0;
					for(int k=j; k<j+n; k++)
					{					
							temp += (a[l] * b[k]);					
						l++;
					}
					
					if(max < temp)
						max = temp;
				}
			}
			else
			{
				for(int j=0; j <= n - m; j++)
				{
					temp =0;
					l = 0;
					for(int k=j; k<j+m; k++)
					{					
							temp += (a[k] * b[l]);					
						l++;
					}
					
					if(max < temp)
						max = temp;
				}
			}
			
			
			System.out.println("#"+i+" "+max);
			
		}
		
	}

}
