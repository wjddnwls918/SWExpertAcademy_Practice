import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_1868 {

		static int N;
		static int map[][];
		static int dx[] = {0, 1, 1, 1, 0, -1, -1, -1};
		static int dy[] = {-1, -1, 0, 1, 1, 1, 0, -1};
		
		static int check[][];
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp;
		for(int x=1; x<=T; x++)
		{
			N = Integer.parseInt(in.readLine());
			
			map = new int[N][N];
			
			for(int i=0; i<N; i++)
			{
				temp = in.readLine();
				for(int j=0; j<N; j++)
				{
					map[i][j] = temp.charAt(j);
				}
			}
			
			for(int i=0; i<N; i++)
			{				
				for(int j=0; j<N; j++)
				{			
					if(map[i][j] == '.')
						check(j,i);					
				}
			}
			
			/*for(int i=0; i<N; i++)
			{				
				for(int j=0; j<N; j++)
				{
					System.out.print((char)map[i][j]);
					if(j == N-1)
						System.out.println();
					else
						System.out.print(" ");
				}
			}*/
			int result = 0;
			check = new int[N][N];
			for(int i=0; i<N; i++)
			{				
				for(int j=0; j<N; j++)
				{
					if(map[i][j] == '0' && check[i][j]!=1)
					{
						check[i][j] = 1;
						dfs(j,i);
						result ++;						
					}
				}
			}
			
			
		/*	for(int i=0; i<N; i++)
			{				
				for(int j=0; j<N; j++)
				{
					System.out.print(check[i][j]);
					if(j == N-1)
						System.out.println();
					else
						System.out.print(" ");
				}
			}*/
			
			for(int i=0; i<N; i++)
			{				
				for(int j=0; j<N; j++)
				{
					if(map[i][j] != '*' && check[i][j] !=1)
						result++;
				}
			}
			
			System.out.println("#"+x+" "+result);
		}
	}
	
	public static void check(int x, int y)
	{
		int newx,newy;
		int cnt = 0;
		for(int i=0; i<8; i++)
		{
			newx = x + dx[i];
			newy = y + dy[i];
			if(newx >=0 && newx <N && newy >=0 && newy <N)
			{
				if(map[newy][newx] == '*')
					cnt++;
			}
			
		}
		map[y][x] = cnt+'0';
	}
	public static void dfs(int x,int y)
	{
		int newx,newy;
		for(int i=0; i<8; i++)
		{
			newx = x + dx[i];
			newy = y + dy[i];
			if(newx >=0 && newx <N && newy >=0 && newy <N)
			{
				if(map[newy][newx] == '0' && check[newy][newx] != 1)
				{
					check[newy][newx] =1;
					dfs(newx,newy);
				}
				else if( map[newy][newx] >='1' && map[newy][newx] <='9' )
				{
					check[newy][newx] = 1;
					
				}
			}
		}
	}
			

}


//다 나쁘지않음 