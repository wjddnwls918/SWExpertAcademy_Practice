
public class Pro_2027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++ )
		{
			for(int j=0; j<5; j++)
			{
				if(i == j)
					System.out.print("#");
				else
					System.out.print("+");
				
				if( j==4 )
					System.out.println();
			}
		}
	}

}
