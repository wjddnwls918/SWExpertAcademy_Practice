import java.util.Scanner;

public class Pro_2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		int n,m;
		int map[][];
		int max;
		for(int i=1; i<=t; i++)
		{
			n=in.nextInt();
			m=in.nextInt();
			
			map = new int[n][n];
			
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<n; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			max = -1;
			int sum;
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<n; k++)
				{
					if(j+m >n || k+m >n)
						continue;
					sum=0;
					for(int l=j; l<j+m; l++)
					{
						for(int o=k; o<k+m; o++)
						{
							sum+=map[l][o];
						}
					}
					
					if(sum > max)
						max = sum;
				}
			}
			
			System.out.println("#"+i+" "+max);
		}
		
	}

}


//D2 파리퇴치