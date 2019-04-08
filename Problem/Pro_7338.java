import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7338 {

		static long Y,M;
		static long sub,pos;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++) {
			temp = in.readLine().split(" ");
			Y = Long.parseLong(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			long remainM = Y - 2016;
			
			sub = remainM / 13;
			
			pos = remainM % 13;
			
			Y -= sub;
					
			
			moveToLeft();
			
			System.out.println("#"+x+" "+Y+" "+M);
			
		}
	}
	
	public static void moveToLeft() {
		if(M - pos <= 0) {
			Y -= 1;
		}
		
		for(int i=0; i<pos; i++) {
			M -= 1;
			if(M == 0)
				M = 13;
		}
		
	}

}
