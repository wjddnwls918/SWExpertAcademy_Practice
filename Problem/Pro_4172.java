import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4172 {
	static int N,M;
	static int P[],S[];
	static int maxS;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		String temp[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			P = new int[M];
			S = new int[M];
			
			for(int i=0; i<M; i++)
			{
				temp = in.readLine().split(" ");
				P[i] = Integer.parseInt(temp[0]);
				S[i] = Integer.parseInt(temp[1]);
			}			
			maxS = -1;
				
			dfs(0,0,0);
							
			System.out.println("#"+x+" "+maxS);
		}
		
	}
	
	public static void dfs(int i, int s, int sum)
	{
		if( sum > N)
			return;
		if( i == M)
		{
			maxS = Math.max(s, maxS);
			return;
		}
		dfs( i +1 , s + S[i],sum + P[i]);
		dfs( i +1 , s, sum );
	}

}

//생각의 전환 선택하거나 안하거나 dfs
