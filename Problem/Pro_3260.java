import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pro_3260 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		BigInteger a,b;
		String tem[];
		
		for(int x=1; x<=T; x++)
		{
			tem = in.readLine().split(" ");
			a = new BigInteger(tem[0]);
			b = new BigInteger(tem[1]);
			System.out.println("#"+x+" "+(a.add(b)));
		}
	}	

}
//정답 ...
// BigInteger랑 add 메소드 찾아낸거 