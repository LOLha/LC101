public class S210{
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] d = new int[numCourses];
        List<Integer>[] e =  new ArrayList[numCourses];
        for(int i = 0;i<numCourses;i++){
            e[i] = new ArrayList<Integer>();
        }
        for(int i = 0;i<prerequisites.length;i++){
            d[prerequisites[i][0]]++;
            e[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0;i<d.length;i++){
            if(d[i]==0){
                queue.add(i);
            }
        }
        int[] result = new int[numCourses];
        int count = 0;
        while(!queue.isEmpty()){
            Integer a = queue.poll();
            result[count++] = a;
            for(Integer b:e[a]){
                if(--d[b]==0){
                    queue.add(b);
                }
            }
        }
        if(count==numCourses){
            return result;
        }
        return new int[0];
    }
}
