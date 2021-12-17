/*
문제
가위 바위 보는 두 명이서 하는 게임이다. 보통 미리 정해놓은 수 만큼 게임을 하고, 많은 게임을 이긴 사람이 최종 승자가 된다.

가위 바위 보를 한 횟수와 매번 두 명이 무엇을 냈는지가 주어졌을 때, 최종 승자를 출력하는 프로그램을 작성하시오.

바위는 가위를 이긴다.
가위는 보를 이긴다.
보는 바위를 이긴다.
입력
첫째 줄에는 테스트 케이스의 개수 t(0 < t < 1000)가 주어진다. 각 테스트 케이스의 첫째 줄에는 가위 바위 보를 한 횟수 n(0 < n < 100)이 주어진다. 다음 n개의 줄에는 R, P, S가 공백으로 구분되어 주어진다. R, P, S는 순서대로 바위, 보, 가위이고 첫 번째 문자는 Player 1의 선택, 두 번째 문자는 Player 2의 선택이다.

출력
각 테스트 케이스에 대해서 승자를 출력한다. (Player 1 또는 Player 2) 만약, 비겼을 경우에는 TIE를 출력한다.

예제 입력 1 
3
2
R P
S R
3
P P
R S
S R
1
P R
예제 출력 1 
Player 2
TIE
Player 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4493 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int p1 = 0;
			int p2 = 0;

			for (int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String rps1 = st.nextToken();
				String rps2 = st.nextToken();
				
				if (rps1.equals("R") && rps2.equals("S")
					|| rps1.equals("S") && rps2.equals("P")
					|| rps1.equals("P") && rps2.equals("R")) {
					p1++;
				}
				
				if (rps2.equals("R") && rps1.equals("S")
					|| rps2.equals("S") && rps1.equals("P")
					|| rps2.equals("P") && rps1.equals("R")) {
					p2++;
				}
			}
			
			if (p1 > p2) {
				System.out.println("Player 1");
				
			} else if (p2 > p1) {
				System.out.println("Player 2");
				
			} else {
				System.out.println("TIE");
			}
				
		}
	}

}
