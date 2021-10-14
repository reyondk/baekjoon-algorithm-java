/*
그룹 단어 체커
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
2 초	128 MB	66841	34369	29017	52.314%
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
둘째 줄부터 N개의 줄에 단어가 들어온다.
단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력 1 
3
happy
new
year
예제 출력 1 
3
예제 입력 2 
4
aba
abab
abcabc
a
예제 출력 2 
1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test1316 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
        
		for (int i = 0; i < n; i++) {
			boolean ans = true;
			String[] inputs = br.readLine().split("");
			List<String> tmp = new ArrayList<>();
			
			for (int j = 0; j < inputs.length; j++) {
				if (j == 0) {
					tmp.add(inputs[j]);
					
				} else if (!tmp.contains(inputs[j])) {
					tmp.add(inputs[j]);
					
				} else if (!inputs[j].equals(tmp.get(tmp.size() - 1))) {
					ans = false;
					break;
				}
			}
			
			if (ans) {
				cnt++;	
			}
		}
		
		System.out.println(cnt);		
	}

}
