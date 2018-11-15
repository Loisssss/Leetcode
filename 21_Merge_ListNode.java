class Q21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		   ListNode l3 = new ListNode(0);
		   if (l1 == null && l2 != null) {
	        	return l2;
		}
		   if (l2 == null && l1 != null) {
			   return l1;
		}
		   if (l1 == null && l2 == null) {
			   return null;	
		}
		   while (l1 != null && l2 != null) {
			   if (l1.val < l2.val) {
		           l3.next = l1;
		           l1 = l1.next;
				
			} else {
				l3.next = l2;
	        	l2 = l2.next;
			}
		}
		   return l3.next;
	}
}
