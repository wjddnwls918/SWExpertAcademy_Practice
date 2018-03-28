import java.util.Scanner;

public class Pro_1949 {

		static int N,K;
		static int map[][];
		static int check[][];
		static int lntLen;
		
		static int dx[] = {1, 0, -1, 0};
		static int dy[] = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t= in.nextInt();
		int max;
		for(int i=1; i<=t; i++)
		{
			N = in.nextInt();
			K = in.nextInt();
			map = new int[N][N];
			
			max = -1;
			lntLen = -1;
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					map[j][k] = in.nextInt();
					if(max < map[j][k])
						max = map[j][k];
				}
			}
			
			
			//깍는다 
			int templen;
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{					
										
					//깍기
					for(int o=1; o <=K; o++)
					{
						map[j][k] -= o;
					
						//찾는다
						for(int l=0; l<N; l++)
						{
							for(int m=0; m<N; m++)
							{
								if(map[l][m] == max)
								{
									check = new int[N][N];
									dfs(m,l,1);
								}
							}			
						}
					
						map[j][k] += o;
					
					}
				}
			}
			
			System.out.println("#"+i+" "+lntLen);
		}
	}
	
	public static void dfs(int x, int y,int depth)
	{
		check[y][x] = 1;
		
		boolean calflag = true;
		for(int i=0; i<4; i++)
		{
			int newx = x + dx[i];
			int newy = y + dy[i];
			
			if(newx>=0 && newx<N && newy>=0 && newy<N  &&  (map[y][x]>map[newy][newx]) && check[newy][newx]!=1 )
			{
				calflag = false;
				dfs(newx,newy,depth+1);
			}
			
		}
		
		if(calflag)
		{
			if(lntLen < depth)
				lntLen = depth;
		}
		
		//이렇게 백트래팅하면 난리난다 .
		//check = new int[N][N];
		
		//이렇게 해야지 
		check[y][x] = 0;
	}

}


//메모리, 실행시간 조금 길다.