/*
문제
두 정수 A와 B가 주어졌을 때, 두 정수 사이에 있는 수의 합을 구하는 프로그램을 작성하시오. 사이에 있는 수들은 A와 B도 포함한다.

입력
첫째 줄에 두 정수 A, B가 주어진다. (-2,147,483,648 ≤ A, B ≤ 2,147,483,647)

출력
첫째 줄에 답을 출력한다. (-2,147,483,648 ≤ 답 ≤ 2,147,483,647)

예제 입력 1 
1 2
예제 출력 1 
3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test2355 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.valueOf(st.nextToken());
		long b = Long.valueOf(st.nextToken());
		
		if (a < b) {
			System.out.println(b * (b + 1) / 2 - (a) * (a - 1) / 2);
		} else {
			System.out.println(a * (a + 1) / 2 - (b) * (b - 1) / 2);
		}
	}

}
