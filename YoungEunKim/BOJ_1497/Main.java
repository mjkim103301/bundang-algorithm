package test;
import java.io.*;
import java.util.*;

public class Main{  
	
	static int[][] playlist;
	static boolean[] guitar;
	static int[] arr;
	static int N,M;
	static int max =0;
	static int min = Integer.MAX_VALUE;
	
	public static void find(int idx, int cnt) {
		
		if(idx == cnt) {
			int m = M;
			for(int i=0;i<M;i++) {
				if(arr[i] == 0) {
					m--;
				}
			}
			if(max <= m) {
				min = Math.min(min, cnt);
				max = m;
			}
			return;
		}
		
		for(int i = 0 ; i < N ; i++) {
			if(guitar[i]) {
				continue;
			}
			
			guitar[i] = true;
			for(int j = 0 ; j < M ; j++) {
				if(playlist[i][j] == 1) {
					arr[j]++;
				}
			}
			
			find(idx+1,cnt);
			
			guitar[i] = false;
			for(int j = 0 ; j < M ; j++) {
				if(playlist[i][j] == 1) {
					arr[j]--;
				}
			}
		}
	}
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine() , " ");

    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	arr = new int[M];
    	guitar = new boolean[N];
    	playlist = new int[N][M];
    	
    	for(int i = 0 ; i < N ; i++) {
    		
    		st = new StringTokenizer(br.readLine() , " ");
    		st.nextToken();
    		String list = st.nextToken();
    		
    		for(int j = 0; j < M ; j++) {
    			if(list.charAt(j)== 'Y') {
    				playlist[i][j] = 1;
    				
    			}
    		}
    	}
    	
    	for(int i = N ; i > 0 ; i--) {
    		
    		find(0,i);
    		Arrays.fill(arr, 0);
    		
    	}
    	
    	if(max == 0) {
    		min = -1;
    	}
    	System.out.print(min);
    }
}