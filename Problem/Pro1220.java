import java.util.Scanner;

public class Pro1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		int map[][] = new int[100][100];
		
		int cnt;
	
		for(int i=1; i<=10; i++)
		{
			num = in.nextInt();
			cnt =0;
			
			for(int j=0; j<100; j++)
			{
				for(int k=0; k<100; k++)
				{
					map[j][k] = in.nextInt();
				}
			}
			
			
			for(int j=0; j<100; j++)
			{
				for(int k=0; k<100; k++)
				{
                    if(map[k][j]==1){
                        for(int l=k+1; l<100; l++){
                            if(map[l][j]==2){
                                k=l;
                                cnt++;
                                break;
                            }
                             
                        }
                    }
                     
                 }
              } 
			
			System.out.println("#"+i+" "+cnt);
			
			
		}
		
	}

}

//... 이걸 
