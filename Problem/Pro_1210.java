import java.util.Scanner;

public class Pro_1210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num;
		int map[][] = new int[100][100];
		int c [][] ;
		int curx,cury;
		int result=0;
		for(int i = 1; i<=10; i++)
		{
			num = in.nextInt();
			
			for(int j=0; j<100; j++)
			{
				for(int k=0; k<100; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			
			
			for(int j=0; j<100; j++)
			{
				curx = j;
				cury = 0;
				
				result = j;
				
				if(map[cury][curx] == 1)
				{
					c = new int[100][100];
					while(true)
					{
						if(cury == 99)
							break;
						c[cury][curx] = -1;
						
						
						if(curx-1 >= 0 && map[cury][curx-1]==1 && c[cury][curx-1]!=-1)
						{
							curx = curx-1;
							continue;
							
						}
						if(curx+1 < 100 && map[cury][curx+1]==1 && c[cury][curx+1]!=-1)
						{
							curx = curx+1;
							continue;
						}
						if(cury+1 <100 && map[cury+1][curx]==1|| map[cury+1][curx]==2 )
						{
							cury+=1;
						}
						
						
						
					}
				}
				
				/*System.out.println(cury);*/
				if(map[cury][curx] == 2)
				{
					//System.out.println("find");
					break;
				}
			}
			
			
			System.out.println("#"+num+" "+result);
		}
	}

}

//정답 
//코드길이, 실행시간, 메모리 다 평균인듯
//역추적하면 시간더 빠르겠네 
