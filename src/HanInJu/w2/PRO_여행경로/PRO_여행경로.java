package HanInJu.w2.PRO_여행경로;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PRO_여행경로 {
	// N개의 공항을 줄세운다!
	// 같은 게 있을 수도 있지만 어쨌든 중복은 안되고, 알파벳 순서가 앞서는 경로 찾아야 함
	// 순열
	public boolean[] visited;
	public List<String> allRoutes;
	public String[][] allTickets;

	public String[] solution(String[][] tickets) {
		String[] answer = {};
		allTickets = tickets;

		visited = new boolean[allTickets.length];
		allRoutes = new ArrayList<>();

		recur(0, "ICN", "ICN");

		Collections.sort(allRoutes);
		answer = allRoutes.get(0).split(",");

		return answer;
	}

	public void recur(int cur, String dest, String route) {
		if(cur == allTickets.length) {
			allRoutes.add(route);
			return;
		}

		for(int i = 0; i< allTickets.length; i++) {
			if(!visited[i] && dest.equals(allTickets[i][0])) {
				visited[i] = true;
				recur(cur+1, allTickets[i][1], route + "," + allTickets[i][1]);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {

	}

}
