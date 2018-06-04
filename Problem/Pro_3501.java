import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3501 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		double p,q;
		String temp[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			p = Double.parseDouble(temp[0]);
			q = Double.parseDouble(temp[1]);
			
			System.out.println(p/q);
		}
		
	}

}
