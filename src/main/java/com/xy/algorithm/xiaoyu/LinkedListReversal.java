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

    static class DoubleNode{
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
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        return pre;
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

        System.out.println("---------  doubleLinkList  --------------");
        DoubleNode d_a = new DoubleNode(1);
        DoubleNode d_b = new DoubleNode(2);
        DoubleNode d_c = new DoubleNode(3);
        DoubleNode d_d = new DoubleNode(4);
        d_a.pre = null;
        d_a.next = d_b;
        d_b.pre = d_a;
        d_b.next = d_c;
        d_c.pre = d_b;
        d_c.next = d_d;
        d_d.pre = d_c;
        d_d.next = null;
        systemOut(d_a);
        DoubleNode d_ReNode = reversalDoubleLinkedList(d_a);
        System.out.println("--------------");
        systemOut(d_ReNode);

        System.out.println("---------  removeGivenValue  --------------");
        Node r_a = new Node(2);
        Node r_b = new Node(1);
        Node r_c = new Node(2);
        Node r_d = new Node(3);
        r_a.next = r_b;
        r_b.next = r_c;
        r_c.next = r_d;
        systemOut(r_a);
        Node r_r_aNode = deleteGivenValue(r_a, 2);
        System.out.println("--------------");
        systemOut(r_r_aNode);
    }

    public static void systemOut(Node node){
        while (node != null){
            System.out.println(node.value);
//            Node next = node.next;
//            node = next;
            node = node.next;
        }
    }

    public static void systemOut(DoubleNode node){
        while (node != null){
            System.out.println(node.value);
//            Node next = node.next;
//            node = next;
            node = node.next;
        }
    }

    public static Node deleteGivenValue(Node head, int value){
        while (head != null){
            if (head.value != value){
                break;
            }
            head = head.next;
        }

        //
        Node pre = head;
        Node cur = head;

        while (cur != null){
            if (cur.value == value){
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }



}
