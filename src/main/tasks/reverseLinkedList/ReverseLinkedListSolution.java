package main.tasks.reverseLinkedList;

import main.tasks.util.ListNode;

/*
206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:

Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */
public class ReverseLinkedListSolution {
    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode head2 = ListNode.fromArray(new int[]{1, 2});
        ListNode head3 = ListNode.fromArray(new int[]{});

        System.out.println(reverseList(head));
        System.out.println(reverseList(head2));
        System.out.println(reverseList(head3));
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        if(head.next.next == null){
            ListNode newHead = head.next;
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        ListNode prev = head;
        ListNode current = head.next;
        prev.next = null;

        while(current.next != null){

            ListNode tmp = current.next;

            // 1 -> 2 -> 3
            // prev -> current -> tmp
            current.next = prev;
            //prev <- current tmp

            prev = current;
            current = tmp;
        }

        current.next = prev;

        return current;
    }
}
