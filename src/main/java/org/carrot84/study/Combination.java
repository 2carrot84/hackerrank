package org.carrot84.study;

import java.util.Arrays;

public class Combination {
	private int n;    // 전체 갯수
	private int r;    // 조합 개수
	private int[] arr;    // n에 해당하는 배열
	private int[] output;                // r개를 뽑은 배열

	public Combination(int n, int r) {
		this.n = n;
		this.r = r;
		arr = new int[n];
		output = new int[r];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
	}

	void combination(int start, int depth, int n, int r) {
		// 조합이 완성된 경우
		if (depth == r) {
			System.out.println(Arrays.toString(output));
			return;
		}

		// start 부터 n까지 반복
		for (int i = start; i < n; i++) {
			output[depth] = arr[i];    // 현재 depth를 인덱스로 사용
			combination(i + 1, depth + 1, n, r);    // i + 1, depth + 1를 전달
		}
	}
}