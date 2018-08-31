import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pro_1248 {
	
		static int N,V,E,V1,V2;
		static int map[][];
		
		static ArrayList<Integer> v1List;		
		
		static int result;
		static int cnt;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=10; x++) {
			temp = in.readLine().split(" ");
			V = Integer.parseInt(temp[0]);
			E = Integer.parseInt(temp[1]);
			V1 = Integer.parseInt(temp[2]);
			V2 = Integer.parseInt(temp[3]);
			
			map = new int[V+1][V+1];
			
			temp = in.readLine().split(" ");
			for(int i=0; i<2*E-1; i+=2) {
				int parent = Integer.parseInt(temp[i]);
				int child = Integer.parseInt(temp[i+1]);
				
				map[parent][child] = 1;
			}
	
			v1List = new ArrayList();		
			result = 0;			
			
			findParent(V1);	
			findParent(V2);		
			
			cnt = 0;
			
			calTotal(result);		
			
			System.out.println("#"+x+" "+result+" "+cnt);
		}
		
	}
	
	public static void findParent(int idx) {
		
		if(result != 0)
			return;
		
		
		if(v1List.contains(idx) && result == 0 ) {
			result = idx;
			return;
		}
			v1List.add(idx);
		
		for(int i=1; i<=V; i++) {
			
			if(map[i][idx] == 1) {
				
				
				findParent(i);
			}
			
		}
		
	}
	
	public static void calTotal(int idx) {
		
		cnt++;
		for(int i=1; i<=V; i++) {
			if(map[idx][i] == 1) {
				calTotal(i);
			}
		}
		
	}

	
	
}


//정답은 맞는데 메모리 초과

