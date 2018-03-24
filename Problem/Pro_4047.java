import java.util.Scanner;

public class Pro_4047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String temp;
		String add;
		
		int tempnum;
		int card[][];
		int cnt[];
		
		boolean resultFlag;
		
		for(int i =1; i<=t; i++)
		{
			temp = in.next();
			
			card = new int[5][14];
			cnt = new int[5];
			
			//System.out.println(temp.substring(0,2));
			
			tempnum = 0;
			resultFlag = true;
			
			for(int j =0; j<temp.length(); j++)
			{
				//System.out.println(j);
				if(temp.charAt(j) == 'S')
				{
					add = temp.substring(j+1,j+3);
					tempnum = Integer.parseInt(add);
					
					if(card[1][tempnum] == 1)
					{
						resultFlag = false;
						break;						
					}
					else
						card[1][tempnum] = 1;
				}
				else if(temp.charAt(j) == 'D')
				{
					add = temp.substring(j+1,j+3);
					tempnum = Integer.parseInt(add);
					
					
					if(card[2][tempnum] == 1)
					{
						resultFlag = false;
						break;						
					}
					else
						card[2][tempnum] = 1;
				}
				else if(temp.charAt(j) == 'H')
				{
					add = temp.substring(j+1,j+3);
					tempnum = Integer.parseInt(add);
					
					if(card[3][tempnum] == 1)
					{
						resultFlag = false;
						break;						
					}
					
					else
						card[3][tempnum] = 1;
				}
				else if(temp.charAt(j) == 'C')
				{
					add = temp.substring(j+1,j+3);
					tempnum = Integer.parseInt(add);
					
					if(card[4][tempnum] == 1)
					{
						resultFlag = false;
						break;						
					}
					else
						card[4][tempnum] = 1;
				}
				
				j = j+2;				
			}
			
			for(int j = 1; j<=13; j++)
			{
				if(card[1][j] == 0)
					cnt[1] ++;
				if(card[2][j] == 0)
					cnt[2] ++;
				if(card[3][j] == 0)
					cnt[3] ++;
				if(card[4][j] == 0)
					cnt[4] ++;
			}
			
			if(!resultFlag)
			{
				System.out.println("#"+i+" ERROR");
			}
			
			else {
			
				System.out.print("#"+i + " ");
				
				for(int j =1; j<=4; j++)
				{
					System.out.print(cnt[j]);
					
					if(j == 4)
						System.out.println();
					else
						System.out.print(" ");
				}
			}
			
		}
	}

}


//정답인데 코드길이랑 실행시간 쬐에금 길다