import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Pro_6855 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			int N, K;
			String input[] = in.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			K = Integer.parseInt(input[1]);

			int result = 0;

			input = in.readLine().split(" ");
			
			if (N > K) {				

				PriorityQueue<Integer> que = new PriorityQueue<>();
				for (int i = 0; i < input.length - 1; i++) {
					que.add(Math.abs(Integer.parseInt(input[i]) - Integer.parseInt(input[i + 1])));
				}

				for (int i = 0; i < N-K; i++) {
					result += que.poll();
				}

			}

			System.out.println("#" + x + " " + result);

		}

	}

}
