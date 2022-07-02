package HanInJu.w2.BOJ_2876;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2876 {
	// 책상 N개 중에서 2개를 고르는데, 학생 번호의 연속이 가장 많아야 함!
	// 중복X, 순서 중요X - 조합!
	private static int N, max = -1, maxGrade = 0;
	private static int[][] grades;
	private static int[] tables;
	private static int[] answer;

	private static void recur(int cur, int cnt) {
		if(cnt == 2) {
			answer = countStudent(); // 여기도 잘못 구현했다.
			if(max < answer[0]) {
				max = answer[0];
				maxGrade = answer[1];
			}
			else if(max == answer[0] && maxGrade > answer[1]) {
				maxGrade = answer[1];
			}

			return;
		}
		if(cur == N) {
			return;
		}

		tables[cnt] = cur;
		recur(cur+1, cnt+1);
		recur(cur+1, cnt);
	}

	private static int[] countStudent() {
		int[] maxStudents = new int[2]; // 학생 수와 등급
		int[] gradeCount = new int[5];

		for(int i = tables[0]; i <= tables[1]; i++) { // 여기도 잘못 구현했다.
			if(grades[i][0] == grades[i][1]) {
				gradeCount[grades[i][0]-1]++;
			}
			if(i != tables[1] && grades[i][1] == grades[i+1][0]) {
				gradeCount[grades[i][1]-1]++;
			}
		}

		for(int i = 0; i<5; i++) {
			if(maxStudents[0] < gradeCount[i]) {
				maxStudents[0] = gradeCount[i];
				maxStudents[1] = i+1;
			}
		}

		return maxStudents;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		grades = new int[N][2];
		tables = new int[2];

		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<2; j++) {
				grades[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		recur(0, 0);
		System.out.println(max + maxGrade);
	}
}
