import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7465 {

	static int N, M;

	static int map[][];
	static int check[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String input[];
			input = in.readLine().split(" ");

			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);

			map = new int[N + 1][N + 1];
			check = new int[N + 1];

			for (int i = 0; i < M; i++) {
				input = in.readLine().split(" ");

				int a, b;
				a = Integer.parseInt(input[0]);
				b = Integer.parseInt(input[1]);
				map[a][b] = 1;
				map[b][a] = 1;

			}

			int cnt = 0;

			for (int i = 1; i <= N; i++) {
				if (check[i] != 1) {
					check[i] = 1;

					for (int j = 1; j <= N; j++) {
						if (map[i][j] == 1 && check[j] != 1) {
							check[j] = 1;
							calMuri(j);
						}
					}

					cnt += 1;
				}
			}

			for (int i = 1; i <= N; i++) {
				if (check[i] != 1) {
					cnt += 1;
				}
			}

			System.out.println("#" + tc + " " + cnt);

		}

	}

	public static void calMuri(int num) {

		for (int i = 1; i <= N; i++) {
			if (map[num][i] == 1 && check[i] != 1) {
				check[i] = 1;
				calMuri(i);
			}
		}

	}

}
