# BOJ 1935번 [후위 표기식2](https://www.acmicpc.net/problem/1935)

## 🌈 풀이 후기
* 수를 올림, 내림, 반올림하는 부분은 계속 까먹는 것 같아요~
* 반올림 ```String.format("%.2f", value)``` -> 소수점 3째자리에서 반올림
* 단순 올림 ``` Math.ceil(value)```
* 단순 내림 ``` Math.floor(value)```
* 단순 반올림 ``` Math.round(value)```
## 👩‍🏫 문제 풀이
* 숫자만 따로 저장하는 배열 ```map``` 을 만들어서 숫자를 따로 저장합니다.
* 계산식 ```input```을 parsing 하면서 알파벳 문자면 stack에 값을 넣어주고, 연산자면 ```calculate``` 메서드를 호출합니다.
* ```calculate``` 메서드에서 값들을 꺼내 계산해준 후 다시 stack 에 넣습니다. 
* parsing이 끝나면 마지막 값을 stack에서 꺼내서 출력합니다.