/*
문제
상근이는 3003번에서 동혁이가 발견한 체스판을 톱으로 자르려고 한다.

상근이는 체스판을 최대 N번 자를 수 있으며, 변에 평행하게만 자를 수 있다. 또, 자를 때는 체스판의 그 변의 한쪽 끝에서 다른쪽 끝까지 잘라야 한다. 자른 후에는 조각을 이동할 수 없다.

이때, 최대 몇 조각을 낼 수 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100)

출력
첫째 줄에 상근이가 얻을 수 있는 조각의 최댓값을 출력한다.

예제 입력 1 
1
예제 출력 1 
2
예제 입력 2 
3
예제 출력 2 
6
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test3004 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int piece = 1;
        int tmp = 1;
        
        for (int i = 0; i < n; i++) {
            if (i%2 != 0) {
            	tmp += 1;
            }
            
            piece += tmp;
		}
        
        System.out.println(piece);
	}

}

