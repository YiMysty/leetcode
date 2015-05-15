package leetcode2;

import basic.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode ptr = head;
        int cur = 0;
        while(l1!=null&&l2!=null){
            int num = l1.val+l2.val+cur;
            cur = num/10;
            ListNode l = new ListNode(num%10);
            ptr.next = l;
            ptr = ptr.next;
            l1 = l1.next;
            l2 = l2.next;
            
        }
        while(l1!=null){
            int num = l1.val+cur;
            cur = num/10;
            ListNode l = new ListNode(num%10);
            ptr.next = l;
            ptr = ptr.next;
            l1 = l1.next;
        }while(l2!=null){
            int num = l2.val+cur;
            cur = num/10;
            ListNode l = new ListNode(num%10);
            ptr.next = l;
            ptr = ptr.next;
            l2 = l2.next;
        }
        if(cur==1)
            ptr.next = new ListNode(1);
        return head.next;
    }
}