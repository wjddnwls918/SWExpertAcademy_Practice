import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pro_3459 {
	
	
	static PriorityQueue<Info> que;
	static String result;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			long N = Integer.parseInt(in.readLine());
			
			que = new PriorityQueue();
			
			int a,b;
			a = 2;
			b = 3;
			if( a > N && b > N) {
				result = "Bob";
			}else {
								
				que.add(new Info(2,"Bob"));
				que.add(new Info(3,"Bob"));
				
				while(!que.isEmpty()) {
					
					
					
					int temN = que.peek().curn;
					String temStr = que.poll().curWho;
					System.out.println(temN);
					
					if(temN *2 > N && temN*2+1 > N) {
						
						System.out.println("check");
						if(temStr.equals("Alice"))
							result = "Bob";
						else
							result = "Alice";
						
						break;
					}else if(temN*2 +1 > N && temN*2 <= N) {
						
						if(temStr.equals("Alice"))
							que.add(new Info(temN*2,"Bob"));
						else
							que.add(new Info(temN*2,"Alice"));
						
					}else {
						
						if(temStr.equals("Alice")) {							
							que.add(new Info(temN*2+1,"Bob"));
						}else {							
							que.add(new Info(temN*2+1,"Alice"));
						}
						
					}
					
				}
			
			
			}
			
			
			System.out.println("#"+x+" "+result);
		}
		
	}

	static class Info implements Comparable<Info>{
		int curn;
		String curWho;
		public Info(int curn, String curWho) {
			this.curn = curn;
			this.curWho = curWho;			
		}
		@Override
		public int compareTo(Info arg0) {
			// TODO Auto-generated method stub
			return this.curn>arg0.curn?-1:1;
		}
		
		
		
		
	}
}
