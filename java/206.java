
 


public class S206 {
	 public ListNode reverseList(ListNode head) {
	        if(head==null||head.next==null) return head;
	        ListNode p = head.next;
	        ListNode n = reverseList(p);
	        head.next = null;
	        p.next = head;
	        return n;
	 }
	 public ListNode reverseList(ListNode head){
	 	if(head==null||head.next==null) return head;
		ListNode pre = null;
		ListNode next = null;
		ListNode cur = head;
		while(cur!=null){
		    next = cur.next;
		    cur.next = pre;
	            pre = cur;
		    cur = next;
		}
	        return pre;
	 }
	

}
