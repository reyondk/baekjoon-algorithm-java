/*
문제
두 개의 정수 입력 a, b를 받아서 a+b를 출력하시오.

C 입출력 예제

#include <stdio.h>
…
scanf(“%d%d”, &a, &b);
printf(“%d\n”, a+b);
C++ 입출력 예제

#include <iostream>
…
cin >> a >> b;
cout << a+b << endl;
JAVA 입출력 예제

import java.util.Scanner;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
System.out.println((a+b));
입력
a b; a와 b는 -100,000과 100,000 사이의 정수이다.

출력
a+b

예제 입력 1 
1 2
예제 출력 1 
3
예제 입력 2 
4 5
예제 출력 2 
9
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test14916 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a + b);
	}
	
}
