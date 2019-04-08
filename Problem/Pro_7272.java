import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7272 {

	static char alpha[] = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++) {
			temp = in.readLine().split(" ");
			String str1,str2;
			str1 = temp[0];
			str2 = temp[1];
			
			System.out.println("#"+x+" "+compareResult(str1,str2));
			
		}
	}
	
	public static String compareResult(String str1, String str2) {
		
		boolean isSame = true;
		
		if(str1.length() != str2.length())
			return "DIFF";
		
		for(int i=0; i<str1.length(); i++) {
			if(alpha[str1.charAt(i)-'A'] != alpha[str2.charAt(i)-'A']) {
				isSame = false;
				break;
			}
		}		
			
		if(isSame)
			return "SAME";
		else
			return "DIFF";
	}

}
