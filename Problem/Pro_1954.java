import java.util.Scanner;

public class Pro_1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t=in.nextInt();
		int n;
		int map[][];		
		int cur;
		int dx[] = {1, 0, -1, 0};
		int dy[] = {0, 1, 0, -1};
		int curx,cury;
		
		for(int i=1; i<=t; i++)
		{
			n=in.nextInt();
			map = new int[n+1][n+1];
			
			cur=0;
			curx=1; 
			cury=1;
			for(int j=1; j<=n*n; j++)
			{
				map[cury][curx] = j;
				
				curx+= dx[cur];
				cury+= dy[cur];
				if(curx >n || curx < 1 || cury >n || cury <1 || map[cury][curx]!=0 )
				{
					curx-=dx[cur];
					cury-=dy[cur];
					
					cur+=1;
					if(cur >3)
						cur=0;
					
					curx+=dx[cur];
					cury+=dy[cur];
				}
			}
		
			System.out.println("#"+i);
			for(int j=1; j<=n; j++)
			{
				for(int k=1; k<=n; k++)
				{
					System.out.print(map[j][k]);
					if(k==n)
						System.out.println();
					else
						System.out.print(" ");
				}
			}
		}
	}

}
