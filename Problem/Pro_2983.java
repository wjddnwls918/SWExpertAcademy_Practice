import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_2983 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			int L = Integer.parseInt(in.readLine());
			String S = in.readLine();
			
			int maxLen = 0;
			
			
			for(int i=0; i<=L-1; i++){				
				for(int j=i+1; j<=L; j++){
					
					String subStr = S.substring(i,j);
					
					
					if(subStr.length() == L)
						continue;					
					
					if(subStr.length() <= maxLen)
						continue;
					
					//System.out.println(subStr);
					
					
					int cnt = 0;
					boolean isOk = false;
					for(int k=0; k<S.length(); k++) {
						
						if( S.substring(k,S.length()).contains(subStr) )
							cnt++;					
						
						if(cnt >= 2) {
							isOk = true;
							break;		
						}
					}
					
					if(isOk) {
						//System.out.println(subStr);
						if(maxLen < subStr.length() ) {
							maxLen = subStr.length();
						}
					}
				}
			}
			
			
			
			System.out.println("#"+x+" "+maxLen);
			
		}
		
		
	}

}
