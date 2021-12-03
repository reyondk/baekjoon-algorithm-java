/*
문제
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

입력
첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.

출력
첫째 줄에 C언어 평점을 출력한다.

예제 입력 1 
A0
예제 출력 1 
4.0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2754 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		double answer = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			
			if (i == 0) {
				if ('A' == c) {
					answer += 4;
					
				} else if ('B' == c) {
					answer += 3;
					
				} else if ('C' == c) {
					answer += 2;
					
				} else if ('D' == c) {
					answer += 1;
					
				} else {
					break;
				}
				
			} else {
				if ('+' == c) {
					answer += 0.3;
					
				} else if ('-' == c) {
					answer -= 0.3;
				}
			}
		}
		
		System.out.println(String.format("%.1f", answer));
	}

}
