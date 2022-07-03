# BOJ 1497번 [기타콘서트](https://www.acmicpc.net/problem/1497)

## 🌈 풀이 후기
* 시간 제한이 2초여서 back tracking으로 풀었습니다.

## 👩‍🏫 문제 풀이
* 시간 제한이 2초이기 때문에 back tracking으로 풀었습니다.
* 기타 N개 중 R개를 뽑아 연주할 수 있는 곡의 갯수의 MAX를 구하는 방식입니다.

### 주요 코드 
``` java
 if(idx == cnt) {
			int m = M;
			for(int i=0;i<M;i++) {
				if(arr[i] == 0) {
					m--;
				}
			}
			if(max <= m) {
				min = Math.min(min, cnt);
				max = m;
			}
			return;
		}
 ```
 * R개의 기타를 골랐을 때 연주할 수 있는 최대곡이 기존의 최대곡 보다 많거나 같으면 최소의 기타갯수를 min에 저장합니다.
 <br><br>


 ```java
for(int i = 0 ; i < N ; i++) {
			if(guitar[i]) {
				continue;
			}
			
			guitar[i] = true;
			for(int j = 0 ; j < M ; j++) {
				if(playlist[i][j] == 1) {
					arr[j]++;
				}
			}
			
			find(idx+1,cnt);
			
			guitar[i] = false;
			for(int j = 0 ; j < M ; j++) {
				if(playlist[i][j] == 1) {
					arr[j]--;
				}
			}
		}
 ```
 * 각 기타를 뽑고 연주할 수 있는 곡을 찾습니다.

 