import java.util.Arrays;
import java.util.Scanner;

public class Pro_1946 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n;
		String ch;
		int cnt;
		int totallen;
		String map[][];
		int curPnt;
		for(int i=1; i<=t; i++)
		{
			n = in.nextInt();
			
			map = new String[n][];
			
			totallen = 0;
			
			
			
			for(int j=0; j<n; j++)
			{
				ch = in.next();
				cnt = in.nextInt();
				
				map[j] = new String[cnt];
				
				for(int k=0; k<cnt; k++)
					map[j][k] = ch;
				
				totallen +=cnt;
			}
			
	/*		for(int j=0; j<map.length; j++)
			{
				for(int k =0; k<map[j].length; k++)
				{
					System.out.print(map[j][k]);
				}
				System.out.println();
			}*/
			
			System.out.println("#"+i+" ");
			curPnt = -1;
			for(int j=0; j<map.length; j++)
			{
				for(int k =0; k<map[j].length; k++)
				{
					
					curPnt++;
					if(curPnt!=0 &&curPnt%10 == 0)
					{
						System.out.println();
					}
					System.out.print(map[j][k]);
				}
			}
			
			//이것때문에 무슨 ;; 출력 문제 
			//테스트케이스가 너무 적었어
			System.out.println();
			
		}
		
	}

}
