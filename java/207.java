public class S207{
	  public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] d = new int[numCourses];
        List<Integer>[] e = new ArrayList[numCourses];
        for(int i = 0;i<e.length;i++){
            e[i] = new ArrayList<Integer>();
        }
        for(int i = 0;i<prerequisites.length;i++){
            d[prerequisites[i][0]]++;
            e[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0;i<numCourses;i++){
            if(d[i]==0){
                queue.add(i);
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            Integer a = queue.poll();
            count++;
            for(Integer b:e[a]){
                if(--d[b]==0){
                    queue.add(b);   
                }
            }
        }
        return count==numCourses;
    }
	
	
}
