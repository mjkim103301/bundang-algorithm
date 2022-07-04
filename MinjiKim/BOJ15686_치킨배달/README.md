# BOJ 15686번 [치킨 배달](https://www.acmicpc.net/problem/15686)

## 🌈 풀이 후기
* 조합으로 풀 수 있는 비교적 간단한 문제였습니다.
## 👩‍🏫 문제 풀이
* input을 하면서 ```List<Node> home```에는 집의 좌표를 저장하고, ```List<Node> chicken``` 에는 치킨집의 좌표를 저장합니다.
* chicken.size() 중에서 M개의 치킨집을 고르면 (조합)
    * ```getChickenDistance()```를 통해 각 집에서의 치킨 거리를 구하고 그 합을 return 합니다.
    * minChickenDistance 변수값을 갱신합니다. 