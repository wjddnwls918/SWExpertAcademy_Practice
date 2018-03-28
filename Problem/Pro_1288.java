import java.util.Scanner;

public class Pro_1288 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int map[];
		int n;
		int num;
		int cnt;
		String temp;
		boolean outflag;
		
		for(int i=1; i<=t; i++)
		{
			map = new int[10];
			n = in.nextInt();
			cnt =1;
			outflag = false;
			while (true)
			{
				num = n * cnt;
				
				temp = Integer.toString(num);
				for(int j = 0; j<temp.length(); j++)
				{
					map[Integer.parseInt(temp.charAt(j)+"")] = 1;
				}
				
				for(int j=0; j<10; j++)
				{
					if(map[j] == 0)
					{
						outflag = false;
						break;
					}
					if(j==9 && map[j] ==1)
						outflag = true;
				}
				
				if(outflag)
					break;
				
				
				cnt++;
				
			}
			
			
			
			System.out.println("#"+i+" "+num);
			
		}
		
	}

}
