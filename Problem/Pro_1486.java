import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_1486 {

		static int N,B;
		static int h[];
		static int diff;
		static int check[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x = 1; x<=T; x++) {
			
			temp = in.readLine().split(" ");
			
			N = Integer.parseInt(temp[0]);
			B = Integer.parseInt(temp[1]);
			
			h = new int[N];
			check = new int[N];
			
			temp = in.readLine().split(" ");
			for(int i=0; i<N; i++)
				h[i] = Integer.parseInt(temp[i]);
			
			
			diff = 987654321;
			
			//on off			
	
			check[0] = 1;
			dfs(1,h[0]);
			check[0] = 0;
			
			dfs(1,0);
			
			System.out.println("#"+x+" "+diff);
			
		}
	}
	
	public static void dfs(int pnt,int sum) {
			
		
		if( sum - B >= 0) {	
			
			if(sum-B < diff) {
				diff = sum-B;
			}
		}
			
		//return 위치
		if(pnt >= N)
			return;
		
		check[pnt] = 1;
		dfs(pnt+1,sum+h[pnt]);
		check[pnt] = 0;
		
		dfs(pnt+1,sum);		
		
	}

}
