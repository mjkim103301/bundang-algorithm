import java.io.*;
import java.util.*;

public class Main{  
	
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Stack<Double> stack = new Stack<>();
    	
    	int N = Integer.parseInt(br.readLine());
    	String operation = br.readLine();
    	
    	double[] numbers = new double[N];
    	for(int i=0;i<N;i++) {
    		numbers[i] = Double.parseDouble(br.readLine());
    	}
    	
    	
    	for(int i=0;i<operation.length();i++) {
    		
    		if(operation.charAt(i) >= 'A' && operation.charAt(i)<='Z') {
    			stack.push(numbers[operation.charAt(i)-'A']);
    			continue;
    		}
    		
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
    			stack.push(a-b);
    		}
    		
    	}
    	
    	System.out.print(String.format("%.2f", stack.pop()));
    }
}