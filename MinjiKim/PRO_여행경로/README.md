# PRO LV3 [여행경로](https://programmers.co.kr/learn/courses/30/lessons/43164?language=java)

## 🌈 풀이 후기
* 같은 경로가 여러 개 있을 수 있다고 생각을 못해서 계속 틀렸었습니다.
* 2차원 배열의 사이즈를 구하는 방법을 ide를 못쓰니까 실수했었습니다.
```java
 String[][] tickets=new String[3][4];
 H=tickets.length; //3
 W=tickets[0].length; //4
```
## 👩‍🏫 문제 풀이
* 중복 없는 도시 배열을 구하기 위해 tickets 2차원 배열을 돌면서 도시를 ```Set<String> citys```에 저장합니다.
* ```List<String> sortedCity```에 citys set을 정렬해서 저장합니다.
* ```int[][] map``` 에 티켓 정보를 저장합니다.
    * map[from][to]=티켓 개수
* dfs 로 인천에서 시작해서 tickets 배열에 저장된 개수와 dfs 깊이를 비교하며 경로를 구합니다.
    * 경로를 ```List<Integer>way```에 저장합니다.
    * 1번 경로가 완성되면 이게 답이 되므로 flag를 사용해서 dfs를 종료합니다.
* way 에 들어있는 index를 바탕으로 도시를 출력합니다.