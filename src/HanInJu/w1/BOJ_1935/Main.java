package HanInJu.w1.BOJ_1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String exp = br.readLine();
		int[] values = new int[n];

		for(int i = 0; i < n; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}

		char character;
		double a, b;
		Stack<Double> expression = new Stack<>();
		for(int i = 0; i<exp.length(); i++) {
			character = exp.charAt(i);
			if(character != '+' && character != '-' && character != '*' && character != '/') {
				expression.push(0.0 + values[character - 65]);
			}
			else {
				b = expression.pop();
				a = expression.pop();
				if(character == '+') {
					expression.push(a + b);
				}
				else if(character == '-') {
					expression.push(a - b);
				}
				if(character == '*') {
					expression.push(a * b);
				}
				if(character == '/') {
					expression.push(a / b);
				}
			}
		}
		System.out.printf("%.2f", expression.pop());
	}
}
