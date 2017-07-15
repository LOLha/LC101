public S133{
	  public Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(node,newNode);
        for(UndirectedGraphNode n:node.neighbors){
            newNode.neighbors.add(cloneGraph(n));
        }
        return newNode;
    }
	
	
}
