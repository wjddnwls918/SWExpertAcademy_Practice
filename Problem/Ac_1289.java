import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1289 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String origin;
		char prev;
		int result;
		for(int x=1; x<=T; x++)
		{
			origin = in.readLine();
			prev = '0';
			result = 0;
			for(int i=0; i<origin.length(); i++)
			{
				if(origin.charAt(i) != prev)
				{
					result += 1;
					if(prev == '0')
						prev = '1';
					else
						prev = '0';
				}				
			}
			
			System.out.println("#"+x+" "+result);
		}
		
	}

}

//정답  prev생각해낸게 크다
// 이거 처음에는 조합으로 하려했던걸로 기억 (말도안됨 N 크기가 너무 큼)