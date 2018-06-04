import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pro_1953 {

		static int map[][];
		static int check[][];

		static int N,M,R,C,L;
		
		static Queue<Info> que;
		
		//상 하 좌 우
		static int dx[] = {0, 0, -1, 1};
		static int dy[] = {-1, 1, 0, 0};
		
		static int flag[][] = {
			{1,1,1,1},
			{1,1,0,0},
			{0,0,1,1},
			{1,0,0,1},
			{0,1,0,1},
			{0,1,1,0},
			{1,0,1,0}			
		};
	
		static int result;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=1; i<=t; i++)
		{
			N = in.nextInt();
			M = in.nextInt();
			R = in.nextInt();
			C = in.nextInt();
			L = in.nextInt();
		
			map = new int[N][M];
			check = new int[N][M];
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<M; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			que = new LinkedList();			
			
			que.add(new Info(C,R,1));
			check[R][C] = 1;
			Info temp;
			int newx,newy;			
			result = 0;
			
			while(!que.isEmpty())
			{
				
				temp = que.poll();				
				result ++;
				
				for(int j=0; j<4; j++)
				{
					newx = temp.x + dx[j];
					newy = temp.y + dy[j];
					
					if(flag[map[temp.y][temp.x]-1][j] == 1)
					{
						if(j==0)
						{
							if( newy >= 0 && check[newy][newx] != 1 && temp.time+1 <= L	&&map[newy][newx]!=0 
									&& map[newy][newx]!= 3 && map[newy][newx]!= 4 && map[newy][newx]!= 7 )
							{
								que.add(new Info(newx,newy,temp.time+1));
								check[newy][newx]=1;
							}
						}
						else if(j ==1)
						{
							if( newy < N && check[newy][newx] != 1 && temp.time+1 <= L	&&map[newy][newx]!=0
									&& map[newy][newx]!= 3 &&	map[newy][newx]!= 5 && map[newy][newx]!= 6)
							{
								que.add(new Info(newx,newy,temp.time+1));
								check[newy][newx]=1;
							}
						}
						else if( j==2)
						{
							if( newx >= 0 && check[newy][newx] != 1 && temp.time+1 <= L	&&map[newy][newx]!=0
									&& 	map[newy][newx]!= 2 && map[newy][newx]!= 6 && map[newy][newx]!= 7)
							{
								que.add(new Info(newx,newy,temp.time+1));
								check[newy][newx]=1;
							}
						}
						else
						{
							if( newx < M && check[newy][newx] != 1 && temp.time+1 <= L	&&map[newy][newx]!=0
									&& map[newy][newx]!= 2 &&	map[newy][newx]!= 4 && map[newy][newx]!= 5)
							{
								que.add(new Info(newx,newy,temp.time+1));
								check[newy][newx]=1;
							}
						}
					}
				}
				
			}
			
			System.out.println("#"+i+" "+result);
		
		}
	}
		
	static class Info
	{
			int x,y;
			int time;
			public Info(int x,int y,int time)
			{
				this.x = x;
				this.y = y;
				this.time = time;
			}
	}

}


//반복되는건 줄였는데 
// 메모리, 코드길이 조금 길다.