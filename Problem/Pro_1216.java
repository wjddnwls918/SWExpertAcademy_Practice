import java.util.Scanner;

public class Pro_1216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String map[] = new String[100];
		int left,right;
		boolean cntflag;
		boolean outflag;
		int longestlen;
		int len;
		for(int i = 1; i<=10; i++)
		{			
			int num = in.nextInt();
			
			longestlen=1;
			
			for(int j=0; j<100; j++)
			{
				map[j] = in.next();
			}
			
			for(len = 2; len<=100; len++)
			{
			
			outflag = false;
				
			//가로
			for(int j=0; j<100; j++)
			{
				for(int k=0; k<100; k++)
				{
					
					
					if(k+len-1 >= 100)
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
						{
							longestlen = len;
							outflag = true;
							break;
						}
					}
				}
				if(outflag)
					break;
			}
			//System.out.println(cnt);
			
			if(outflag)
				continue;
			
			//세로
			for(int j=0; j<100; j++)
			{
				for(int k=0; k<100; k++)
				{					
					if(k+len-1 >= 100)
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
						{
							longestlen = len;
							outflag = true;
							break;
						}
					}
				}
				if(outflag)
					break;
				
			}
			
			}
			
			System.out.println("#"+num+" "+longestlen);
			
		}
	}

}


// 나쁘지않은데 ?? 
//flag 가지치기