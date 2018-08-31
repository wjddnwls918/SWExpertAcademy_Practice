import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Pro_1259 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=1; x<=T; x++) {
			int N = Integer.parseInt(in.readLine());
			String tem[] = in.readLine().split(" ");
		
			Info infos[] = new Info[N];
			int used[] = new int[N];
			
			int j=0;
			for(int i=0; i<2*N; i+=2) {
				infos[j] = new Info(Integer.parseInt(tem[i]),Integer.parseInt(tem[i+1]));
				j++;
			}
			
			boolean outflag;
			Deque<Info> deque = new ArrayDeque();
			deque.add(infos[0]);
			used[0] = 1;
			int curLeft = infos[0].left;
			int curRight = infos[0].right;
		
			
			
			while(true) {
				outflag = true;
							
				for(int i=1; i<N; i++) {
					if(used[i] != 1) {
						if(infos[i].right == curLeft) {
							deque.addFirst(infos[i]);
							used[i] = 1;
							curLeft = infos[i].left;
							outflag = false;
							
						}else if(infos[i].left == curRight) {
							deque.addLast(infos[i]);
							curRight = infos[i].right;
							used[i] = 1;
							outflag = false;
							
						}
					}
				}
				
				
				if(outflag)
					break;
				
			}
			
			
			System.out.print("#"+x+" ");
			for(int i=0; i<N; i++) {
				System.out.print(deque.peek().left+" "+deque.poll().right);
				if(i == N-1) {
					System.out.println();
				}else
					System.out.print(" ");				
			}
			
		}
	}

	static class Info{
		
		int left;
		int right;
		public Info(int left, int right) {
			this.left = left;
			this.right =right;
		}		
		
	}
}
