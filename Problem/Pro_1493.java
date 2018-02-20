import java.util.Scanner;

public class Pro_1493 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int map[][] = new int[1001][1001];
		
		
		int cnt = 2;
		map[1][1] = 1;
		int idxx=0;
		int idxy;
		for(int i =2; i<=1000; i++)
		{
			idxx = 1;
			idxy = i;
			
			while(idxy >= 1)
			{
				//System.out.println("check");
				map[idxy][idxx] = cnt;
				idxy-=1;
				idxx+=1;
				cnt++;
			}
			
		}
		/*
		for(int i=0; i<150; i++)
		{
			for(int k=0; k<150; k++)
			{
				System.out.print(map[i][k]+" ");
			}
			System.out.println();
		}*/
		
		int p,q;
		boolean flag;
		for(int i=1; i<=t; i++)
		{
			p = in.nextInt();
			q = in.nextInt();
			
			int px=0,py=0;
			int qx=0,qy=0;
			
			flag = false;
			
			for(int j=1; j<=1000; j++)
			{
				for(int k=1; k<=1000; k++)
				{
					
					if(map[j][k] == p)
					{
						px = k;
						py = j;
					}
					if(map[j][k] == q)
					{
						qx = k;
						qy = j;
					}
					if(px != 0 && py != 0 && qx !=0 && qy != 0)
					{
						flag = true;
						break;
					}
				}				
				if(flag)
					break;
			}
			
			System.out.println("#"+i+" "+map[py+qy][px+qx]);
		}
	}

}

//런타임 에러
//시간초과 ...
//정답 .... 반복문 가지치기만으로도 ...통과
