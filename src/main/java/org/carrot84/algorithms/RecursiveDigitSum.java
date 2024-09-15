package org.carrot84.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveDigitSum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		String n = firstMultipleInput[0];

		int k = Integer.parseInt(firstMultipleInput[1]);

		int result = Result.superDigit(n, k);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	static class Result {
		public static int superDigit(String n, int k) {
			if (n.length() == 1) {
				return Integer.parseInt(n);
			}

			Long sum = 0L;
			for (char c : n.toCharArray()) {
				sum += Long.parseLong(String.valueOf(c));
			}
			sum = sum * k;
			return superDigit(String.valueOf(sum), 1);
		}
	}
}
