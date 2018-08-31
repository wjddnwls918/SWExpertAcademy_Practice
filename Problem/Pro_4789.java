import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Pro_4789 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		
		
		for(int x=1; x<=T; x++) {
			int result = 0;
			int curClap = 0;
			String personIf = in.readLine();
	
			for(int i=0; i<personIf.length(); i++) {
				int cur = Integer.parseInt(personIf.charAt(i)+"");
				if(cur == 0) 
					continue;
					
				if (i <= curClap  ) {
					curClap += cur;
				}else {
					result += (i-curClap);		
					curClap += (i-curClap);
					curClap += cur;
					
				}
				
			}			
			
			System.out.println("#"+x+" "+result);
		}	
		
	}

}
