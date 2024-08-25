class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d = new ListNode();  
        ListNode temp = d;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;  
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return d.next;  
    }
}

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

//LINK: https://leetcode.com/problems/merge-two-sorted-lists/description/