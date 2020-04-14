package com.chap02;

public class Array01 {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();						// 배열 복사
		
		b[3] = 0;
		
		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {		// 1, 2, 3, 4, 5
			System.out.print(" " + a[i]);
		}
		
		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++) {		// 1, 2, 3, 0, 5
			System.out.print(" " + b[i]);
		}
		
		int max = a[0];
		
		for (int i = 1; i < a.length ; i ++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("\n최댓값은 " + max);
		
	}

}
