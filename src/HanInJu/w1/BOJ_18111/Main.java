package HanInJu.w1.BOJ_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static int[][] ground;
	private static int n, m, b, minHeight, maxHeight, minSecond, height;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		ground = new int[n][m];

		minHeight = 987654321;
		maxHeight = -1;
		for(int i = 0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<m; j++) {
				ground[i][j] = Integer.parseInt(st.nextToken());
				minHeight = Math.min(minHeight, ground[i][j]);
				maxHeight = Math.max(maxHeight, ground[i][j]);
			}
		}

		minSecond = 987654321;
		height = -1;
		int second, inventory;
		for(int h = minHeight; h<=maxHeight; h++) {
			second = 0;
			inventory = b;
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<m; j++) {
					if (h-ground[i][j] > 0) {
						second += h - ground[i][j];
						inventory -= h - ground[i][j];
					}
					else if(h-ground[i][j] < 0){
						second += Math.abs(h - ground[i][j]) * 2;
						inventory += Math.abs(h - ground[i][j]);
					}
				}
			}

			if((inventory >= 0) && (minSecond >= second)) {
				minSecond = second;
				height = h;
			}
		}

		System.out.println(minSecond + " " + height);
	}
}
