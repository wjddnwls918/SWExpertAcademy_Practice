import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3234 {

		static int N;
		static int weight[];
		
		static int check[];
		static int combi[];
		
		static int total;
		
		static int select[];
		
		static int cnt;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x = 1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			weight = new int[N];
			
			
			temp = in.readLine().split(" ");
			total = 0;
			for(int i=0; i<N; i++)
			{
				weight[i] = Integer.parseInt(temp[i]);
				total += weight[i];
			}
			
			//System.out.println(total);
			
			cnt = 0;
			for(int i=0; i<N; i++)
			{
				check = new int[N];
				combi = new int[N];
				
				check[i] = 1;
				combi[0] = weight[i];
				dfs(1);
				combi[0] = 0;
				check[i] = 0;
			}
			
			System.out.println("#"+x+" "+cnt);
			
		}
		
		
		
	}
	
	public static void dfs(int depth)
	{
		if(depth == N)
		{						
			select = new int[N];
				select[0] = 1;
				sel(1);
				select[0] = 0;
				
				select[0] = 2;
				sel(1);
				select[0] = 0;			
			
		}
		else
		{
			for(int i=0; i<N; i++)
			{
				if(check[i] != 1)
				{
					check[i] = 1;
					combi[depth] = weight[i];
					dfs(depth+1);
					combi[depth] = 0;
					check[i] = 0;					
					
				}
			}
			
		}
	}
	
	public static void sel(int depth)
	{
		if(depth == N)
		{
		/*	for(int i=0; i<N; i++)
			{
				System.out.print(select[i]);
				if(i ==N-1)
					System.out.println();
				else
					System.out.print(" ");
			}*/
			
			//Left > Right 
			int left=0;
			int right;
			for(int i=0; i<N; i++)
			{
				
				if(select[i] == 1)
				{
					left += combi[i];
				}
			}
			right = total -left;
			
			if( left > right)
				cnt++;
			
			
			return;
		}
		else
		{
			select[depth] = 1;
			sel(depth+1);
			select[depth] = 0;
			
			select[depth] = 2;
			sel(depth+1);
			select[depth] = 0;
			
		}
		
	}

}
