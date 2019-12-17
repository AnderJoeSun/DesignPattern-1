package com.aiyuba.datastructalgorithm.LinkLIst;

/**
 * Created by maoyujiao on 2019/10/29.
 */

public class Test {
    private ListNode addSum(ListNode l1, ListNode l2) {
        ListNode curNode = null;
        ListNode head = curNode;
        int jinwei = 0;
        while (l1.next != null && l2.next != null) {
            int mod = (l1.val + l2.val + jinwei)%10;
            jinwei = (l1.val + l2.val + jinwei) / 10;
            if (curNode == null) {
                curNode = new ListNode(mod);
            } else {
                curNode.next = new ListNode(mod);
            }
            curNode = curNode.next;
        }
        if(l1.next != null){
            curNode.next = l1.next;
        } else {
            curNode.next = l2.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
