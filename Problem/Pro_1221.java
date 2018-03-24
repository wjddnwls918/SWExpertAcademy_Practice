import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Pro_1221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		String tem;
		int num[];
		int len;
		
		HashMap<String, Integer> map = new HashMap();
		map.put("ZRO", 0);
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THR", 3);
		map.put("FOR", 4);
		map.put("FIV", 5);
		map.put("SIX", 6);
		map.put("SVN", 7);
		map.put("EGT", 8);
		map.put("NIN", 9);
		
		String trans[] = {"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
		
		for(int i=1; i<=10; i++)
		{
			tem = in.next();
			
			len = in.nextInt();
			
			num = new int[len];
			
			for(int j=0; j<len; j++)
			{
				tem = in.next();
				num[j] = map.get(tem);
			}
			
			Arrays.sort(num);
			
			
			System.out.println("#"+i+" ");
			for(int j=0; j<len; j++)
			{
				System.out.print(trans[num[j]]);
				if(j == len-1)
					System.out.println();
				else
					System.out.print(" ");
			}
				
		}
		
	}

}

//;;; 이건좀 큰데 ??
// 메모리, 실행시간 조금 큰듯 
//정답률이 50프로네 
