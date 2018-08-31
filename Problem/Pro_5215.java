import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_5215 {
	
		static int N,L;
		static int max;

		static Hamburger ham[];
		static int check[];
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String tem[] = in.readLine().split(" ");
			N = Integer.parseInt(tem[0]);
			L = Integer.parseInt(tem[1]);
			
			ham = new Hamburger[N];
			for(int i=0; i<N; i++) {
				tem = in.readLine().split(" ");
				ham[i] = new Hamburger(Integer.parseInt(tem[0]), Integer.parseInt(tem[1]));
			}
			
			check = new int[N];
			
			max = 0;
			//off
					dfs(1,0, 0);
				
			//on
				if(L >= ham[0].kcal);
					dfs(1,ham[0].pnt, ham[0].kcal);
				
				
				System.out.println("#"+x+" "+max);
		}
	}
	
	public static void dfs(int depth,int totalPnt, int totalCal) {
		
		if( depth == N ) {
		
			if(max < totalPnt) {
				max = totalPnt;
			}			
			
			return;
		}
		
		
		//off
			dfs(depth+1,totalPnt, totalCal);
		
		//on
		if(L >= totalCal+ham[depth].kcal)
			dfs(depth+1,totalPnt+ham[depth].pnt, totalCal+ham[depth].kcal);
		
	}
	
	static class Hamburger{
		int pnt;
		int kcal;
		
		public Hamburger(int pnt, int kcal) {
			this.pnt = pnt;
			this.kcal = kcal;
		}
	}

}
