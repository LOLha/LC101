public class S19{
	 public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        ListNode pre = null;
        ListNode node = head;
        for(int i = 1;i<=n;i++){
            right = right.next;
        }
        while(right!=null){
            pre = left;
            left = left.next;
            right = right.next;
        }
        if(pre==null){
            return left.next;
        }
        pre.next = left.next;
        return node;
        
    }
	
}