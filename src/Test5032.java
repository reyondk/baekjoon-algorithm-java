/*
문제
준민이는 탄산 음료를 좋아한다. 탄산 음료를 사느라 돈을 다 써버렸기 때문에, 이제 준민이는 가진 돈이 없어 탄산 음료를 사먹을 수 없다.

준민이는 항상 법을 지키며 사는 사람이기 때문에, 아무리 탄산 음료가 먹고 싶어도 훔치지 않는다. 따라서, 법적으로 문제가 없는 방법으로 탄산 음료를 구매할 것이다.

마침 빈 병을 특정 개수만큼 가져가면, 새 병으로 바꾸어주는 이벤트가 진행중이다. 준민이는 길에서 빈 병을 열심히 찾은 뒤, 탄산 음료를 먹으려고 한다.

준민이가 현재 가지고 있는 빈 병의 수와 길에서 발견한 빈 병의 수, 새 병으로 바꾸는데 필요한 빈 병의 수가 주어졌을 때, 준민이가 탄산 음료를 몇 개 먹을 수 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 준민이가 가지고 있는 빈 병의 수 e, 그날 발견한 빈 병의 수 f, 새 병으로 바꾸는데 필요한 빈 병의 개수 c가 주어진다. (e < 1000, f < 1000, 1 < c < 2000) e, f, c는 모두 음이 아닌 정수이다.

출력
첫째 줄에 준민이가 탄산 음료를 몇 개나 먹을 수 있는지를 출력한다.

예제 입력 1 
9 0 3
예제 출력 1 
4
예제 입력 2 
5 5 2
예제 출력 2 
9
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test5032 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int sum = e + f;
		int cnt = 0;
		
		while (sum >= c) {
			int mok = sum / c;
			cnt += mok;
			sum = mok + (sum % c);
		}
		
		System.out.println(cnt);
	}

}