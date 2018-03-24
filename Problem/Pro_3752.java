import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pro_3752 {

	static int n;
	static int cnt;
	static int score[];
	static int total[];
	static int visit[];	
	static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);		
		int t = in.nextInt();
	
		
		for(int i =1; i<=2; i++)
		{
			n = in.nextInt();
			
			score = new int[n];
			visit = new int[n];
			
			for(int j = 0; j<score.length; j++)
			{
				score[j] = in.nextInt();
			}
		
			total = new int [10000];		
		
			cnt=0;
			
			sum = 0;			
			dfs(0,0);
			sum = 0;
			dfs(0,1);
			
			
			for(int j=0; j<total.length; j++)
			{				
				if(total[j] == 1)
				{
					cnt++;					
				}
			}
			
			System.out.println("#"+i + " "+ cnt);
		}
		
		
		
	}
	
	public static void dfs(int depth, int flag)
	{		
		if(flag == 1)
		{
			//visit[depth] = 1;
			sum += score[depth];
		}
		else
		{
			visit[depth] = 0;
		}
		
		
		if(depth == n-1)
		{
			int temp = 0 ;
			/*	for(int i = 0; i<visit.length; i++)
			{
				
				if( visit[i] == 1)
					temp += score[i]; 
			}			
			*/
			//total[temp] = 1;		
			total [sum] = 1;
			//sum = 0 ;
			
		}
		else
		{		
			
			dfs(depth+1,0);			
			
			
			dfs(depth+1,1);		
		}
		
		
		sum = 0;
	
	}
	


}
