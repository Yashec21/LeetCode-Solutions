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
    public ListNode sortList(ListNode head) 
    {
        if(head == null)
        {
            return head;
        }

        if(head.next == null)
        {
            return head;
        }

        int count = 0;
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode temp3 = head;

        while (temp != null)
        {
            count++;
            temp = temp.next;
        }

        int arr[] = new int[count];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = temp2.val;
            temp2 = temp2.next;
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++)
        {
            temp3.val = arr[i];
            temp3 = temp3.next;
        }

        return head;

    }
}