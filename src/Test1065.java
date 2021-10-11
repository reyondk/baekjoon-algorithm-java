/*
한수
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	86612	45883	38643	52.941%
문제
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.

예제 입력 1 
110
예제 출력 1 
99
예제 입력 2 
1
예제 출력 2 
1
예제 입력 3 
210
예제 출력 3 
105
예제 입력 4 
1000
예제 출력 4 
144
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1065 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if (n < 100) {
			System.out.println(n);
			return;
		}
		
		int cnt = 99;
		
		for (int i = 100; i <= n; i++) {
			int hun = i / 100;
			int ten = (i / 10) % 10;
			int one = i % 10;
			
			if ((hun - ten) == (ten - one)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
