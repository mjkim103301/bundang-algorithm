# BOJ 1497번 [기타콘서트](https://www.acmicpc.net/problem/1497)

## 🌈 풀이 후기
* 부분집합 코드를 복습할 수 있었습니다.
* string 에서 index 하나하나 확인할 땐 ```string.charAt(index)``` 
* string 에서 특정 요소의 index를 확인할 땐 ```string.indexOf("string")``` 을 다시 한번 확인했습니다. (이 부분때문에 틀렸었습니다.)
*  ```Arrays.fill(songList, false);``` 코드도 까먹었었는데 다시 복습할 수 있었습니다.

## 👩‍🏫 문제 풀이
* ```Map<String, List<Integer>> map``` 에 Map<기타이름, 연주할 수 있는 곡 번호 리스트> 를 저장합니다.
* 부분집합을 돌면서 구매할 기타 개수(``` int guitarCnt ```)와 연주할 수 있는 곡 개수(``` int songCnt```)를 확인합니다. 
    * guitarCnt , minGuitarCnt 을 비교하며 갱신합니다.
    * songCnt , maxSong 을 비교하며 갱신합니다.