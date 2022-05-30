import java.io.*;
import java.util.*;

public class Main{  
	
	
    public static void main(String[] args)throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int[][] map = new int[N][2];
    	int[][] dp = new int[N][2];
  
    	int max = 0;
    	int minGrade = Integer.MAX_VALUE;
    	
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine() , " ");
    		
    		map[i][0] = Integer.parseInt(st.nextToken()); 
    		map[i][1] = Integer.parseInt(st.nextToken());
    		int[] nums = new int[6];
    		
    		if(i == 0) {
    			dp[0][0] = 1;
    			dp[0][1] = 1;
    		}
    		else {
    			Arrays.fill(nums, 0); // nums 는그 전 줄에서  1~5까지 중 점수가  몇개가 존재하는지를 저장
    			
    			
    			nums[map[i-1][0]] = dp[i-1][0]; // 그 전 줄의 0번째 앉은 학생의 그레이드 dp를 저장
    			nums[map[i-1][1]] = dp[i-1][1]; // 그 전 줄의 1번째 앉은 학생의 그레이드 dp를 저장
    			
    			dp[i][0] = nums[map[i][0]] + 1; // 현재 줄의 0 번째 앉은 학생의 그레이드 dp를 저장
    			
    			dp[i][1] = nums[map[i][1]] + 1; // 현재 줄의 1 번째 앉은 학생의 그레이드 dp를 저장
    			
    		}
    		
    		for(int j = 0 ; j < 2 ; j++) {
    			//채점한 학생 수가 많으면 업데이트
    			//채점한 학생 수가 지금까지 최대 채점한 학생수와 같으며 점수가 그 전보다 작으면 업데이트
    			if(max < dp[i][j] || (max == dp[i][j] && minGrade > map[i][j])) {
    				max = dp[i][j];
    				minGrade = map[i][j];    			
    			}
    		}
    		
    		
    	}
    	
    	
    	System.out.print(max+ " " + minGrade);
    }
}