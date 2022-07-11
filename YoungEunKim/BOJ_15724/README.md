# BOJ 15724번 [주지수](https://www.acmicpc.net/problem/15724)

## 🌈 풀이 후기
* (1,1) 부터 시작하지 않을 때 빼주는 값을 계산하는데 시간을 많이 소요했습니다.

## 👩‍🏫 문제 풀이
* N, M이 최대 1024로 1번 계산할 때 1000,000  K는 최대 100,000로 완전 탐색으로 풀 시 worst = 100,000,000,000
* 따라서 (1,1) ~ (i,j)의 합을 dp에 저장

### 주요 코드 
``` java
 	for(int i = 1 ; i <= N ; i++) {
    		st = new StringTokenizer(br.readLine() , " ");
    		for(int j = 1; j <= M ; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken())+ arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1]; 
    		}
    	}
    	
 ```
 * (i,j)까지의 합= (i,j-1)까지의 합 + (i-1,j)까지의 합 - (i-1,j-1)까지의 합 + (i,j)번 째의 숫자(2번 빼져서)
 <br><br>

 
``` java
 	int result = arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1];
 ```
 * (x1,y1)~(x2,y2)까지의 합은 (x2,y2)까지의 합 - (x2,y1)전까지의 합 -(x1,y2)까지의 합 + (x1,y1)까지의 합(2번 빼져서)
 <br><br>