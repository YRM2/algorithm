package com.xy.algorithm.xiaoyu;

import java.util.HashMap;

public class LinkedListReversal {

    static class Node{
        int value;
        Node next;

        Node(int data){
            this.value = data;
        }
    }

    class DoubleNode{
        int value;
        DoubleNode pre;
        DoubleNode next;

        DoubleNode(int data){
            this.value = data;
        }
    }

    // a -> b -> c -> d -> null
    // d -> c -> b -> a -> null
    public static Node reversalSingleLinkedList(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static DoubleNode reversalDoubleLinkedList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null){
            next = head.next;

        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, 1);

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        systemOut(a);

        Node reNode = reversalSingleLinkedList(a);
        System.out.println("----------------");
        systemOut(reNode);
    }

    public static void systemOut(Node node){
        while (node != null){
            System.out.println(node.value);
//            Node next = node.next;
//            node = next;
            node = node.next;
        }
    }


}
