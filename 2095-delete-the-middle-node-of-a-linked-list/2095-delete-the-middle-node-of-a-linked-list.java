/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode deleteMiddle(ListNode head) 
    {
        if (head == null)
        {
            return head;
        }

        if (head.next == null)
        {
            return null;
        }

        int count = 0;

        ListNode temp = head;
        ListNode prev = head;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        count = count / 2;

        while(count != 1)
        {
            prev = prev.next;
            count--;
        }

        prev.next = prev.next.next;

        return head;
    }
}