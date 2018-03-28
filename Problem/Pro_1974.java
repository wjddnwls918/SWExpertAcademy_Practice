import java.util.Scanner;

public class Pro_1974 {

		static boolean flag;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int map[][];
		int check[];		
		for(int i=1; i<=t; i++)
		{
			map = new int[9][9];
			for(int j=0; j<9; j++)
			{
				for(int k=0; k<9; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			
		
			//칸
			for(int j=0; j<=6; j+=3)
			{
				for(int k=0; k<=6; k+=3)
				{
					//System.out.println("check");
					flag = false;
					check = new int[9];
					for(int l = j; l<j+3; l++)
					{
						for(int m=k; m<k+3; m++)
						{
							if(check[map[l][m] - 1] == 0)
								check[map[l][m]-1] =1;
							else
							{
								flag = true;
								break;
							}
							
						}
						if(flag)
							break;
					}
					
					if (flag)
						break;	
				}
				
				if (flag)
					break;	
			}
										
		
			if(!flag)
			{
				//가로			
				flag = false;			
				for(int j=0; j<9; j++)
				{
					check = new int[9];
					for(int k=0; k<9; k++)
					{
						if(check[map[j][k] - 1] == 0)
							check[map[j][k]-1] =1;
						else
						{
							flag = true;
							break;
						}
					}
					if(flag)
						break;
				}
			}
		
			
			//세로
			
			if(!flag)
			{
				flag = false;			
				for(int j=0; j<9; j++)
				{
					check = new int[9];
					for(int k=0; k<9; k++)
					{
						if(check[map[k][j] - 1] == 0)
							check[map[k][j]-1] =1;
						else
						{
							flag = true;
							break;
						}
					}
					if(flag)
						break;
				}
			}
			
			
			if(flag)
			{
				System.out.println("#"+i+" "+0);
			}
			else
				System.out.println("#"+i+" "+1);
			
			
		}
	}	

}

//먼 d2가 이렇게 ;; 메모리, 실행시간, 코드길이 다 괜찮 
//스도쿠 검증
