/*
문제
2와 e는 발음이 비슷해, 둘을 섞어서 말하면 듣는 사람을 짜증나게 만들 수 있다.

지민이는 이 점을 이용해 은수를 미치게 하고 있다. 은수를 위해 지민이가 말한 문자열 s가 주어질때, 2의 등장 횟수가 더 많은지, e의 등장 횟수가 더 많은지 도와주자.

입력
첫 줄에 문자열 s의 길이가 주어진다.

둘째 줄에 문자열 s가 주어진다. s의 길이는 1 이상 105 이하이며, s는 2와 e로만 이루어져 있다.

출력
2의 등장횟수가 더 많다면 2를 출력하고, e의 등장횟수가 더 많다면 e를 출력한다. 등장횟수가 같다면 "yee"를 출력한다. (큰 따옴표 제외)

예제 입력 1 
12
222eee222eee
예제 출력 1 
yee
예제 입력 2 
3
22e
예제 출력 2 
2
예제 입력 3 
3
e2e
예제 출력 3 
e
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test17094 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int two = 0;
		int e = 0;
        
		for (int i = 0; i < s; i++) {
			if ('2' == input.charAt(i)) {
				two++;
			} else {
				e++;
			}	
		}
		
		if (two > e) {
			System.out.println(2);
		} else if (e > two) {
			System.out.println("e");
		} else {
			System.out.println("yee");
		}
	}

}
