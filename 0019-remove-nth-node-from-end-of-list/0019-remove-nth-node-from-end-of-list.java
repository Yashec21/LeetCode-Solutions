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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head == null)
        {
            return head;
        }

        ListNode temp = head;
        ListNode temp2 = head;

        int count = 0;

        while(temp != null)
        {
            count++;
            temp = temp.next;
        }

        count = count - n;

        if(count == 0)
        {
            return head.next;
        }

        temp2 = head;

        while(count != 1)
        {
            temp2 = temp2.next;
            count--;
        }

        temp2.next = temp2.next.next;

        return head;

    }
}