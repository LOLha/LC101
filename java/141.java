public class S141{
	 public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast==null) return false;
            fast = fast.next;
            if(slow==fast) return true;
        }
        return false;
        
        
    }
}
	
	
	
}