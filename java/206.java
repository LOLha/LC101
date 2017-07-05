
 


public class S206 {
	 public ListNode reverseList(ListNode head) {
	        if(head==null||head.next==null) return head;
	        ListNode p = head.next;
	        ListNode n = reverseList(p);
	        head.next = null;
	        p.next = head;
	        return n;
	        
	        
	    }

}
