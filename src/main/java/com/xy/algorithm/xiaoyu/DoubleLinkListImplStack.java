package com.xy.algorithm.xiaoyu;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 双向链表实现栈
 * 说明：栈结构先进后出
 */
public class DoubleLinkListImplStack<E> {

    DoubleNode<E> first;

    DoubleNode<E> last;

    /**
     * 双向链表
     * @param <E>
     */
    class DoubleNode<E> {
        E value;
        DoubleNode pre;
        DoubleNode next;

        DoubleNode(E value){
            this.value = value;
        }

        public DoubleNode() {

        }
    }

    public boolean add(E e){
        addFromBottom(e);
        return true;
    }

    public E pop(){
        return popFromBottom();
    }
    private void addFromBottom(E e){
        DoubleNode<E> cur = new DoubleNode<>(e);
        if(first == null){
            first = cur;
            last = cur;
        }else {
            cur.pre = last;
            last.next = cur;
            last = cur;
        }
    }

    private E popFromBottom(){
        if (first == null){
            return null;
        }

        DoubleNode<E> pre = last.pre;
        if (pre == null){
            E e = last.value;
            last = null;
            pre = null;
            return e;
        }
        last.pre = null;
        pre.next = null;
        return last.value;
    }

    public static class Mystack<E>{
        DoubleLinkListImplStack<E> node;
        Mystack(){
            node = new DoubleLinkListImplStack<E>();
        }

        public boolean add(E elem){
            return node.add(elem);
        }

        public E pop(){
            return node.pop();
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        System.out.println(stack.pop());

        Mystack<Integer> mystack = new Mystack<>();
        mystack.add(2);
        System.out.println(mystack.pop());
    }

}
