package org.carrot84.study;

public class TargetNumber {
	private static int answer = 0;
	public static int solution(int[] numbers, int target) {
		answer = 0;
		dfs(0, 0, numbers, target);
		return answer;
	}

	private static void dfs(int index, int sum, int[] numbers, int target) {
		if (numbers.length == index) {
			if (sum == target) {
				answer++;
			}
			return;
		}

		dfs(index + 1, sum + numbers[index], numbers, target);
		dfs(index + 1, sum - numbers[index], numbers, target);
	}
}
