# PRO [여행경로](https://programmers.co.kr/learn/courses/30/lessons/43164?language=java)

## 🌈 풀이 후기
* "ICN A", "ICN B", "B A"와 같이 A가 사전적으로 먼저오지만 ICN에서 A로 갔을 때 모든 티켓을 다 사용할 수 없다는 예외사항을 생각하지 못했습니다. 

## 👩‍🏫 문제 풀이
* v는 도시 e는 도시에서 도시로 가는 경로
* 사전적으로 먼저오는 경로를 return하므로 도착하는 도시를 sorting한다. O(vlongv)
* 모든 경로의 경우의 수를 계산한다. O(e^2)

### 주요 코드 
``` java
 Arrays.sort(tickets, (o1,o2)-> {
            return o1[1].compareTo(o2[1]);
        });
 ```
 * 티켓의 도착지 명을 정렬
 <br><br>


 ```java
    if(cnt == tickets.length){
            paths.add(path);
            return;
    }
    if(!visited[i] && tickets[i][0].equals(now)){
                
            visited[i] = true;
            cnt++;
                
            dfs(tickets, tickets[i][1], path + "," + tickets[i][1], cnt);
                
            visited[i] = false;
            cnt--;
    }
 ```
 * 도시를 돌아다니며 모든 티켓을 사용하면 ArrayList에 add한다.
 
 
 
  ```java
     return paths.get(0).split(",");
   
 ```
 * 저장된 도시방문 경로 중 첫번째 경로가 사전적으로 먼저인 방문경로이므로(처음에 도착지대로 정렬 했으므로) 첫번째 String을 ","대로 잘라 return한다. 
