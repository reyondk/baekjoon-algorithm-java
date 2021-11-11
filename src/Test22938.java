/*
문제
백발백준은 무슨 과녁이던 백발백중하여 올림픽 금메달보다 따기 어렵다는 대한민국 양궁 국가대표 타이틀을 가지고 있다. 이런 백발백준이 현재 연마하는 스킬이 있는데...

바로 두 과녁을 한번에 맞추는 스킬이다. 이를 연습하기 위해 두 과녁이 겹치는 부분이 있어 한번에 맞추기가 가능한지 알아보고 싶어졌다.

여러분은 백발백준이 연습하는 과정을 도와주기 위해 원 모양으로 생긴 두 과녁이 겹치는 부분이 존재하는지 확인하는 프로그램을 작성해보자.

입력
첫번째 줄에는 첫번째 과녁의 중심 X1, Y1와 반지름 R1이 주어진다.

두번째 줄에는 두번째 과녁의 중심 X2, Y2와 반지름 R2가 주어진다.

X1, X2, Y1, Y2는 모두 정수이며, R1, R2는 모두 자연수이다.

-109 ≤ X1, X2, Y1, Y2 ≤ 109, 0 < R1, R2 ≤ 109

출력
두 과녁이 겹치면 YES, 아니면 NO를 출력한다.

단, 두 과녁이 한 점에서 만나는 경우는 겹치지 않는 것으로 생각한다.

예제 입력 1 
0 0 1
1 1 2
예제 출력 1 
YES
예제 입력 2 
0 0 1
10 10 1
예제 출력 2 
NO
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test22938 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] nums = Stream.of(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		long[] nums2 = Stream.of(br.readLine().split(" ")).mapToLong(Long::valueOf).toArray();
		long x1 = nums[0];
		long y1 = nums[1];
		long r1 = nums[2];
		long x2 = nums2[0];
		long y2 = nums2[1];
		long r2 = nums2[2];

	    if ((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) < (r1 + r2) * (r1 + r2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}