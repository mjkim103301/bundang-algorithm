import java.io.*;
import java.util.*;
public class Main{  
	static int N,M,B;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int[][] map;
	
	
	public static int plowUp(int level) {
		int blocks = B;
		int time = 0;
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j< M ; j++) {
				int diff = Math.abs(map[i][j] - level);
				
				if(level > map[i][j]) {
					time += diff;
					blocks -= diff;
				}
				else if(level < map[i][j]) {
					
					time += 2 * diff;
					blocks += diff;
				}
			}
		}
		
		if(blocks < 0) {
			return -1;
		}
		
		return time;
	}
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	int minTime = Integer.MAX_VALUE;
    	int level = -1;
    	
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	B = Integer.parseInt(st.nextToken());
    	
    	map = new int[N][M];
    	
        for(int i = 0; i < N ; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	for(int j = 0 ; j < M ; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		max = Math.max(max, map[i][j]);
        		min = Math.min(min, map[i][j]);
        	}
        }
        
        for(int i = min ; i <= max ; i++) {
        	int time = plowUp(i);
        	
        	if(time == -1) continue;
        	
        	if(time <= minTime) {
        		minTime = time;
        		level = i;
        	}
        }
        
        System.out.print(minTime+" "+level);
    }
}