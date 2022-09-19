# PRO LV2 [메뉴리뉴얼](https://school.programmers.co.kr/learn/courses/30/lessons/72411)

## 🌈 풀이 후기
* 조합을 여러번 해야 하는 문제였습니다.
* HashMap을 탐색하는 방법을 복습할 수 있었습니다.

## 👩‍🏫 문제 풀이
* ```List<char[]> orderList``` -> input으로 들어오는 String[]orders를 문자로 쪼개서 만든 리스트
* ```Map<String, Integer> map``` -> 메뉴 조합별로 몇 개 있는지 저장하는 HashMap<메뉴조합, 주문된 횟수>
* ```List<String>[] result``` -> course 개수별로 가장 많이 주문된 메뉴 조합 string 을 넣어주는 리스트
* 풀이 과정
    * orders 에 있는 주문 메뉴가 "ABCFG" 라면 orderList에 char[]{'A', 'B', 'C', 'F', 'G'} 형식으로 저장합니다.
    * char[] 배열을 사전순으로 정렬합니다.
    * orderList에 저장된 주문 메뉴별, course 의 개수별로 조합을 만듭니다.
        * 만든 조합은 map 에 모두 저장합니다.
    * setResult() 메서드에서 2번 이상 주문된 메뉴조합을 result 리스트에 넣습니다.
    * result 리스트에 들어있는 메뉴조합을 ```List<String> answerList``` 에 모두 넣습니다.

    * answerList 를 사전순으로 정렬합니다.
    * answer 배열에 담아 리턴합니다. 