# BOJ 1935번 [후위 표기식2](https://www.acmicpc.net/problem/1935)

## 🌈 풀이 후기
* 후위 표기식의 원리대로 풀었습니다.

## 👩‍🏫 문제 풀이
* 연산식에서 숫자면 stack에 push, 연산자면 stack에서 두 수를 pop하여 계산하여 push 합니다.

### 주요 코드 
``` java
if(operation.charAt(i) >= 'A' && operation.charAt(i)<='Z') {
    	stack.push(numbers[operation.charAt(i)-'A']);
    	continue;
}
 ```
 *숫자면 stack에 push
 <br><br>


 ```java
double b = stack.pop();
double a = stack.pop();
			
if(operation.charAt(i)=='*') {
    	stack.push(a*b);
}
else if(operation.charAt(i)=='/') {
    	stack.push(a/b);
}
else if(operation.charAt(i)=='+') {
    	stack.push(a+b);
}
else if(operation.charAt(i)=='-') {
    	tack.push(a-b);
}
 ```
 * 연산자면 두 숫자를 pop하여 연산 후 push