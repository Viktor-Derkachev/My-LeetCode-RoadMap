package main.tasks.removeNthNodeFromEndofList;

import main.tasks.util.ListNode;

/*
19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz

 */
public class RemoveNthNodeFromEndOfListSolution {
    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode head2 = ListNode.fromArray(new int[]{1});
        ListNode head3 = ListNode.fromArray(new int[]{1, 2});

        System.out.println(removeNthFromEnd(head, 2));
        System.out.println(removeNthFromEnd(head2, 1));
        System.out.println(removeNthFromEnd(head3, 1));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
