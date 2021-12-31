/*
문제
알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 모음의 개수를 출력한다.

예제 입력 1 
baekjoon
예제 출력 1 
4
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Test10987 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long cnt = Stream.of(br.readLine().split(""))
			.filter(i -> i.equals("a") || i.equals("e") || i.equals("i") || i.equals("o") || i.equals("u"))
			.count();
		System.out.println(cnt);
	}

}
