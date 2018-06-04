import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Pro_1803
{  
	static final int INF = 987654321; 
	
    static int N,M,S,E;
 
    static int map[][];
    static int dist[];
    static long visit;
    
     
    static PriorityQueue<Info> que;
    
    public static void main(String args[]) throws Exception
    {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(in.readLine());
    	String temp[];
    	for(int x=1; x<=T; x++)
    	{
    		temp = in.readLine().split(" ");
    		
    		N = Integer.parseInt(temp[0]);
    		M = Integer.parseInt(temp[1]);
    		S = Integer.parseInt(temp[2]);
    		E = Integer.parseInt(temp[3]);
    	
    	
    		map = new int[N+1][N+1];
    		dist = new int[N+1];
    		visit = 0;
    		
    		for(int i=1; i<=N; i++)
    		{
    			for(int j=1; j<=N; j++)
    			{
    				if(i!=j)
    					map[i][j] = INF;
    			}
    		}
    		
    		for(int i=0; i<M; i++)
    		{
    			temp = in.readLine().split(" ");
    			int s,e,v;
    			s = Integer.parseInt(temp[0]);
    			e = Integer.parseInt(temp[1]);
    			v = Integer.parseInt(temp[2]);
    			
    			map[s][e] = v;
    			map[e][s] = v;
    			
    			
    		}
    		
  
    		
    		que = new PriorityQueue(new Comparator<Info>() {
    			
	    		@Override
	    		public int compare(Info a1, Info a2) {
	    			// TODO Auto-generated method stub
	    			
	    			if(a1.sumdis<a2.sumdis)
	    				return -1;
	    			else if(a1.sumdis > a2.sumdis)
	    				return 1;
	    			else
	    				return 0;
	    		}
			});
    		
    		que.add(new Info(S,0));
    	
    		Arrays.fill(dist, INF);
    		dist[S] = 0;
    		//visit[S] = true;
    		
    		Info tem;
    		while(!que.isEmpty())
    		{
    			
    			tem = que.poll();
    			
    		
    			/*if(tem.sumdis > dist[tem.v])
					continue;*/
    			visit |= (1<<S);
    			
    				for(int j=1; j<=N; j++)
    				{
    					if( (visit & (1<<j)) != 1<<j && dist[j] > dist[tem.v]+map[tem.v][j])
    					{
    						
    						dist[j] = dist[tem.v]+map[tem.v][j];    						
    						que.add(new Info(j,dist[tem.v]+map[tem.v][j]));
    					}
    				}
    				
    			
    				
    		}
    
    		System.out.println("#"+x+" "+ dist[E]);
    		
    	}
    }
    
    static class Info
    {
    	int v;
    	long sumdis;   
    	public Info(int v,long sumdis)
    	{
    		this.v = v;
    		this.sumdis = sumdis;
    	}
    }
}


//맞는데 메모리 초관데 ??