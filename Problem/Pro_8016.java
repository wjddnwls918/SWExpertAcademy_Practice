import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_8016 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
			long N = Integer.parseInt(in.readLine());
			
			long right = 2*N*N-1;
			
			long left = right - 2* (N*N - (N-1)*(N-1))+2;
					
			
			System.out.println("#"+x+" " + left+" "+right);
			
		}
		
		
	}

}


//Math.pow는 long long을 지원하지 않는다.