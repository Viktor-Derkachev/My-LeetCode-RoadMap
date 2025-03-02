package main.tasks.removeDuplicatesFromSortedList;
/*
83. Remove Duplicates from Sorted List

Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.

Example 1:

Input: head = [1,1,2]
Output: [1,2]
Example 2:

Input: head = [1,1,2,3,3]
Output: [1,2,3]

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 */

import main.tasks.util.ListNode;

public class RemoveDuplicatesFromSortedListSolution {
    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1, 1, 2});
        ListNode head2 = ListNode.fromArray(new int[]{1, 1, 2, 3, 3});

        System.out.println(deleteDuplicates(head));
        System.out.println(deleteDuplicates(head2));
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            while (nextNode != null && current.val == nextNode.val) {
                nextNode = nextNode.next;
            }
            current.next = nextNode;
            current = current.next;
        }

        return head;
    }
}
