import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4301 {

		static int dx[] = {2,0};
		static int dy[] = {0,2};
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String tem[] = in.readLine().split(" ");
			int N = Integer.parseInt(tem[0]);
			int M = Integer.parseInt(tem[1]);
			
			int map[][] = new int[M][N];
			int result = M*N;
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
										
					if(map[i][j] == 1)
						continue;
					
					for(int k=0; k<2; k++) {
						int nx = j+dx[k];
						int ny = i+dy[k];
						if(ny < M  && nx <N && map[ny][nx] == 0) {
							map[ny][nx] = 1;
							result--;
						}
					}
				}
			}
			System.out.println("#"+x+" "+result);
			
			/*for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}*/
			
		}
		
	}

}
