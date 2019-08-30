import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pro_7227 {
	
	static int N;
	static long min;
	
	static int temp;
	
	static Info info[];
	static int permu[];
	static boolean check[];

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			N = Integer.parseInt(in.readLine());
			
			info = new Info[N];
			String input[];
			for(int i=0; i<N; i++) {
				input = in.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				info[i] = new Info(x,y);
			}
			
			
			min = Long.MAX_VALUE;
			
			System.out.println(min);
			
			permu = new int[N];
			check = new boolean[N];
			
			for(int i=0; i<N; i++) {			
				
				check[i] = true;
				permu[0] = i;
				matching(1,0);
				permu[0] = 0;
				check[i] = false;				
				
			}
			
			System.out.println("#"+tc+" "+min);
			
		}
	}
	
	public static void matching(int depth, int vectorSum) {
		
		if(depth == N) {
						
			for(int i=0; i<N; i++) {
				System.out.print(permu[i]);
				if(i == N-1)
					System.out.println();
				else
					System.out.print(" ");
			}
			
			if(min > vectorSum) {
				min = vectorSum;
				return;
			}
			
			//System.out.println(vectorSum);
		}
		
		for(int i=0; i<N; i++) {
			
			if(check[i] != true) {
				check[i] = true;
				permu[depth] = i;
				
				if(depth %2 == 1) {
					int sum = (info[permu[depth-1]].x - info[permu[depth]].x) + (info[permu[depth-1]].y - info[permu[depth]].y) ;
					matching(depth+1,vectorSum+sum);
				} else {
					matching(depth+1,vectorSum);
				}
				
				permu[depth] = 0;
				check[i] = false;
				
				
			}			
			
		}
		
		
		
	}
	
	
	static class Info {
		int x,y;
		public Info(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
