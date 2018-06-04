import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pro_3124 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		int V,E;
		String temp[];
		int map[][];
		int A,B,C;
		int checkV[];
		int useE[];
		for(int x=1; x<=T; x++)
		{
			temp = in.readLine().split(" ");
			V = Integer.parseInt( temp[0] );
			E = Integer.parseInt( temp[1] );
			
			map = new int[V+1][V+1];
			
	
			int arra[] = new int[E];
			int arrb[] = new int[E];
			int arrc[] = new int[E];
			
			for(int i=0; i<E; i++)
			{
				temp = in.readLine().split(" ");
				A = Integer.parseInt(temp[0]);
				B = Integer.parseInt(temp[1]);
				C = Integer.parseInt(temp[2]);
				
				arra[i] = A;
				arrb[i] = B;
				arrc[i] = C;
			}
			
			//Arrays.sort(info);
			
			int min ;
			int index;
			
			checkV = new int[V];
			useE = new int[E];
			int result=0;
			for(int i=0; i<E; i++)
			{
				min = 987654321;
			
				index=0;
				for(int j=0; j<E; j++)
				{
					//최소값 찾기.
					if(min > arrc[j] && useE[j] != 1)
					{
						min = arrc[j];
						index = j;
						useE[j] = 1;
					}
					
					//System.out.println(info[i].a+" "+info[i].b+" "+info[i].dis);
				}
				
				//System.out.println(min);
				
				if( checkV[arra[index]-1] == 1 && checkV[arrb[index]-1] == 1)
				{
					continue;
				}
				else if( checkV[arra[index]-1]==1 )
				{
					checkV[arrb[index]-1] = 1;
					result += arrc[index];
				}
				else if( checkV[arrb[index]-1]==1)
				{
					checkV[arra[index]-1] = 1;
					result += arrc[index];
				}
				else
				{
					checkV[arra[index]-1] = 1;
					checkV[arrb[index]-1] = 1;
					result += arrc[index];
				}
			
			}
			
			System.out.println("#"+x+" "+result);
		}
		
		
	}
	



}

//못품 메모리 초과남 ...
