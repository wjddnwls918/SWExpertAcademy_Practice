import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pro_7103 {

	static int N;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		for (int x = 1; x <= T; x++) {
			N = Integer.parseInt(in.readLine());

			int cnt = 0;

			int len = (int) Math.sqrt(N);

			for (int i = 1; i <= len; i++) {
				if (i * i == N) {
					cnt++;
					continue;
				}
				for (int j = i; j <= len; j++) {
					if (i * i + j * j == N) {
						cnt++;
						break;
					} else if (i * i + j * j > N)
						break;

					for (int k = j; k <= len; k++) {
						if (i * i + j * j + k * k == N) {
							cnt++;
							break;
						} else if (i * i + j * j + k * k > N)
							break;

						for (int l = k; l <= len; l++) {
							if (i * i + j * j + k * k + l * l == N) {
								cnt++;
								break;
							} else if (i * i + j * j + k * k + l * l > N)
								break;
						}
					}
				}
			}

			System.out.println("#" + x + " " + cnt);

		}
	}

}

/*

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Solution {
    public static int[] powerArr = new int[182];
    public static int[] number = new int[32768];
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tc = Integer.parseInt(br.readLine().trim());
        init();
        for(int t=1;t<=tc;t++) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println("#"+t+" "+number[n]);
        }
    }
    public static void init() {
        for(int i=1;i<=181;i++) {
            powerArr[i] = i*i;
        }
        for(int a=1;a<=181;a++) {
            if(powerArr[a] <= 32767)
                number[powerArr[a]]++;
            for(int b=a;b<=181;b++) {
                if(powerArr[a]+powerArr[b] <= 32767)
                    number[powerArr[a]+powerArr[b]]++;
                for(int c=b;c<=181;c++) {
                    if(powerArr[a]+powerArr[b]+powerArr[c] <= 32767)
                        number[powerArr[a]+powerArr[b]+powerArr[c]]++;
                    for(int d=c;d<=181;d++) {
                        if(powerArr[a]+powerArr[b]+powerArr[c]+powerArr[d] <= 32767)
                            number[powerArr[a]+powerArr[b]+powerArr[c]+powerArr[d]]++;
                    }
                }
            }
        }
    }
}*/

//다른 사람 코드, 메모리, 실행시간 훨씬 효율적.
// 테스트케이스가 여러개라서 매번 계산하는것보다는
// dp 메모이제이션처럼 저장해뒀다 사용만 해주면 됨
// 라그랑주의 네 제곱수 정리