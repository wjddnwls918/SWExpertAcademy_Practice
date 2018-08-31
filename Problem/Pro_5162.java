import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_5162 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String tem[];
			tem = in.readLine().split(" ");
			int A,B,C;
			A = Integer.parseInt(tem[0]);
			B = Integer.parseInt(tem[1]);
			C = Integer.parseInt(tem[2]);
			
			int div = A<B?A:B;
			int result=0;
			result += C/div;
			if(C%div == A || C%div == B) {
				result +=1;
			}
			System.out.println("#"+x+" "+result);
			
		}
		
		
	}

}
