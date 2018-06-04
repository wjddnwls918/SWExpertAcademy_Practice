import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_3143 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		String temp[];
		String A,B;
		int cnt;
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			A = temp[0];
			B = temp[1];
			
			cnt = 0;
			
			
			for(int i=0; i<=A.length()-B.length(); i++)
			{				
				if( B.equals(A.substring(i, i+B.length())) )
				{
					cnt ++;
					i = i+B.length()-1;
					
				}				
			}
			
			System.out.println("#"+x+" "+ (cnt+ A.length()-B.length()*cnt));
		}
		
		
	}		

}


//그냥 평균인데 다른방법 있을듯 