import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pro_2117 {

		static int N,M;
		static int map[][];
		static int check[][];
		static int Kcost;
		
		static int cntHouse;
		static int maxHouse;
		
		
		static int dx[] = {1, 0, -1, 0 };
		static int dy[] = {0, 1, 0, -1 };
		
	
		static int K;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int i=1; i<=t; i++)
		{
			N = in.nextInt();
			M = in.nextInt();
			
			map = new int[N][N];
			
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<N; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			//System.out.println(Math.round(7.0/2.0) );
			
			//k 1 ~ 
			maxHouse = -1;
			for(int j=1; j<2*N; j++)
			{
				K=j;
				Kcost = K * K + (K - 1) * (K - 1);
				for(int k=0; k<N; k++)
				{
					for(int l=0; l<N; l++)
					{
						check = new int[N][N];
						cntHouse = 0;						
						
		                for (int ii = 0; ii < N; ii++) {
		                    for (int jj = 0; jj < N; jj++) {
		                    	//거리네 
		                        if (map[ii][jj] == 1 && Math.abs(k - ii) + Math.abs(l - jj) < K) 
		                        	cntHouse++;
		                    }
		                }
						
		                if(Kcost <= cntHouse *M)
						{
							
							if( maxHouse < cntHouse)
							{
								//System.out.println(cntHouse);
								maxHouse = cntHouse;
							}
						}
					
						
						
					}
				}
			}
			
			System.out.println("#"+i+" "+maxHouse);
			
			
		}
	}
	

}
