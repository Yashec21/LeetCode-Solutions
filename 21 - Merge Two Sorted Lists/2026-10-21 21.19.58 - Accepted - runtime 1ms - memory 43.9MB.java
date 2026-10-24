/**
 * Definition for singly-linked list.
 * public class ListNode 
   {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode listMerg = null;
        ListNode temp = null;

        if(list1 == null)
        {
            return list2;
        }

        if(list2 == null)
        {
            return list1;
        }

        while(list2 != null && list1 != null)
        {
            ListNode newn = new ListNode();

            newn.next = null;
            newn.val = list1.val;

            if(list1.val < list2.val)
            {
                newn.val = list1.val;

                list1 = list1.next;
            }
            else
            {
                newn.val = list2.val;

                list2 = list2.next;
            }

            if(listMerg == null)   // Run only one's
            {
                listMerg = newn;
                temp = newn;
            }
            else
            {
                temp.next = newn;
                temp = newn;
            }
        }

        if(list1 != null)
        {
            temp.next = list1;
        }

        if(list2 != null)
        {
            temp.next = list2;
        }

        return listMerg;
    }
}