import java.util.Scanner;

public class Pro_1226 {

	static String map[];
	static int result;
	static int visit[][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t;		
		for(int i = 0; i<10; i++)
		{
			map = new String[16];
			visit = new int[16][16];
			result =0;
			
			t = in.nextInt();
			
			
			for(int j=0; j<map.length; j++)
			{				
					map[j] = in.next();
				
			}
			
			
			dfs(1,1);
			
			/*for(int j=0; j<16; j++)
			{
				for(int k=0; k<16; k++)
				{
					System.out.print(visit[j][k]);
					if(k==15)
						System.out.println();
					else
						System.out.print(" ");
				}
			}*/
			
			System.out.println("#"+t+" "+result);
		}

	}

	public static void dfs(int x,int y)
	{
		if(map[y].charAt(x) == '3')
		{
			result = 1;
			return;
		}
		
		visit[y][x] = 1;
	
		
		if( (map[y].charAt(x+1) == '0' || map[y].charAt(x+1) == '3')  && visit[y][x+1] != 1)
		{
			dfs(x+1,y);
		}
		
		if( (map[y].charAt(x-1) == '0' || map[y].charAt(x-1) == '3') && visit[y][x-1] != 1)
		{
			dfs(x-1,y);
		}
		
		if( (map[y-1].charAt(x) == '0' || map[y-1].charAt(x) == '3') && visit[y-1][x] != 1)
		{
			dfs(x,y-1);
		}
		
		if( (map[y+1].charAt(x) == '0' || map[y+1].charAt(x) == '3') && visit[y+1][x] != 1)
		{
			dfs(x,y+1);
		}
		
	}
}


//맞았는데 ??
//근데 이클립스에서는 출력이상하게됨 
