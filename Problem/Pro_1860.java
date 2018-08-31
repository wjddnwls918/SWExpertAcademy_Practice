import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_1860 {

		static int N;
		static double M,K;
		
		static String result;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			String temp[];
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Double.parseDouble(temp[1]);
			K = Double.parseDouble(temp[2]);
			
			
			temp = in.readLine().split(" ");
			
			int arrive[] = new int[11112];
			int max = -1;
			for(int i=0; i<temp.length; i++) {
				int tem = Integer.parseInt((temp[i]));
				arrive[tem] +=1;
				if(max < tem) {
					max = tem;
				}
			}
			
		
			
			result = "Possible";
			int cur=0;
			for(int i=0; i<=max; i++) {
				
				if(i%M ==0 && i!=0)
					cur += K;
				
				if(arrive[i] != 0) {
					if(cur >= arrive[i]) {
						cur -= arrive[i];
					}else {
						result = "Impossible";
						break;
					}
					
				}
				
			}
			
			System.out.println("#"+x+" "+result);
			
		}	
		
		
		
		
	}

}
