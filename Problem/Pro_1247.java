import java.util.Scanner;

public class Pro_1247 {

		static int N;
		static int startx,starty;
		static int endx,endy;
		
		static int map[][];
		
		static int combi[];
		static int check[];
		
		static int min;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();	
		for(int x=1; x<=T; x++)
		{
			N = in.nextInt();
			
			startx = in.nextInt();
			starty = in.nextInt();
			
			endx = in.nextInt();
			endy = in.nextInt();
			
			int mapx[] = new int[N+2];
			int mapy[] = new int[N+2];
			
			
			mapx[0] = startx;
			mapy[0] = starty;
			mapx[N+1] = endx;
			mapy[N+1] = endy;
			for(int i=1; i<=N; i++)
			{
				mapx[i] = in.nextInt();
				mapy[i] = in.nextInt();
			}
			
		
			
			map = new int [N+2][N+2];
		
			
			for(int i=0; i<N+2; i++)
			{
				for(int j=0; j<N+2; j++)
				{
					if(i == j)
						continue;
					if(map[i][j] != 0)
						continue;
					
					map[i][j] = Math.abs(mapx[i]-mapx[j])+Math.abs(mapy[i]-mapy[j]);
					map[j][i] = map[i][j];
				}
			}
			
			
		/*	for(int i=0; i<N+2; i++)
			{
				for(int j=0; j<N+2; j++)
				{
					System.out.print(map[i][j]);
					if(j==N+1)
						System.out.println();
					else
						System.out.print(" ");
				}
			}*/
			
			min = 987654321;
			
			check = new int[N+1];
			combi = new int[N+1];
			for(int i=1; i<=N; i++)
			{
				check[i] = 1;
				combi[1] = i;
				dfs(2);
				combi[1] = 0;
				check[i] = 0;
			}
			
			
			System.out.println("#"+x+" "+min);
		}
		
	}
	
	public static void dfs(int depth)
	{
		int sum;
		
		if(depth == N+1)
		{
			/*for(int i=1; i<=N; i++)
				System.out.print(combi[i]);
			System.out.println();*/
			sum = 0;
			
			sum += map[0][combi[1]];
			sum += map[N+1][combi[N]];
			
			for(int i=1; i<=N-1; i++)
				sum += map[combi[i]][combi[i+1]];
			
			//System.out.println(sum);
			if( min > sum)
				min = sum;
		}
		
		else {
			
		
			for(int i=1; i<=N; i++)
			{
				if(check[i] != 1 )
				{
					check[i] = 1;
					combi[depth] = i;
					dfs(depth+1);
					combi[depth] = 0;
					check[i] = 0;					
				}
			}
		
		}
	}

}
