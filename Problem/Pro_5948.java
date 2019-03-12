import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pro_5948 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		int num[];
		for(int x=1; x<=T; x++) {
			
			num = new int[7];
			
			String tem[];
			tem = in.readLine().split(" ");
			for(int i=0; i<7; i++) {
				num[i] = Integer.parseInt(tem[i]);
			}
			
			
			ArrayList<Integer> arr = new ArrayList<>();
			
			int sum;
			for(int i=0; i<num.length-2; i++) {
				for(int j=i+1; j<num.length-1; j++) {
					for(int k=j+1; k<num.length; k++) {
						sum =0;
						sum += num[i];
						sum += num[j];
						sum += num[k];
						
						if(!arr.contains(sum))
							arr.add(sum);
					}
				}
			}
			
			Collections.sort(arr);
			
			/*for(int i=0; i<arr.size(); i++)
			{
				System.out.println(arr.get(i));
			}*/
			System.out.println("#"+x+" "+arr.get(arr.size()-5));
			
			
		}
		
	}

}
