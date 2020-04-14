package com.chap02;

public class Array03 {
	
	public static void main(String[] args) {
		int counter = 0;				//나눗셈의 횟수
		int primeCount = 0;				//소수의 개수
		int[] prime = new int[500];		//소수를 저장하는 배열
		
		prime[primeCount++] = 2;		//2는 소수
		
		for (int n = 3; n <= 1000; n += 2) {		// 짝수는 소수가 아니므로 홀수만 계산 (3, 5, 7, ...)
			int i;
			
			for (i = 1; i < primeCount ; i++) {		// 
				counter++;
				if (n % prime[i] == 0) {
					break;
				}
			}
			
			if (primeCount == i) {
				prime[primeCount++] = n;
			}
			
		}
		
		for (int i = 0; i < primeCount ; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
