package com.xy.algorithm.xiaoyu;

import java.util.HashMap;

public class ReversalSingleList {

    class Node{
        final int value;
        Node next;
        public Node(int data){
            value = data;
        }
    }

    public Node reversalSingleList(Node head){
        Node pre = null;
        Node next = null;
        while (head.next != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap(16);
        map.put(1,2);
    }
}
