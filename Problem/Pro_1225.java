import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pro_1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t;
		int temp;
		Queue<Integer> que;
		boolean outflag;
		for(int i = 0; i<10; i++)
		{
			que = new LinkedList();			
						
			t = in.nextInt();
			for(int j=0; j<8; j++)
			{
				temp = in.nextInt();
				que.add(temp);
			}
			
			outflag = false;
			while(true)
			{
				for(int j = 1; j<=5; j++)
				{
					temp = que.poll();
					temp -= j;
					if(temp <= 0)
					{
						que.add(0);
						outflag = true;
						break;
					}
					que.add(temp);
					
				}
				
				if(outflag)
					break;
			}
			
			System.out.print("#"+t+" ");
			for(int j=0; j<8; j++)
			{
				System.out.print(que.poll());
				if(j == 7)
					System.out.println();
				else
					System.out.print(" ");
			}
			
		}
		

	}

}

//정답
