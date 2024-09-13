package org.carrot84.study;

import java.util.Arrays;

public class Permutation {
	private int n;    // 전체 갯수
	private int r;    // 조합 개수
	private int[] arr;    // n에 해당하는 배열
	private int[] output;                // r개를 뽑은 배열
	private boolean[] visited;

	public Permutation(int n, int r) {
		this.n = n;
		this.r = r;
		arr = new int[n];
		output = new int[r];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
	}

	public void permutation(int depth, int n, int r) {
		if (depth == r) {
			System.out.println(Arrays.toString(output));
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(depth + 1, n, r);
				visited[i] = false;
			}
		}
	}
}