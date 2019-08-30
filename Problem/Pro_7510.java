import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7510 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; ++tc) {

			int N = Integer.parseInt(in.readLine());

			int cnt = 0;

			int curSize = 0;
			int prePnt = 1;
			for (int i = 1; i <= N; i++) {				

				curSize += i;				
				
				if (curSize > N) {							
					
					while (true) {						
						curSize -= prePnt;						
						prePnt+=1;

						if (curSize <= N)
							break;					
						
					}
					
				}
				
				if (curSize == N) {
					cnt += 1;
				}
					

			}

			System.out.println("#" + tc + " " + cnt);

		}

	}

}
