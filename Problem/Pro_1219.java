import java.util.Scanner;

public class Pro_1219 {
	
		static int map1[];
		static int map2[];
		static int c[];
		
		static int result = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int cnt;
			
		
		int a,b;
		int pos;
		
		for(int i=0; i<10; i++)
		{
			num = in.nextInt();
			cnt = in.nextInt();
			
			map1 = new int[100];
			map2 = new int[100];
			c = new int[100];	
			
			for(int j=0; j<cnt; j++)
			{
				a = in.nextInt();
				b = in.nextInt();
				
				if(map1[a] != 0)
				{
					map2[a] = b;
				}
				else
				{
					map1[a] = b;
				}
			}
					
			pos = 0;
			
			dfs(pos);
			
			//System.out.println(result);
			if(result == 99)
				result = 1;
			else
				result = 0;
			
			System.out.println("#"+num+" "+result);
		}
	}
	
	public static void dfs(int pos)
	{
		if( map1[pos] == 99 || map2[pos] ==99)
		{
			result = 99;
			return ;
		}
		
		
		if( map1[pos] != 0)
		{
			c[pos] = 1;
			dfs(map1[pos]);
			c[pos] = 0;
		}
		if( map2[pos] != 0)
		{
			c[pos] = 1;
			dfs(map2[pos]);
			c[pos] = 0;
		}
	
	
	}

}


//정답, 메모리, 코드길이, 실행시간 나쁘지않음
