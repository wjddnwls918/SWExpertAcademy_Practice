import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pro_4466 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String tem[];
			tem = in.readLine().split(" ");
			int N = Integer.parseInt(tem[0]);
			int K = Integer.parseInt(tem[1]);
			tem = in.readLine().split(" ");
			int score[] = new int[N];
			for(int i=0; i<N; i++) {
				score[i] = Integer.parseInt(tem[i]);
			}
			Arrays.sort(score);
			
			int result = 0;
			for(int i=score.length-1; i>score.length-1-K; i--) {
				result += score[i];
			}
			
			System.out.println("#"+x+" "+result);
			
			
		}
		
	}

}
