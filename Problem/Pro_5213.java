import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_5213 {

		static int d[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		d = new int[1000001];
		d[1] = 1;
		for(int i=2; i<=1000000; i++) {			
			
			if(isPrime(i)) {
				d[i] = 1 + i;
			}else {
			
				for(int j=1; j<=i; j+=2) {				
				
					if(i%j == 0) {
						d[i] += j;
					}
				}
			}
		}
		System.out.println("end");
		
		String tem[];
		for(int x = 1; x<=T; x++) {
			tem = in.readLine().split(" ");
			int start = Integer.parseInt(tem[0]);
			int end = Integer.parseInt(tem[1]);
			
			int result = 0;
			
			for(int i=start; i<=end; i++) {
				result += d[i];
			}
			
			System.out.println("#"+x+" "+result);
			
		}
		

	}
	
	public static boolean isPrime(int n) {
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;			
		}
		
		return true;
	}

}
