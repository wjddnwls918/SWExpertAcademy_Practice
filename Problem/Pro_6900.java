import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_6900 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int x = 1; x <= T; x++) {

			int N, M;
			String temp[];
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);

			String lotto[] = new String[N];
			String jh[] = new String[M];
			int money[] = new int[N];

			for (int i = 0; i < N; i++) {
				temp = in.readLine().split(" ");
				lotto[i] = temp[0];
				money[i] = Integer.parseInt(temp[1]);
			}
			for (int i = 0; i < M; i++) {
				jh[i] = in.readLine();
			}

			int result = 0;

			// 주혁이가 구매한 복권을
			for (int i = 0; i < M; i++) {

				// 비교한다				
				for (int j = 0; j < N; j++) {
					boolean isOk = true;
					
					for (int k = 0; k < 8; k++) {
						if (jh[i].charAt(k) != lotto[j].charAt(k) && lotto[j].charAt(k) != '*') {
							isOk = false;
							break;
						}
					}

					if (isOk) {
						result += money[j];
						
					}
				}

			}

			System.out.println("#" + x + " " + result);
		}

	}

}
