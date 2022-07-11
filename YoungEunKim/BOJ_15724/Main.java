package test;
import java.io.*;
import java.util.*;

public class Main{  
	
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine() , " ");
    	StringBuilder sb = new StringBuilder();
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	int[][] arr =new int[N+1][M+1];
    	
    	for(int i = 1 ; i <= N ; i++) {
    		st = new StringTokenizer(br.readLine() , " ");
    		for(int j = 1; j <= M ; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken())+ arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1]; 
    		}
    	}
    		
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T --> 0) {
    		st = new StringTokenizer(br.readLine() , " ");
    	
    		int x1 = Integer.parseInt(st.nextToken());
    		int y1 = Integer.parseInt(st.nextToken());
    		int x2 = Integer.parseInt(st.nextToken());
    		int y2 = Integer.parseInt(st.nextToken());
    	
    		
    		int result = arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1];
    		sb.append(result+"\n");
    	}
    	
    	System.out.println(sb);
    }
}