import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro_4008 {

	static int n;
	static int num[] ;
	static int op[] ;
	static int visit[];
	
	static int min,max;
	
	static int temp;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		
		
		int t = Integer.parseInt( in.readLine() );
		
		
		for(int j=1; j<=t; j++)
		{
			
			n = Integer.parseInt( in.readLine() );
			
			num = new int[n];
			op = new int[4];
			
			visit = new int[n-1];
			
			
			String tem[];
			tem = in.readLine().split(" ");
			
			for(int i=0; i<4; i++)
			{
				op[i] = Integer.parseInt(tem[i]);
			}
			
			tem = in.readLine().split(" ");
			for(int i=0; i<num.length; i++)
			{
				num[i] = Integer.parseInt(tem[i]);
			}
			
			
			//max, min 초기값 설정 잘해야되네 
			max = -2000000000;
			min = 2000000000;
			temp = 0;
			
			for(int i = 0; i<4; i++) {
				
				if(op[i] != 0)
					dfs(i,1);
			}
			
			
			System.out.println("#"+j+" "+(max-min));
			
		}

	}
	
	public static void dfs(int i,int depth)
	{
		op[i] --;
		visit[depth-1] = i;
		
		if(depth == n-1)
		{
			temp = num[0];
			
			for(int j = 0; j<visit.length; j++)
			{
				/*System.out.print(visit[j]);
				if(j == visit.length-1)
					System.out.println();
				else
					System.out.print(" ");*/
				
				if(visit[j] == 0)
				{
					temp = temp + num[j+1];
				}
				else if( visit[j] == 1)
				{
					temp = temp - num[j+1];
				}
				else if( visit[j] == 2)
				{
					temp = temp * num[j+1];
				}
				else
				{
					temp = temp / num[j+1];
				}
			}
			
			if( temp > max)
				max = temp;
			if( temp < min)
				min = temp;
			
			
		}
		
		else
		{
			for(int j = 0; j<4; j++) {
				
				if(op[j] != 0)
					dfs(j,depth+1);
			
			}
		}
		
		
		op[i]++;
	}

}
