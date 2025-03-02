package main.tasks.palindromeLinkedList;

import main.tasks.util.ListNode;

/*
234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true
Example 2:

Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */
public class PalindromeLinkedListSolution {
    public static void main(String[] args) {
        ListNode head = ListNode.fromArray(new int[]{1,2,2,1});
        ListNode head2 = ListNode.fromArray(new int[]{1,2});
        ListNode head3 = ListNode.fromArray(new int[]{1,0,0});

        System.out.println(isPalindrome(head));
        System.out.println(isPalindrome(head2));
        System.out.println(isPalindrome(head3));
    }
    public static boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        if(head.next.next == null){
            return head.val == head.next.val;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while(slow != null){
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode left = head;
        ListNode rigth = prev;

        while(rigth != null && left != null){
            if(rigth.val != left.val){
                return false;
            }
            rigth = rigth.next;
            left = left.next;
        }

        return true;

    }
}
