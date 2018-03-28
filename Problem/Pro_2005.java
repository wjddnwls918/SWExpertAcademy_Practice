import java.util.Scanner;

public class Pro_2005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in );
		int t = in.nextInt();
		int pascal[][];
		for(int i=1; i<=t; i++)
		{
			int n = in.nextInt();
			
			pascal = new int[n][];
			
			for(int j=0; j<n; j++)
			{
				pascal[j] = new int[j+1];
			}
			
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<pascal[j].length; k++)
				{
					if(j==k || k== 0)
						pascal[j][k] = 1;
					else
					{
						pascal[j][k] = pascal[j-1][k-1] + pascal[j-1][k];
					}
				}
			}
			
			
			System.out.println("#"+i);
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<pascal[j].length; k++)
				{
					System.out.print(pascal[j][k]);
					if(k==pascal[j].length-1)
						System.out.println();
					else
						System.out.print(" ");
				}
			}
		}
		
	}

}

//정답 , 코드길이 조금김 D2
