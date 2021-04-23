package com.xy.algorithm.xiaoyu;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 双向链表实现队列
 * 说明：队列为先进先出
 * @param <T>
 */
public class DoubleLinkListImplQueue<T> {

    DoubleNode<T> head;
    DoubleNode<T> tail;

    class DoubleNode<T>{
        T value;

        DoubleNode<T> pre;
        DoubleNode<T> next;

        DoubleNode(T value){
            this.value = value;
        }
    }

    public boolean add(T value){
        addFromBottom(value);
        return true;
    }

    private void addFromBottom(T value){
        DoubleNode<T> doubleNode = new DoubleNode<>(value);
        if (head == null){
            head = doubleNode;
            tail = doubleNode;
        } else {
            tail.next = doubleNode;
            doubleNode.pre = tail;
            tail = doubleNode;
        }
    }

    public T pop(){
        return popFromHead();
    }

    private T popFromHead(){
        if (head == null){
            return null;
        }
        T value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }else {
            head.pre = null;
        }
        return value;
    }

    public static class MyQueue<T>{
        DoubleLinkListImplQueue<T> doubleLinkListImplQueue;

        MyQueue(){
            doubleLinkListImplQueue = new DoubleLinkListImplQueue<T>();
        }

        public boolean add(T value){
            return doubleLinkListImplQueue.add(value);
        }

        public T pop(){
            return doubleLinkListImplQueue.pop();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(2);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(2);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
