public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> s = new Stack<NestedInteger>();
    public NestedIterator(List<NestedInteger> nestedList) {
        if(nestedList==null) return;
        for(int i = nestedList.size()-1;i>=0;i--){
            s.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
       return s.pop().getInteger();
        
    }

    @Override
    public boolean hasNext() {
        while (!s.empty()) {
            NestedInteger t = s.peek();
            if (t.isInteger()) return true;
            s.pop();
            for (int i = t.getList().size() - 1; i >= 0; i--) {
                s.push(t.getList().get(i));
            }
        }
        return false;
        
    }
}