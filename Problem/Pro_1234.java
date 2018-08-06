import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Pro_1234 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int x=1; x<=10; x++) {
			int len;
			String str;
			String temp[];
			temp = in.readLine().split(" ");
			len = Integer.parseInt(temp[0]);
			str = temp[1];
			
			
			
			LinkedList<Character> arr = new LinkedList();
			
			for(int i=0; i<len; i++) {
				arr.add(str.charAt(i));
			}
			
			boolean flag;
			while(true) {
				
				//while문 종료 조건
				flag = true;
				//이전값 저장
				char prev;
				
				//임시 저장 배열
				LinkedList<Character> tem = new LinkedList();
				//짝이 있으면
				boolean inFor=false;
				for(int i=0; i<arr.size(); i++) {
					prev = arr.get(i);
					inFor= false;
					int cnt=0;
						
					if(i+1<=arr.size()-1)
					{
						
						if(prev == arr.get(i+1) )
						{
							cnt++;
							flag = false;
							inFor = true;
						}						
					}
					
					//짝이 아니면 tem리스트에 삽입
					if(!inFor) {						
						tem.add(arr.get(i));	
						
					}else {
						i+=cnt;
					}
				
					
				}				
				
				
				
				
				if(flag)
					break;
				else {
					//tem.add(arr.get(arr.size()-1));
					arr = new LinkedList();
					//새로운 arr 리스트에 tem 리스트 넣기
					for(int i=0; i<tem.size(); i++) {
						arr.add(tem.get(i));
					}
				}
			
				
			}
			
			System.out.print("#"+x+" ");
			for(int i=0; i<arr.size(); i++) {
				System.out.print(arr.get(i));
			}
			System.out.println();
			
			
		}
		
	}

}
