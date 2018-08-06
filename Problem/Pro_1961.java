import java.util.Scanner;

public class Pro_1961 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		int n=0;
		int map[][];
		for(int x=1; x<=t; x++)
		{
			n = in.nextInt();
			
			map = new int[n][n];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					map[i][j] = in.nextInt();
				}
			}
			
		}
		
		
	}

}
