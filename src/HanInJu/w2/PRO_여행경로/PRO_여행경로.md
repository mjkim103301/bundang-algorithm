# PRO [여행경로](https://programmers.co.kr/learn/courses/30/lessons/43164?language=java)

## 🌈 풀이 후기
* 처음에 DFS/BFS 유형을 보고 당황해서 풀이를 떠올리지 못했다.
* 무작정 리스트에 여행지를 다 넣어야겠다고만 생각한 게 패인이었던 것 같다.

## 👩‍🏫 문제 풀이
- N개의 항공권을 차례로(도착지와 출발지가 같도록) 줄세우면 된다.
- 중복을 허용하지 않으므로 `순열`로 풀면 된다.
- `도착지와 출발지가 같은 항공권`을 고른다.
- 중복을 허용하지 않으므로 `visited` 배열로 사용한 항공권을 가려낸다.
- 모든 경로를 다 구해놓고 나중에 정렬한다.

### 주요 코드
```java
public class Main {
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
}
```