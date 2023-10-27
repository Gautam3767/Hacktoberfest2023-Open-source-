// Node class to define the structure of each node in the linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // corner case check
        if (headA == null || headB == null) return null;

        // define two pointers
        ListNode pA = headA, pB = headB;

        // keep iterating until they meet
        while (pA != pB) {
            // if pointer pA reaches the end of list A, redirect it to the head of list B
            pA = pA == null ? headB : pA.next;

            // if pointer pB reaches the end of list B, redirect it to the head of list A
            pB = pB == null ? headA : pB.next;
        }

        // return either one of pA or pB, since pA == pB
        return pA;
    }
}
