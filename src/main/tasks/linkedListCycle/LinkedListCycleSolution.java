package main.tasks.linkedListCycle;

import main.tasks.util.ListNode;

/*
141. Linked List Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again
by continuously following the next pointer. Internally, pos is used to denote the index of the
node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */
public class LinkedListCycleSolution {

    public static void main(String[] args) {

        ListNode head = ListNode.fromArray(new int[]{3, 2, 0, -4});
        head.next.next.next = head.next;

        ListNode head2 = ListNode.fromArray(new int[]{1, 2});
        head2.next = head2;

        ListNode head3 = ListNode.fromArray(new int[]{1});

        System.out.println(hasCycle(head));
        System.out.println(hasCycle(head2));
        System.out.println(hasCycle(head3));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
