package org.carrot84.study;

public class GameMapShortestDistance {

	static boolean[][] visited;
	static int answer = 0;

	public static int solution(int[][] maps) {
		answer = 0;
		visited = new boolean[maps.length][maps[0].length];
		dfs(0, 0, 1, maps);
		return answer > 0 ? answer : -1;
	}

	private static void dfs(int x, int y, int sum, int[][] maps) {
		if (x == maps.length - 1 && y == maps[x].length - 1) {
			if (sum < answer || answer == 0) {
				answer = sum;
			}
			return;
		}

		if (x < 0 || y < 0 || x >= maps.length || y >= maps[x].length || visited[x][y]) {
			return;
		}

		visited[x][y] = true;

		if (maps[x][y] == 1) {
			dfs(x - 1, y, 1 + sum, maps);
			dfs(x + 1, y, 1 + sum, maps);
			dfs(x, y - 1, 1 + sum, maps);
			dfs(x, y + 1, 1 + sum, maps);
		}

		visited[x][y] = false;
	}

}


