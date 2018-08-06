import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pro_4751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(in.readLine());
		
		for(int x=1; x<=T; x++) {
			String str = in.readLine();
			
			int len = str.length();
			
			//첫줄 
			for(int i=0; i<len*5 - (len-1); i++) {
				if( i%4 == 2) {
					out.write('#');
					
				}else {
					out.write('.');
					
				}
			}
			out.write('\n');		
			
			
			//둘째
			for(int i=0; i<len*5 - (len-1); i++) {
				if( i%2 == 0) {
					out.write('.');					
				}else {
					out.write('#');					
				}
			}
			out.write('\n');
						
			
			//셋째
			int j=0;
			for(int i=0; i<len*5 - (len-1); i++) {
				if( i%4 == 0) {
					out.write('#');					
				}else if(i%2 == 1) {
					out.write('.');					
				}else {
					out.write(str.charAt(j));					
					j++;
				}
			}
			out.write('\n');
			
			
			for(int i=0; i<len*5 - (len-1); i++) {
				if( i%2 == 0) {
					out.write('.');					
				}else {
					out.write('#');
					
				}
			}
			out.write('\n');			
			
			//다섯
			for(int i=0; i<len*5 - (len-1); i++) {
				if( i%4 == 2) {
					out.write('#');				
				}else {
					out.write('.');					
				}
			}
			out.write('\n');			
			
			
		}
		out.flush();
		out.close();
		
		
	}

}
