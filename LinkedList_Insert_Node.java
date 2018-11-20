   static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode current = head;

        if (position == 0) {
            node.next = head;
            return node;
        }

        int length = 0;
        while (current.next != null) {
            if (length == position - 1) {
                node.next = current.next;
                current.next = node;
                return head;

            } else {
                current = current.next;
                length++;
            }
        }
        return head;
    }
