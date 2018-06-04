import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Pro_4050 {

		static int N;	
		static int cost[];			
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader( System.in));
		
		int t = Integer.parseInt(in.readLine());
		String temp[];	
		for(int x=1; x<=t; x++)
		{
			N = Integer.parseInt(in.readLine());
			
			temp = in.readLine().split(" ");
			cost = new int[N];			
			
			for(int i=0; i<N; i++)
			{
				cost[i] = Integer.parseInt(temp[i]);
			}
			
			
			Arrays.sort(cost);
			
			int total = 0;
			for(int i=N-1; i>=2; i-=3)
			{
				total += (cost[i] + cost[i-1]);
			}
			if(N % 3 != 0) {
				for(int i=0; i<N%3; i++)
				{
					total += cost[i];
				}
			}
	
			
			System.out.println("#"+x+" "+total);
		}
	}
	


}

//어 2가 없네 ? 문제가 