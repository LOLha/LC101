public class S399{
 private class DirectedEdge{
        public final String v;
        public final String w;
        public final double weight;
		
        public DirectedEdge(String v,String w,double weight){
            this.v = v;
            this.w = w;
            this.weight = weight;
        }
    }
    int edgeSize;
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
              this.edgeSize = values.length * 2;
              double[] result = new double[queries.length];
              Map<String,List<DirectedEdge>> map = new HashMap<>();
              for(int i = 0;i<equations.length;i++){
                  String v = equations[i][0];
                  String w = equations[i][1];
                  if(map.get(v)==null){
                      map.put(v,new ArrayList<DirectedEdge>());
                  }    
                  map.get(v).add(new DirectedEdge(v,w,values[i]));
                  if(map.get(w)==null){
                      map.put(w,new ArrayList<DirectedEdge>());
                  }
                  map.get(w).add(new DirectedEdge(w, v, 1/values[i]));
              }
              for(int i = 0;i<queries.length;i++){
                  result[i] = bfs(queries[i],map);
              }
              return result;
    }
    public double bfs(String[] query,Map<String,List<DirectedEdge>> map){
              Queue<String> queue = new LinkedList<String>();
              String head = query[0];
              String tail = query[1];
              List<String> marked = new ArrayList<String>();
              Map<String,String> edges = new HashMap<String,String>();
              if(map.get(head)==null||map.get(tail)==null) return -1.0;
              if(head.equals(tail)) return 1.0;              
              queue.offer(head);
              marked.add(head);
              double value = 1.0;
        
              while(!queue.isEmpty()){
                  String v = queue.poll();
                  for(DirectedEdge edge:map.get(v)){
                      if(!marked.contains(edge.w)){
                          edges.put(edge.w, v);
                          marked.add(edge.w);
                          queue.offer(edge.w);
                      }
                  }
              }
              
              String c = edges.get(tail);
              if(c==null) return -1.0;
              while(!tail.equals(head)){
                 List<DirectedEdge> list = map.get(String.valueOf(c));
                 for(DirectedEdge e:list){
                     if((e.w).equals(String.valueOf(tail))){
                         value *= e.weight;
                         break;
                     }
                 }
                  tail = c;
                  c = edges.get(c);
                  
              }
             
              
              return value;
        
    }


}
