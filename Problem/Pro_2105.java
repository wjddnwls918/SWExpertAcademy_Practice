import java.util.Scanner;

public class Pro_2105 {

		static int N;
	
		static int map[][];
		//왔던길 돌아가는거
		static int check[][];
		
		static int startx,starty;
		static int ans;
		
		//오아래 오위 왼위 왼아
		static int dx[] = {1,1,-1,-1};
		static int dy[] = {1,-1,-1,1};
					
		//먹었던거 디저트 종류
		static int menu[];
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=1; i<=t; i++)
		{
			N = in.nextInt();
			
			
			map = new int[N][N];			
			
			
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
	
			ans = -1;
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					
					
					startx = k;
					starty = j;
					
					check = new int[N][N];
					menu = new int[100];
					
					menu[map[j][k] -1] = 1;
					
					check[j][k] = 2;
					dfs(k,j,1,0);
					
				
				}
			}
			
			System.out.println("#"+i+" "+ans);
		}
	}
	
	static void dfs(int x, int y,int depth,int dir)
	{		
		
			int newx,newy;
			for(int i=dir; i<4; i++)
			{
				newx = x + dx[i];
				newy = y + dy[i];
				
				if (newy < 0 || newy >= N || newx < 0 || newx >= N)
	                continue;
	            if (newy == starty && newx == startx && depth > 2) {
	                if (depth > ans) {
	                    ans = depth;
	                }
	                continue;
	            }
	            if (menu[map[newy][newx]-1]==1)
	                continue;	
	            
						menu[map[newy][newx]-1] =1;
						check[newy][newx] = 1;
						dfs(newx,newy,depth+1,i);	
						check[newy][newx] = 0;
						menu[map[newy][newx]-1] =0;				
			}
		
			
	}
	
	

}


//디저트카페 

//메모리랑 실행시간이 조금 아쉽구만 ..
//dir로 상태 기억하는게 중요함 !
//사각형을 dx,dy 0~3까지 순서대로 만드는데
//dir은 만약에 0 이면 아직 그려야 되는 시작단계고 
// dir이 1이면 0까지는 한거고 2와 3이 남은거 
//
//    ㅡ
//   | |
//    ㅡ
// 위에 있는 사각형처럼  맨 윗변이 0(dx[0],dy[0]) 오른변이 1 아랫변이 2 왼쪽변이 3
//이라하면 이해가 잘감.
