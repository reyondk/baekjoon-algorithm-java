/*
문제
덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램을 만드시오.

입력
입력의 각 줄에는 숫자와 +, -, *, /, =중 하나가 교대로 주어진다. 첫 번째 줄은 수이다. 연산자의 우선 순위는 생각하지 않으며, 입력 순서대로 계산을 하고, =가 주어지면, 그때까지의 결과를 출력한다. 주어지는 수는 108 이하의 양의 정수이다. 계산 중 결과는 0 또는 음수가 될 수 있지만, -108 ~ 108 범위를 넘지는 않는다. 또, 나눗셈에서 소수점은 버린다. 따라서, 100/3*3 = 99이다.

피제수가 음수일 때 나눗셈을 하는 경우는 입력으로 주어지지 않는다.

출력
첫째 줄에 계산 결과를 출력한다.

예제 입력 1 
1
+
1
=
예제 출력 1 
2
예제 입력 2 
10
-
21
*
5
=
예제 출력 2 
-55
예제 입력 3 
100
/
3
*
3
=
예제 출력 3 
99
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test5613 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long sum = Long.parseLong(br.readLine());
		
		while (true) {
			String input = br.readLine();
			
			if ("=".contentEquals(input)) {
				System.out.println(sum);
				break;
			}
			 
			long tmp = Long.parseLong(br.readLine());
			
			if ("+".equals(input)) {
				sum += tmp;
				
			} else if ("-".equals(input)) {
				sum -= tmp;
				
			} else if ("*".equals(input)) {
				sum *= tmp;
				
			} else if ("/".equals(input)) {
				sum /= tmp;
			}
		}
	}
	
}