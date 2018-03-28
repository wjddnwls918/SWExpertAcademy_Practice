import java.util.Scanner;

public class Pro_1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		int n,k;
		int map[][];
		int check[][];
		boolean checkflag;
		int result;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			k = in.nextInt();
			
			map = new int[n][n];
			check = new int[n][n];
			
			for(int j=0; j<n; j++)
			{
				for(int l=0; l<n; l++)
				{
					map[j][l] = in.nextInt();
				}
			}
			
			int cnt;
			result = 0;
			
			//가로 
			for(int j=0; j<n; j++)
			{
				for(int l=0; l<n; l++)
				{								
					if (map[j][l] == 1  )
					{									
						cnt = 1;						
											
						while(l+1 < n && map[j][l+1]!=0 )
						{
							l++;							
							cnt++;							
						}
						if( cnt == k)
							result ++;									
						
						
					}					
				}
			}
			//세로
			for(int j=0; j<n; j++)
			{
				for(int l=0; l<n; l++)
				{								
					if (map[l][j] == 1  )
					{									
						cnt = 1;						
											
						while(l+1 < n && map[l+1][j]!=0 )
						{
							l++;							
							cnt++;							
						}
						if( cnt == k)
							result ++;									
						
						
					}					
				}
			}
			
			System.out.println("#"+i+" "+result);
			
		}
	}

}
