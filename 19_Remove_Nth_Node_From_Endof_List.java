class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {

		List<Integer> list = new ArrayList<>();
		while (head.next != null) {
			list.add(head.val);
		}

		if (list.size() - n >= 0) {
			list.remove(list.size() - n);
		} else {
			return null;
		}

		ListNode header = new ListNode(list.get(0));
		ListNode current = header;
		for (int i = 1; i < list.size(); i++) {
			current.next = new ListNode(list.get(i));
			current = current.next;
		}
		return header;
	}
}
