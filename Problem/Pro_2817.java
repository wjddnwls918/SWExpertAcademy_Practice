import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_2817 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		String temp[];
		int N,K;
		int num[];
		for(int x=1; x<T; x++)
		{
			temp = in.readLine().split(" ");
			
			N = Integer.parseInt( temp[0] );
			K = Integer.parseInt( temp[1] );
			
			temp = in.readLine().split(" ");
			
			num = new int[N];
			
			for(int i =0; i<N; i++)
			{
				num[i] = Integer.parseInt(temp[i]);
			}
		}
	}

}
