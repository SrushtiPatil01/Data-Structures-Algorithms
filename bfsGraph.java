//Breadth First Search Traversal of Graph
import java.util.*;

class Main{
    public List<Integer> bfsTraversal(List<List<Integer>> adj){
        int v = adj.size();
        int start = 0;
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> bfs = new ArrayDeque<>();
        
        visited[start] = true;
        bfs.add(start);
        
        while(!bfs.isEmpty()){
            int current = bfs.poll();
            result.add(current);
            
            for(int x : adj.get(current)){
                if(!visited[x]){
                    visited[x] = true;
                    bfs.add(x);
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
        List<List<Integer>> adj = new ArrayList<>();
        
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));       
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));       
        adj.add(new ArrayList<>(Arrays.asList(1,4)));          
        adj.add(new ArrayList<>(Arrays.asList(2,3)));
        
        Main main = new Main();
        List<Integer> result = main.bfsTraversal(adj);
        
        for(int x : result){
            System.out.println(x + " ");
        }
    }
}
