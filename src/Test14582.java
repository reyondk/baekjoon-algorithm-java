/*
입력
첫 번째 줄에는 9개의 정수가 주어지는데, 오늘 경기에서 울림 제미니스가 1회 초, 2회 초, ..., 9회 초에 낸 득점이 주어진다.

두 번째 줄에도 9개의 정수가 주어지는데, 스타트링크 걸리버스가 1회 말, 2회 말, ..., 9회 말에 낸 득점이 주어진다.

한 팀이 한 회에 낸 득점은 모두 0 이상 20 이하이며, 스타트링크 걸리버스의 총 득점이 울림 제미니스의 총 득점보다 많다.

경기는 1회 초->1회 말->2회 초->...->9회 초->9회 말 순서로 진행된다.

출력
만약 울림 제미니스가 역전패를 했다면 'Yes'를 출력한다.

그렇지 않으면 'No'를 출력한다.

예제 입력 1 
1 0 0 0 0 0 2 2 1
0 0 3 0 0 0 0 1 4
예제 출력 1 
Yes
예제 입력 2 
0 0 0 0 0 0 0 1 0
1 0 0 0 0 0 0 4 0
예제 출력 2 
No
힌트
첫 번째 예제에서 울림 제미니스가 이기고 있던 순간은 (울림이 1회 초에 1점을 낸 순간) ~ (스타트링크가 3회 말에 1점을 낸 순간)과 (울림이 8회 초에 1점을 낸 순간) ~ (스타트링크가 9회 말에 2점을 낸 순간)이다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test14582 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();		
		int[] b = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int sumA = 0;
		int sumB = 0;
		
		for (int i = 0; i < 9; i++) {
			sumA += a[i];
			
			if (sumA > sumB) {
				System.out.println("Yes");
				return;
			}

			sumB += b[i];
		}
		
		System.out.println("No");
	}

}
