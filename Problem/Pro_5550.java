import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_5550 {

	static char croak[] = { 'c', 'r', 'o', 'a', 'k' };
	static int check[];
	static int checkindex[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			String str = in.readLine();
			check = new int[str.length()];
			System.out.println("#" + x + " " + findMinFrog(str));
		}
	}

	public static int findMinFrog(String str) {

		boolean isOk = false;
		int result = 0;

		while (true) {
			
			checkindex = new int[5];
			int j = 0;
			boolean isEnd = true;
			int cnt = 0;
		
			for (int i = 0; i < str.length(); i++) {

				if (check[i] != 1 && str.charAt(i) == croak[j]) {

					checkindex[j] = i;
					check[i] = 1;
					cnt ++;
					isEnd = false;
					if (cnt == 5) {
						result += 1;
						isOk = true;
						
					}

					j += 1;
					if (j >= 5)
						j = 0;
					
					continue;
				}
							
			}

			System.out.println("check");
			if(cnt < 5) {
				for(int i=0; i<5; i++) {
					check[checkindex[i]] = 0;
				}
			}
			
			if (isEnd)
				break;
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(check[i]);
			if(check[i] != 1) {
				isOk = false;
				break;
			}
		}
		
		if (isOk)
			return result;
		else
			return -1;
	}

}
