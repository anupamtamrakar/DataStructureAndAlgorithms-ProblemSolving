
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class Test
{
    public boolean hasCycle(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) 
     {
       for(int vec = 0; vec<v;vec++){
           if(CycleUtil(vec, alist,visited,explored))
            return true;
       }
        return false;
     }
     
    public boolean CycleUtil(int vec,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored){
        if(explored[vec])
            return true;
        if(visited[vec])
            return false;
        
        explored[vec] = true;
        visited[vec] = true;
       List<Integer> li = alist[vec];
       
       for(Integer in: li){
           if(CycleUtil(in, alist, visited, explored))
            return true;
       }
       explored[vec] = false;
       return false;
       }
    
}