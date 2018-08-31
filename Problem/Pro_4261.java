import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_4261 {
	
		static char keypad[][] = {{},{},{'a','b','c'},{'d','e','f'},
				{'g','h','i'},
				{'j','k','l'},
				{'m','n','o'},
				{'p','q','r','s'},
				{'t','u','v'},
				{'w','x','y','z'}
								};

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			
			String tem[] = in.readLine().split(" ");
			
			String btn = tem[0];
			int N = Integer.parseInt(tem[1]);
			String word[] = new String[N];
			tem = in.readLine().split(" ");
			for(int i=0; i<N; i++) {
				word[i] = tem[i];
			}
			
			
			int result = 0;
			boolean flag;
			for(int i=0; i<N; i++) {
				
				if(word[i].length() != btn.length()) 
					continue;
							
				flag = true;
				for(int j=0; j<btn.length(); j++) {
					
					int len = keypad[Integer.parseInt(btn.charAt(j)+"")].length;
					boolean isCheck = false;
					for(int k=0; k<len; k++) {
						
						if(word[i].charAt(j) == keypad[Integer.parseInt(btn.charAt(j)+"")][k]) {
							isCheck = true;
							break;
						}
						
					}
					if(!isCheck) {
						flag = false;
						break;
					}
					
					
					
				}
				if(flag)
					result++;
				
			}
												
			
			
			System.out.println("#"+x+" "+result);
		}
	}

}
