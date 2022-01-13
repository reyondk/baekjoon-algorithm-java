/*
문제
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5
예제 출력 1
*****
****
***
**
*
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2440 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}

			System.out.println();
		}
	}

}
