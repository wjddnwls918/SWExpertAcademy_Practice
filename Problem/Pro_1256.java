import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Pro_1256 {

		static PriorityQueue<Info> que;
		static String result;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			
			int K = Integer.parseInt(in.readLine());
			String str = in.readLine();		
			
			
			
			que = new PriorityQueue();
			for(int i=0; i<str.length(); i++) {			
				que.add(new Info(str.substring(i,str.length())));				
			}
		
			result = "none";
			int i=0;
			while(!que.isEmpty()) {
				String tem = que.poll().str;
				//System.out.println(tem);
				i++;
				if(i == K)
					result = tem;
					
			}
			
			
			System.out.println("#"+x+" "+result);
		}
		
		
	}
	
	static class Info implements Comparable<Info>{
		
		String str;
		public Info(String str) {
			this.str = str;
		}
		
		@Override
		public int compareTo(Info arg0) {
			// TODO Auto-generated method stub
			return str.compareTo(arg0.str);
		}
		
		
		
		
	}

}
