/*
문제
두 양의 정수가 주어졌을 때, 두 수 사이에 있는 정수를 모두 출력하는 프로그램을 작성하시오.

입력
두 정수 A와 B가 주어진다.

출력
첫째 줄에 두 수 사이에 있는 수의 개수를 출력한다.

둘째 줄에는 두 수 사이에 있는 수를 오름차순으로 출력한다.

서브태스크
번호	배점	제한
1	30	
1 ≤ A, B ≤ 1000.

2	70	
1 ≤ A, B ≤ 1015, A와 B의 차이는 최대 100,000.

예제 입력 1 
8 14
예제 출력 1 
5
9 10 11 12 13  
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test10093 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		if (a > b) {
			System.out.println(a - b - 1);

			for (long i = b + 1; i < a; i++) {
				System.out.print(i + " ");
			}

		} else if (b > a) {
			System.out.println(b - a - 1);

			for (long i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.print(0);
		}
	}

}
