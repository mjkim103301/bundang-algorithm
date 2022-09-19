# BOJ 2156번 [포도주 시식](https://www.acmicpc.net/problem/2156)

## 🌈 풀이 후기
* N = 1일 때의 예외를 생각하지 못했습니다.

## 👩‍🏫 문제 풀이
* 첫번째 두번째, N번 째 포도주를 마실 때 각 합의 최대를 마셔야 하기 때문에 
* N번 째에서의 최대 합을 구할 수 있는 방식인 dynamic programming 방식으로 풀었습니다.

### 주요 코드 
``` java
 dp[1] = drinks[1];
    	
    	if(N>=2) {
    		dp[2] = drinks[2]+ drinks[1];
    	}
    	
    	for(int i = 3 ; i <= N; i++) {
    		dp[i] = Math.max(dp[i-1], Math.max(drinks[i] + dp[i-2], drinks[i] + drinks[i-1] + dp[i-3]));
    	}
    	
 ```
 * 음료가 1개일 때는 그 하나를 다 마시는게 최대
 * 음료가 2개일 때는 두 개 모두 마시는게 최대
 * 음료가 3개 이상일 때는 연속해서 3개를 못마시기 때문에 (i번째 + i-2번까지) or (i번째 + i-1번째 + i-3번까지) or (i-1번까지) 중 최대값
 <br><br>
