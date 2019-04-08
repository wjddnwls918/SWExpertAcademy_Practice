import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_2007 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String input;
		for (int x = 1; x <= T; x++) {
			input = in.readLine();

			int result = 0;
			for (int i = 3; i <= 30; i++) {

				String temp = input.substring(0,i);
				
				boolean isOk = true;
				int k = 0;
				for(int j=i; j<30; j++) {
					
					if(input.charAt(j) != temp.charAt(k)) {
						isOk = false;
						break;
					}
					
					k += 1;
					if(k >= temp.length())
						k = 0;
					
				}				
					
				if(isOk) {
					result = i;
					break;
				}
			}
			System.out.println("#"+x+" "+result);
		}
	}

}
