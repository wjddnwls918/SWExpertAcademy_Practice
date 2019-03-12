import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7088 {

		static int N,Q;
		static int cow[];
	
		static int nthOne[];
		static int nthTwo[];
		static int nthThree[];
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++) {
			
			
			
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			Q = Integer.parseInt(temp[1]);
			
			cow = new int[N+1];
			nthOne = new int[N+1];
			nthTwo = new int[N+1];
			nthThree = new int[N+1];
						
			int one=0,two=0,three=0;
			for(int i=1; i<=N; i++) {
				cow[i] = Integer.parseInt(in.readLine());
				
				if(cow[i] == 1) {
					one+=1;					
				}else if(cow[i] == 2) {
					two+=1;					
				}else {
					three+=1;					
				}
				
				nthOne[i] = one;
				nthTwo[i] = two;
				nthThree[i] = three;
				
			}
			
			System.out.println("#"+x);
			for(int i=0; i<Q; i++) {
				
				int L,R;
				temp = in.readLine().split(" ");
				L = Integer.parseInt(temp[0]);
				R = Integer.parseInt(temp[1]);				
			
				System.out.println((nthOne[R] - nthOne[L-1]) +" "+ (nthTwo[R] - nthTwo[L-1]) +" "+(nthThree[R] - nthThree[L-1]));				
			}			
			
			
			
		}
	}

}
