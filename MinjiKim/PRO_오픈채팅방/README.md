# PRO LV2 [오픈채팅방](https://programmers.co.kr/learn/courses/30/lessons/42888)

## 🌈 풀이 후기
* ```String[] info=line.split(" ");``` 을 통해 바로 input을 문자열 배열로 만들 수 있다는 것을 복습할 수 있었습니다.
## 👩‍🏫 문제 풀이
* (유저의 아이디, 유저의 닉네임, 채팅방에 들어왔는지 여부)를 저장할 Node를 만듭니다.
* input으로 주어지는 record 배열을 돌면서 
    * ```setChatList```메서드를 통해 유저가 들어오고 나가는지 저장합니다.
        * 들어왔으면 enter=true
        * 나갔으면 enter=false
        * 이름을 변경했으면 setChatList 메서드를 실행하지 않습니다.
    * ```setUserMap```메서드를 통해 유저별 마지막으로 변경된 닉네임을 저장합니다.
        * hashMap에 무조건 put 하면서 id 별로 닉네임이 바뀌어도 변경된 값으로 저장됩니다.
        * 채팅방에서 나갔으면 setUserMap을 실행하지 않습니다.