public class S2{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        int t = 0;
        ListNode head = null;
        ListNode tail = null;
        while(n1!=null||n2!=null){
            if(n1!=null){
                t += n1.val;
                n1 = n1.next;
            }
            if(n2!=null){
                t += n2.val;
                n2 = n2.next;
            }
            ListNode node = new ListNode(t%10);
            t /= 10;
            if(head==null){
                head = node;
                tail = node;
            }else {tail.next = node; tail = tail.next;}
            
        }
        if(t>0){
            tail.next = new ListNode(t);
        }
        return head;
    }
}