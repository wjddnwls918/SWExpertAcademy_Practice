import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_1240 {

		static int N,M;
		static String input[];
		
		static String stringToNum[] = { "3211",
										"2221",
										"2122",
										"1411",
										"1132",
										"1231",
										"1114",
										"1312",
										"1213",
										"3112"};
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
			
		
		for(int x= 1; x<=T; x++) {
		
		String tem[] = in.readLine().split(" ");
		N = Integer.parseInt(tem[0]);
		M = Integer.parseInt(tem[1]);	
			
		input = new String[N];
		
		int rememX=0,rememY=0;
		
		for(int i=0; i<N; i++) {
			input[i] = in.readLine();
			for(int j=0; j<M; j++) {
								
				if(rememY == 0 && input[i].charAt(j) == '1') {
					rememX = j;
					rememY = i;
				}
				
			}
		}
		
		String cmpString[] = new String[3];
		for(int i=0; i<3; i++) {
			cmpString[i] = new String();
		}
		int result[] = new int[3];
		
		for(int i=1; i<=3; i++) {
			
			if(rememX - i >= 0 && rememX - i + 56 < M) {
				
				cmpString[i-1] = input[rememY].substring(rememX-i, rememX-i + 56);
				
			}else {
				cmpString[i-1] = "";
			}
			
		}
		//System.out.println("rememY : "+rememY+" rememX : "+ rememX);
		
		/*for(int i=0; i<3; i++) {
			System.out.println(cmpString[i]);
		}*/
		
		int max = 0;
		for(int i=0; i<3; i++) {
			int temp = strCheck(cmpString[i]);
			if(temp != -1 && max < temp) {
				max = temp;
			}
		}
		
		
		System.out.println("#"+x+" " + max);
		}
		
	}
	
	public static int strCheck(String str) {
		
		String temp;
		int pnt = 0;
		
		int num[] = new int[8];
		
		for(int i=0; i<8; i++) {
			num[i] = -1;
		}
		
		//8자리 수 입력
		for(int i=0; i<8; i++) {
			
			temp = str.substring(pnt, pnt+7);
			pnt += 7;
			
			num[i] = cntOfString(temp);
		}
		
		/*for(int i=0; i<8; i++) {
			System.out.print(num[i]);
		}
		System.out.println();*/
		
		boolean isOk = true;
		
		for(int i=0; i<8; i++) {
			if(num[i] == -1) {
				isOk = false;
				break;
			}
		}
		
		if(isOk) {
		
		
			//검증 
			int sum = 0;
			sum = (num[0]+num[2]+num[4]+num[6])*3 + num[1]+num[3]+num[5] +num[7];
			int result = 0;
			for(int i=0; i<8; i++) {
				result += num[i];
			}
			if(sum % 10 == 0) {
				return result;
			}else {
				return 0;
			}
		
		}
		
		return -1;
	}
	
	//무슨 수인지 반환
	public static int cntOfString(String temp) {
		
		char cur = temp.charAt(0);
		int cnt = 1;
		String transStr = "";
		int result=-1;
		//카운트 한것 
		for(int i=1; i<temp.length(); i++) {
			
			if(cur != temp.charAt(i)) {
				transStr += Integer.toString(cnt);
				cur = temp.charAt(i); 
				cnt=1;
			}else {
				cnt++;
			}
			
			
		}
		transStr += cnt;
		//System.out.println(transStr);
		
		for(int i=0; i<10; i++) {
			if(transStr.equals(stringToNum[i])) {
				result = i;
				
			}
		}
		
		return result;		
	}
	

}
