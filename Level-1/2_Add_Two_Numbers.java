
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t= new ListNode(0);
        ListNode d=t;
        int ca=0;
        while(l1!=null || l2!=null || ca!=0){
            int sum=ca;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            d.next=new ListNode(sum%10);
            ca=sum/10;
            d=d.next;
        }
        return t.next;
    }
}


// Input: l1 = [2,4,3], l2 = [5,6,4]
// Output: [7,0,8]
// Explanation: 342 + 465 = 807.


//LINK: https://leetcode.com/problems/add-two-numbers/description/