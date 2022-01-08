/*
문제


아무래도 우리 팀 다리우스가 고수인 것 같다. 그의 $K/D/A$를 보고 그가 「진짜」인지 판별해 보자.

 $K+A < D$이거나, $D = 0$이면 그는 「가짜」이고, 그렇지 않으면 「진짜」이다.

입력
 $K/D/A$가 주어진다.

출력
그가 「진짜」이면 gosu, 「가짜」이면 hasu를 출력한다.

제한
 $0 \le K, D, A \le 20$ 

예제 입력 1 
0/5/3
예제 출력 1 
hasu
예제 입력 2 
12/4/5
예제 출력 2 
gosu
예제 입력 3 
0/0/1
예제 출력 3 
hasu
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Test21567 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal a = new BigDecimal(br.readLine());
		BigDecimal b = new BigDecimal(br.readLine());
		BigDecimal c = new BigDecimal(br.readLine());
		String num = a.multiply(b).multiply(c).toString();
		int[] arr = new int[10];
		
		for (int i = 0; i < num.length(); i++) {
			arr[num.charAt(i) - '0']++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}

}
