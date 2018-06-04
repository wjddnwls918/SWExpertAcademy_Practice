/*import java.util.Scanner;

public class Pro_1952 {

		static int cnt;
		static int price[];
		static int month[];
		static int com[];
		static int indexlist[];
		static int mincost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
	
		for(int i=1; i<=t; i++)
		{
			price = new int[4];
			month = new int[12];
			for(int j=0; j<4; j++)
				price[j] = in.nextInt();
			
			cnt = 0;
			for(int j=0; j<12; j++)
			{
				month[j] = in.nextInt();
				if(month[j] != 0)
					cnt++;
			}
			
			//System.out.println(cnt);
			indexlist = new int[cnt];
			int k=0;
			for(int j=0; j<12; j++)
			{
				if(month[j] != 0)
				{
					indexlist[k] = j;
					//System.out.print(j+" ");
					k++;
				}
			}
			
			
			com = new int[cnt];
			mincost = 987654321;
			
			//1일 , 1달 , 3달
			for(int j=1; j<=3; j++)
			{
				dfs(j,0);
			}
			
			//1년
			if(mincost > price[3])
				mincost = price[3];
			
			System.out.println("#"+i+" "+mincost);
		}
		
	}
	
	public static void dfs(int num,int depth)
	{
		com[depth] = num; 
		int tempcost;
		
		if(depth == cnt-1)
		{
			for(int i=0; i<cnt; i++)
			{
				System.out.print(com[i]);
				if(i == cnt-1)
					System.out.println();
				else
					System.out.print(" ");
			}
			
			tempcost = 0;
						
			for(int i=0; i<cnt; i++)
			{
				if(com[i]==1)
				{
					tempcost += (month[indexlist[i]] * price[0]);
				}
				else if(com[i] == 2)
				{
					tempcost += price[1];
				}
				else if (com[i] == 3)
				{
					for(int j=i; j<i+3; j++)
					{					
						if(j < cnt && month[indexlist[j]]!=0 && com[j] == 3)
						{
							continue;
						}
						else
						{
							tempcost += price[2];
							
							break;
						}						
					}
				}
			}
			System.out.println(tempcost);
			if( tempcost < mincost)
				mincost = tempcost;
			
		}
		
		else {
			for(int i=1; i<=3; i++)
			{
				dfs(i,depth+1);			
			}
				
		}
		com[depth] = 0;
	}
	
	

}
*/


import java.util.Scanner;
 
public class Pro_1952 {
    static int n=0;
    static int price[]=new int[4];
    static int month[]=new int[12];
    static int cost=Integer.MAX_VALUE;
    public static void dfs(int m,int c)
    {
        if(m>=12)
        {
            cost=Math.min(cost, c);
            return;
        }
         
        dfs(m+1,c+month[m]*price[0]);//1일치
        dfs(m+1,c+price[1]);//1달
        dfs(m+3,c+price[2]);//3달
        dfs(m+12,c+price[3]);//1년
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int tc=scan.nextInt();
        for(int num=1;num<=tc;num++)
        {
            for(int i=0;i<4;i++)
                price[i]=scan.nextInt();
            for(int i=0;i<12;i++)
                month[i]=scan.nextInt();
             
            dfs(0,0);
            System.out.println("#"+num+" "+cost);
            cost=Integer.MAX_VALUE;
        }
    }
 
}