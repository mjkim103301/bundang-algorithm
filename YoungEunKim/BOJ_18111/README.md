# BOJ 18111번 [마인크래프트](https://www.acmicpc.net/problem/18111)

## 🌈 풀이 후기
* 블럭을 뺴고 더하는 걸 반대로 작성해서 시간이 좀 더 소요됐습니다.

## 👩‍🏫 문제 풀이
* N과 M이 500으로 작기 때문에 완전탐색이 가능하다고 생각했습니다.
* 최악의 경우의 시간복잡도는 O(N^3)으로 500* 500 *500 < 1억이므로 시간 초과가 되지 않습니다.
* 현재 땅의 모든 높이로 맞춰보고 그 중 가장 작은 소요시간을 기록하는 시간과 땅의 높이를 출력했습니다.

### 주요 코드 
``` java
 int diff = Math.abs(map[i][j] - level);
				
				if(level > map[i][j]) {
					time += diff;
					blocks -= diff;
				}
				else if(level < map[i][j]) {
					time += 2 * diff;
					blocks += diff;
				}
 ```
 *정한 땅의 높이와 현재 땅의 높이의 차를 구하고 현재 땅의 높이가 크면 블럭을 회수하고 낮으면 블럭을 쌓음
 <br><br>


 ```java
for(int i = min ; i <= max ; i++) {
        	int time = plowUp(i);
        	
        	if(time == -1) continue;
        	
        	if(time <= minTime) {
        		minTime = time;
        		level = i;
        	}
        }
 ```
 * 현재 블럭들의 최소~ 최대 높이에 대해서만 고려
 * 만약 인벤토리에 블럭이 모자르다면 -1을 리턴하여 고려하지 않음