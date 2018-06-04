import java.util.Scanner;

public class Pro_4012 {

		static int n ;
		static int visit[];
		static int cnt;
		
		static int cal[][];
		
		static int aTeam[];
		static int bTeam[];
		
		static int result;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		int t = in.nextInt();
		for(int k=1; k<=t; k++)
		{
			n = in.nextInt();
			
			
			cal = new int[n][n];
			
			
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					cal[i][j] = in.nextInt();
				}
			}
			
			/*for(int i=1; i<=n/2; i++)
			{*/			
				cnt =0;
				aTeam = new int[n/2];
				bTeam = new int[n/2];
				visit = new int[n+1];
				
				result = 1000000;
				
				dfs(1,1);
			/*}*/
				
			System.out.println("#"+k +" "+ result);
		}
		
		
		
	}
	
	static void dfs(int i,int depth)
	{
	
		visit[i] = 1;
		
		if( depth == n/2)
		{
			int k=0;
			int m=0;
			for(int j=1; j<=n; j++)
			{
				//System.out.print(visit[j]);
				if(visit[j] == 0)
				{
					bTeam[k] = j ;
					k++;
				}
				else
				{
					aTeam[m] = j;
					m++;
				}
			}
	
			int aSum=0;
			int bSum=0;
			
		
			for(int j=0; j<n/2-1; j++)
			{
				for(int l=j+1; l<n/2; l++ )
				{
					aSum += cal[aTeam[j]-1][aTeam[l]-1];
					aSum += cal[aTeam[l]-1][aTeam[j]-1];
					
					bSum += cal[bTeam[j]-1][bTeam[l]-1];
					bSum += cal[bTeam[l]-1][bTeam[j]-1];
				}				
			}
			
		
			
		
			if(Math.abs(aSum-bSum) < result)
			result = Math.abs(aSum-bSum);
			
			//System.out.println(Math.abs(aSum-bSum));
			
			
			
			//visit[i] = 0;
			//cnt--;
			//return ;
		}
		
		else {			
		
			//j = i+1이거 하나 있다고 결과가 그렇게 달라지나 ??;;; 
			for(int j= i+1; j<=n; j++)
			{
				if(visit[j] != 1)
				{
					
					 dfs(j,depth+1);
					 //visit[j] = 0;
				}
			}
			
			//cnt--;
			//return;
		
		}
		
		
		visit[i] = 0;
		
	}

}
