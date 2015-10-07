package leetcode143;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import basic.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        ListNode vhead = new ListNode(-1);
        vhead.next = head;
        ListNode pslow = vhead;
        ListNode pfast = vhead.next.next;
        while(pfast!=null&&pfast.next!=null){
        	pslow = pslow.next;
        	pfast = pfast.next.next;
        }
        Queue<Integer> a = new LinkedList<Integer>();
        Set<String> t = new HashSet<String>();
        char c[] = new char[2];
        String s = new String(c);
    }
}
