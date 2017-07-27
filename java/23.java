public class S23{
   public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
		    public int compare(ListNode o1, ListNode o2) {
			    return o1.val-o2.val;
		    }
	    });
	    for(ListNode n:lists){
		   if(n!=null){
			   queue.offer(n);
		   }
	    }
	    ListNode head = new ListNode(0);
	    ListNode tail = head;
	    while(!queue.isEmpty()){
		   tail.next = queue.poll();
		   tail = tail.next;
		   if(tail.next!=null) queue.offer(tail.next);
	    }
	   
	   
	    return head.next;
    }
}
