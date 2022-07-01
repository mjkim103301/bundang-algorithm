import java.util.*;
class Solution {
    
    static boolean[] visited;
    static ArrayList<String> paths = new ArrayList<String>();
    
    public void dfs(String[][] tickets, String now, String path, int cnt){
        
        if(cnt == tickets.length){
            paths.add(path);
            return;
        }
        
        for(int i = 0 ; i < tickets.length ; i++){
            
            if(!visited[i] && tickets[i][0].equals(now)){
                
                visited[i] = true;
                cnt++;
                
                dfs(tickets, tickets[i][1], path + "," + tickets[i][1], cnt);
                
                visited[i] = false;
                cnt--;
            }
        }    
    }
    
    public String[] solution(String[][] tickets) {
     
        visited = new boolean[tickets.length];
        
        Arrays.sort(tickets, (o1,o2)-> {
            return o1[1].compareTo(o2[1]);
        });
        
        
        dfs(tickets, "ICN","ICN",0);
        
        return paths.get(0).split(",");
    }
}