import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_6692 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			int N = Integer.parseInt(in.readLine());
			double result = 0;
			for(int i=0; i<N; i++) {
				String temp[] = in.readLine().split(" ");
				result += (Double.parseDouble(temp[0])*Double.parseDouble(temp[1]));
			}
			
			
			System.out.println("#"+x+" "+result);
		}
	}

}
