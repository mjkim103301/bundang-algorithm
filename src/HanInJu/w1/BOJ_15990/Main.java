package HanInJu.w1.BOJ_15990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static int n, sum = 0, before = -1;
	public static long answer = 0;
	public static boolean flag;
	public static int[] array = new int[3];
	public static boolean[] visited = new boolean[4];


	public static void rec() {
		if(sum == n) { // 3개에서 m개를 뽑아서 다 더헸을 때 n이 되면 탈출
			return;
		}

		for(int i = 1; i<=3; i++) {
			if(i == before) { // 직전에 뽑았던 거라면 continue
				continue;
			}
			sum += i; // i뽑음
			before = i; // 다음에 i를 또 뽑지 않기 위해 before 에 저장
			rec();
			sum -= i; // 다른 도전을 계속 하기 위해서 i를 빼줌 == 원상태로 되돌리기
			before = i; // 직전에 뽑은 걸 어떻게 다시 복원하지...?
		}
	}

	public static void recursion(int cur) {
		if(array[2] != -1) {
			for(int a : array) sum += a;
			if(sum > n) {
				return;
			}
			if(sum == n) {
				answer++;
				return;
			}
		}

		for(int i = 1; i <= 3; i++) {
			if(visited[i]) {
				continue;
			}
			array[cur] = i;
			visited[i] = true;
			if(cur != 0) {
				visited[array[cur - 1]] = false;
			}
			recursion(cur+1);
			array[i-1] = -1;
			visited[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for(int i = 0; i < testCase; i++) {
			answer = 0;
			Arrays.fill(array, -1);
			n = Integer.parseInt(br.readLine());
			recursion(0);
			System.out.println(answer % 1000000009);
		}

	}
}
