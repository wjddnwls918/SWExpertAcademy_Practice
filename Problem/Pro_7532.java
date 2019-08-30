import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7532 {

	static int S, E, M;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String temp[];
			temp = in.readLine().split(" ");
			S = Integer.parseInt(temp[0]);
			E = Integer.parseInt(temp[1]);
			M = Integer.parseInt(temp[2]);

			if (E == 24)
				E = 0;
			if (M == 29)
				M = 0;
			while (true) {
				if (S % 24 == E && S % 29 == M)
					break;
				S += 365;

			}

			System.out.println("#" + tc + " " + S);

		}

	}

}
