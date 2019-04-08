import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Pro_7396 {

	static int N, M;
	static String map[][];
	static String d[][];


	// 왼, 위
	static int dx[] = { -1, 0 };
	static int dy[] = { 0, -1 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		String temp[];

		for (int x = 1; x <= T; x++) {
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);

			map = new String[N][M];
			d = new String[N][M];
		
			for (int i = 0; i < N; i++) {
				String input = in.readLine();
				for (int j = 0; j < M; j++) {
					map[i][j] = input.charAt(j) + "";
					d[i][j] = new String();
				}
			}

			findStr();

			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					System.out.print(d[i][j]);
					if(j == M-1) 
						System.out.println();
					else
						System.out.print(" ");
				}
			}
			
			String result = d[N - 1][M - 1];
			System.out.println("#" + x + " " + result);

		}

	}

	public static void findStr() {

		d[0][0] = map[0][0];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {

				String upValue = "";
				String leftValue = "";

				// 왼
				if ((j + dx[0]) >= 0 && !d[i][j + dx[0]].equals("")) {
					leftValue = d[i][j + dx[0]];
					leftValue += map[i][j];
				}

				// 위
				if ((i + dy[1]) >= 0 && !d[i + dy[1]][j].equals("")) {
					upValue = d[i + dy[1]][j];
					upValue += map[i][j];
				}

				// 두개다 ""
				if (upValue.equals("") && leftValue.equals("")) {
					continue;
				} else if (leftValue.equals("")) {
					// 하나
					d[i][j] = upValue;

				} else if (upValue.equals("")) {
					// 하나
					d[i][j] = leftValue;

				} else {
					// 둘다 있을때

					if (leftValue.compareTo(upValue) < 0) {
						d[i][j] = leftValue;
					} else {
						d[i][j] = upValue;
					}

				}

			}
		}

	}


}


//틀림 런타임
