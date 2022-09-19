package test;
import java.io.*;
import java.util.*;

public class Main{  
	
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//StringTokenizer st = new StringTokenizer(br.readLine() , " ");
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] drinks = new int[N+1];
    	int[] dp = new int[N+1];
    	
    	for(int i = 1 ; i <= N ; i++) {
    		drinks[i] = Integer.parseInt(br.readLine());
    	}
    	
    	dp[1] = drinks[1];
    	
    	if(N>=2) {
    		dp[2] = drinks[2]+ drinks[1];
    	}
    	
    	for(int i = 3 ; i <= N; i++) {
    		dp[i] = Math.max(dp[i-1], Math.max(drinks[i] + dp[i-2], drinks[i] + drinks[i-1] + dp[i-3]));
    	}
    	
    	System.out.print(dp[N]);
    }
}