import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Pro_6958 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
			int N,M;
			String temp[];
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			int map[][] = new int[N][M];
			
			for(int i=0; i<N; i++) {
				temp = in.readLine().split(" ");
				for(int j=0; j<M; j++) {
					map[i][j] = Integer.parseInt(temp[j]);
				}
			}
			
			HashMap<Integer, Integer> result = new HashMap<>();
			int max = -1;
			for(int i=0; i<N; i++) {
				int tem = 0;
				for(int j=0; j<M; j++) {
					if(map[i][j] == 1) {
						tem += 1;
					}
				}
				if(max <= tem ) {
					max = tem;
					if(result.containsKey(max)) {
						result.put(max, result.get(max)+1);
					} else {
						result.put(max,1);
					}
				}
			}
			
			System.out.println("#"+x+" "+result.get(max)+" "+max);
			
			
		}
	}

}
