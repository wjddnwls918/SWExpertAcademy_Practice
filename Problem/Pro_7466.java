import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7466 {

	static int N,K;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String input[] = in.readLine().split(" ");
			N = Integer.parseInt(input[0]);
			K = Integer.parseInt(input[1]);
			
			
			System.out.println(Math.sqrt(Math.pow(10, 9)));		
			
			System.out.println("#" + tc + " ");
			
		}

	}

}
