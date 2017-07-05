public class S24{
	 public ListNode swapPairs(ListNode head) {
        ListNode root = head;
        int first ;
        while(head!=null&&head.next!=null){
            first = head.val;
            head.val = head.next.val;
            head.next.val = first;
            head = head.next.next;
            
            
        }
        
        return root;
    }
	
}