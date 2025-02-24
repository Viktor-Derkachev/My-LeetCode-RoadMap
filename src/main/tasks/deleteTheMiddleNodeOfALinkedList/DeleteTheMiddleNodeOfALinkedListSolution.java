package main.tasks.deleteTheMiddleNodeOfALinkedList;
/*
2095. Delete the Middle Node of a Linked List

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.

The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋
 denotes the largest integer less than or equal to x.

For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

Example 1:

Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
Explanation:
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.
Example 2:


Input: head = [1,2,3,4]
Output: [1,2,4]
Explanation:
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.
Example 3:


Input: head = [2,1]
Output: [2]
Explanation:
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.


Constraints:

The number of nodes in the list is in the range [1, 105].
1 <= Node.val <= 105
 */

public class DeleteTheMiddleNodeOfALinkedListSolution {
    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1, 3, 4, 7, 1, 2, 6});
        System.out.println("Default list: " + head);
        System.out.println("Result list: " + deleteMiddle(head));
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        if (head.next.next == null) {
            head.next = null;
            return head;
        }

        ListNode current = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            current = current.next;
            fast = fast.next.next;
        }

        current.next = current.next.next;

        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public static ListNode fromArray(int[] values) {
            if (values == null || values.length == 0) {
                return null;
            }
            ListNode head = new ListNode(values[0]);
            ListNode current = head;
            for (int i = 1; i < values.length; i++) {
                current.next = new ListNode(values[i]);
                current = current.next;
            }
            return head;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            while (current != null) {
                sb.append(current.val).append(" -> ");
                current = current.next;
            }
            sb.append("null");
            return sb.toString();
        }
    }
}