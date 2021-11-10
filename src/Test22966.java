/*
문제
예선 문제를 성실하게 복습한 학생들이라면 예선에 출제된 5문제가 난이도 순서대로 정렬되어 있다는 것을 알아차렸을 것이다.

하지만 본선은 문제 제목에 대해 사전순으로 정렬했기 때문에 난이도 순서대로 정렬되어 있지 않을 수 있다.

문제 제목과 문제의 난이도가 주어지면 가장 쉬운 문제의 제목을 출력하는 프로그램을 작성하자.

문제의 난이도는 자연수로 표현되며, 수가 클수록 어려운 문제다.

입력
첫째 줄에 문제의 개수 $N$이 주어진다.

둘째 줄부터 $N$개의 줄에 문제 제목과 문제 난이도가 공백으로 구분되어 주어진다.

출력
가장 쉬운 문제의 제목을 출력한다.

제한
 $1 \leq N \leq 4$ 
문제 제목은 알파벳 대문자로만 구성되어 있다.
문제 제목은 최대 10글자이며, 모든 문제의 제목은 서로 다르다.
문제의 난이도는 1부터 4까지의 자연수로 표현되며, 모든 문제의 난이도는 서로 다르다.
문제는 문제 제목에 대해 사전순으로 주어진다.
예제 입력 1 
3
ABCDE 4
BCDEF 2
CDEFG 3
예제 출력 1 
BCDEF
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test22966 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int min = 5;
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			int j = Integer.parseInt(st.nextToken());
			
			if (min > j) {
				min = j;
				answer = s;
			}
		}
		
		System.out.println(answer);
	}

}
