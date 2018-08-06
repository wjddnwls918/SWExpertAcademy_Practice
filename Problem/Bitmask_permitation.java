
public class Bitmask_permitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i, j;

		 	
		    char arr[] = { 'a', 'b', 'c', 'd' };

		    int n = 4;


		    for (i = 0; i < (1 << (n)); i++){

		        for (j = 0; j < n; j++){

		            if ( (i & (1 << j)) == 1<<j ){

		                System.out.print(arr[j]);
		                
		            }

		        }

		       System.out.println();

		    }
		
	}

}
