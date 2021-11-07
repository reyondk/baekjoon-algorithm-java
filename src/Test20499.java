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

public class Test20499 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double a = n - (n * 0.22);
		double b = (n * 0.8) + ((n * 0.2) - ((n * 0.2) * 0.22));
		System.out.println((int) a + " " + (int) b);
	}

}
