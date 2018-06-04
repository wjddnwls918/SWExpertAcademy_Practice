import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_4192 {

		static int N;
		static int map[][];
		static int check[][];
		static int A,B,C,D;
		static Queue<Info> que;
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};	
		
		static int result;
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			map = new int[N][N];
			
			for(int i=0; i<N; i++)
			{
				temp = in.readLine().split(" ");
				for(int j=0; j<N; j++)
				{
					map[i][j] = Integer.parseInt(temp[j]);
				}
			}
			
			temp = in.readLine().split(" ");
			A = Integer.parseInt(temp[0]);
			B = Integer.parseInt(temp[1]);
			
			temp = in.readLine().split(" ");
			C = Integer.parseInt(temp[0]);
			D = Integer.parseInt(temp[1]);
			
			que = new LinkedList();
			check = new int[N][N];
			que.add(new Info(B,A,0));
			check[A][B] = 1;
			result =0;
			Info tem;
			while(!que.isEmpty())
			{
				//System.out.println("check");
				tem = que.poll();
				
				if(tem.x == D && tem.y == C)
				{
					result = tem.time;
					break;
				}
					
				int newx,newy;
				for(int i=0; i<4; i++)
				{
					newx = tem.x+dx[i];
					newy = tem.y+dy[i];
					
					if(newx>=0 && newx<N && newy>=0 && newy<N && check[newy][newx] != 1 && map[newy][newx]==0)
					{
						check[newy][newx] = 1;
						que.add(new Info(newx,newy,tem.time+1));
					
					}					
					
				}				
			}
			if(result == 0)
				result = -1;
			System.out.println("#"+x+" "+result);
		}
		
	}

	static class Info
	{
		int x,y;
		int time;
		public Info(int x, int y, int time)
		{
			this.x = x;
			this.y = y;
			this.time = time;			
		}
	}
}
