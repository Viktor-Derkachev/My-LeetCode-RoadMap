package main.tasks.swapNodesInPairs;

import main.tasks.util.ListNode;

/*
24. Swap Nodes in Pairs

Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)


Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]


Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

Example 4:
Input: head = [1,2,3]
Output: [2,1,3]

Constraints:
The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100
 */
public class SwapNodesInPairsSolution {

    public static void main(String[] args) {

        ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4});
        ListNode head2 = ListNode.fromArray(new int[]{});
        ListNode head3 = ListNode.fromArray(new int[]{1});
        ListNode head4 = ListNode.fromArray(new int[]{1, 2, 3});

        System.out.println(">" + swapPairs(head));
        System.out.println(">" + swapPairs(head2));
        System.out.println(">" + swapPairs(head3));
        System.out.println(">" + swapPairs(head4));
    }


    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode current = dummy;
        ListNode first = current.next;
        ListNode second = current.next.next;

        first.next = second.next;
        second.next = first;
        dummy.next = second;
        current = first;

        while (current.next != null && current.next.next != null) {
            first = current.next;
            second = current.next.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }

        return dummy.next;
    }
}
