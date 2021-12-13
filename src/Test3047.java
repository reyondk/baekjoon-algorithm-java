/*
문제
세 수 A, B, C가 주어진다. A는 B보다 작고, B는 C보다 작다.

세 수 A, B, C가 주어졌을 때, 입력에서 주어진 순서대로 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 세 수 A, B, C가 주어진다. 하지만, 순서는 A, B, C가 아닐 수도 있다. 세 수는 100보다 작거나 같은 자연수이다. 둘째 줄에는 A, B, C로 이루어진 세 글자가 주어지며, 이 순서대로 출력하면 된다.

출력
주어진 세 수를 주어진 출력 순서대로 출력하면 된다.

예제 입력 1 
1 5 3
ABC
예제 출력 1 
1 3 5
예제 입력 2 
6 4 2
CAB
예제 출력 2 
6 2 4
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test3047 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = Stream.of(br.readLine().split(" "))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		String order = br.readLine();
		
		for (int i = 0; i < 3; i++) {
			if (order.charAt(i) == 'A') {
				System.out.print(nums[0] + " ");
				
			} else if (order.charAt(i) == 'B') {
				System.out.print(nums[1] + " ");
				
			} else if (order.charAt(i) == 'C') {
				System.out.print(nums[2] + " ");
			}
		}
	}

}
