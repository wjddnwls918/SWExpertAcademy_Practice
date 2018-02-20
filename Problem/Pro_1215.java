import java.util.Scanner;

public class Pro_1215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String map[] = new String[8];
		int left,right;
		boolean cntflag;
		int cnt;
		for(int i = 1; i<=10; i++)
		{
			int len = in.nextInt();
			
			cnt=0;
			
			for(int j=0; j<8; j++)
			{
				map[j] = in.next();
			}
			
			//가로
			for(int j=0; j<8; j++)
			{
				for(int k=0; k<8; k++)
				{
					
					
					if(k+len-1 >= 8)
						break;
					else
					{
						left = k;
						right = k+len-1;
						
						cntflag = true;
						while(left < right)
						{
							if(map[j].charAt(left) == map[j].charAt(right))
							{
								left++;
								right--;
							}
							else
							{
								cntflag = false;
								break;
							}
						}
						
						if(cntflag == true)
							cnt++;
							
						
					}
				}
			}
			//System.out.println(cnt);
			
			//세로
			for(int j=0; j<8; j++)
			{
				for(int k=0; k<8; k++)
				{					
					if(k+len-1 >= 8)
						break;
					else
					{
						left = k;
						right = k+len-1;
						
						cntflag = true;
						while(left < right)
						{
							if(map[left].charAt(j) == map[right].charAt(j))
							{
								left++;
								right--;
							}
							else
							{
								cntflag = false;
								break;
							}
						}
						
						if(cntflag == true)
							cnt++;
							
						
					}
				}
			}
			
			
			System.out.println("#"+i+" "+cnt);
			
		}
	}

}


// 다 평균이상인듯