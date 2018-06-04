import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pro_2382 {

	static int N,M,K;
	
	static Info map[][];
	static Info nextMap[][];
	
	//상하좌우
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	
	static int sum;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(in.readLine());
	
	
		for(int i=1; i<=t; i++)
		{
			String temp[];
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			K = Integer.parseInt(temp[2]);
						
			map = new Info[N][N];
			nextMap = new Info[N][N];
					
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					map[j][k] = new Info();
					nextMap[j][k] = new Info();
				}
			}
			
			int x,y;
			for(int j=0; j<K; j++)
			{
				
				temp = in.readLine().split(" ");
				
				map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])].cnt=Integer.parseInt(temp[2]);
				map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])].dir=Integer.parseInt(temp[3]);
									
			}
			
	
		
			int newx,newy;
			int max,direction;
			//M시간
			for(int l =0; l < M; l++)
			{
				for(int j=0; j<N; j++)
				{
					for(int k=0; k<N; k++)
					{
						
							
							
							//있는경우 								
							if(map[j][k].cnt > 0)
							{							
								newx = k + dx[map[j][k].dir - 1];
								newy = j + dy[map[j][k].dir - 1];
							
								//약품
								if(newx == 0 || newx == N-1 || newy == 0 || newy ==N-1)
								{
									nextMap[newy][newx].cnt = map[j][k].cnt/2;
									
									if(map[j][k].dir == 1)
										nextMap[newy][newx].dir = 2;
									else if(map[j][k].dir == 2)
										nextMap[newy][newx].dir = 1;
									else if(map[j][k].dir == 3)
										nextMap[newy][newx].dir = 4;
									else if(map[j][k].dir == 4)
										nextMap[newy][newx].dir = 3;
									
								}
								
								else {
									
									if(nextMap[newy][newx].cnt > 0)
									{
										nextMap[newy][newx].cnt += map[j][k].cnt;
										if(nextMap[newy][newx].maxcnt < map[j][k].cnt)
										{
											nextMap[newy][newx].maxcnt = map[j][k].cnt;
											nextMap[newy][newx].dir = map[j][k].dir;
										}
									}
									
									else {
										nextMap[newy][newx].cnt = map[j][k].cnt;
										nextMap[newy][newx].maxcnt = map[j][k].cnt;
										
										nextMap[newy][newx].dir = map[j][k].dir;
									}									
									
								}								
								
							}
							
							
							
							
						
							
					
					
					}
				}
				
				for(int m=0; m<N; m++)
				{
					for(int n=0; n<N; n++)
					{
						map[m][n] = nextMap[m][n];
						nextMap[m][n] = new Info();
					}
				}
				
			}
			
			
			int result =0;
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					result+= map[j][k].cnt;
										
				}
			}
			System.out.println("#"+i+" "+result);
				
			
			
		}//End of Testcase
		
	}

	static class Info{
		
		int cnt;
		int dir;
		int maxcnt;
		
		public Info()
		{
			this.cnt = 0;
			this.dir = 0;
			this.maxcnt = 0;
		}
		
		public Info(int cnt, int dir,int maxcnt )
		{
			this.cnt = cnt;
			this.dir = dir;			
			this.maxcnt = maxcnt;
		}

	
		
	}
}
