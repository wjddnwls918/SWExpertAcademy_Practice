import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_6913 {

		static int N,M;
		
		static int map[][];
		static int firstGrade[];
		static int proCnt[];
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String temp[];
		for(int x=1; x<=T; x++) {
			temp = in.readLine().split(" ");
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			map = new int[N][M];
			firstGrade = new int[N];
			proCnt = new int[N];
			
			int maxScore = -1;
			int firstGrageCnt = 0;
			int maxCnt = -1;
			for(int i=0; i<N; i++) {				
					temp = in.readLine().split(" ");
					for(int j=0; j<M; j++) {
						if(Integer.parseInt(temp[j]) == 1) {
							firstGrade[i] += 1;
							proCnt[i] +=1 ;
						}
							
					}
					
					if(maxScore < firstGrade[i]) {
						maxScore = firstGrade[i];
						firstGrageCnt = 1;
						maxCnt = proCnt[i];
					}else if(maxScore == firstGrade[i]) {
						firstGrageCnt += 1;
					}
			}	
			System.out.println("#"+x+" "+firstGrageCnt+" "+maxCnt);
			
		}
	}

}
