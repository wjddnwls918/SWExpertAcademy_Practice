import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_2383 {

		static int n;
		static int map[][];
		static int dis1[][],dis2[][];
				
		static int dx[],dy[];
		static int cnt;
		static int com[];
		
		static Info person[];
		static Info stair[];
					
		static int result;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
			for(int x=1; x<=t; x++)
			{
				n = Integer.parseInt(in.readLine());
				map = new int[n][n];
				dis1 = new int[n][n];
				dis2 = new int[n][n];
				person = new Info[n*n];
				stair = new Info[2];
				
				String temp[];
				
				dx = new int[2];
				dy = new int[2];
				
				cnt = 0;
				int k=0,l=0;
				for(int i=0; i<n; i++)
				{
					temp = in.readLine().split(" ");				
					for(int j=0; j<n; j++)
					{
						map[i][j] = Integer.parseInt(temp[j]);
						if(map[i][j] >= 2)
						{
							stair[k] = new Info(j,i);
							k++;
						}
						
						if(map[i][j] == 1)
						{
							person[l] = new Info(j,i);
							l++;
						}
					}
				}
				
				cnt = l;
				com = new int[cnt];
				
				
				result = 987654321;
				
				dfs(0);
				
				System.out.println("#"+x+" "+result);
			}
			
			
			
	}
	
	public static void dfs(int depth)
	{
		if(depth == cnt)
		{
			//처리
			int cnt1,cnt2;
			cnt1=0;
			cnt2=0;
		
			int totalmin = 0;
			
			for(int i=0; i<2; i++)
			{
				Info now = stair[i];
				//도착
				int arrive[] = new int[22];
				
				//계단에 있는 사람
				int curstair[] = new int[144];
				
				for(int j=0; j<cnt; j++)
				{
					if( com[j] == i)
					{ 
						arrive[Math.abs(person[j].x-stair[i].x)+Math.abs(person[j].y-stair[i].y)+1]++;
					}
				}
				
				int nowtime = 0;
				
				for(int time = 1; time<=20; time++)
				{
					
					while( arrive[time] > 0)
					{
						arrive[time] --;
						
						int remain = map[now.y][now.x];
						
						for(int walk = time; walk < 144; walk ++)
						{
							if(curstair[walk] < 3)
							{
								curstair[walk]++;
								remain--;
								
								if( remain == 0)
								{
									nowtime = Math.max(nowtime, walk+1);
									break;
								}
								
							}
						}
						
						
					}
				}
				
				totalmin = Math.max(totalmin, nowtime);
				
			}
			
			
			result = Math.min(result, totalmin);
			
		}
		else
		{
			if(depth+1 <= cnt)
			{
			com[depth] = 0;
			dfs(depth+1);
			com[depth] = 0;
			
			com[depth] = 1;
			dfs(depth+1);
			com[depth] = 0;			
			
			}
			
		}
	}
	
	static class Info{
		
		int x,y;
		
		public Info(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
	}
	
		
}


