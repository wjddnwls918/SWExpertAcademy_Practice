import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4299 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String tem[];
			tem = in.readLine().split(" ");
			int D,H,M;
			D = Integer.parseInt(tem[0]);
			H = Integer.parseInt(tem[1]);
			M = Integer.parseInt(tem[2]);
			
			int resD = D -11;
			int resH = H -11;
			int resM = M -11;
			
			int result = resD * 1440 + resH * 60 + resM;
			if(result >= 0)
				System.out.println("#"+x+" "+result);
			else
				System.out.println("#"+x+" -1");
		}
	}

}
