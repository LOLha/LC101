public class S21{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode n1=l1;
    ListNode n2=l2;
    
   if (n1 == null) return n2;
   if (n2 == null) return n1;

   ListNode node;
   if (n1.val < n2.val)
   {
      node = n1; 
      node.next = mergeTwoLists(n1.next, n2);
   }
   else
   {
      node = n2;
      node.next = mergeTwoLists(n1, n2.next);
   }
   return node;
}
	
}