package com.xy.algorithm.xiaoyu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现栈结构
 * 说明：
 *     队列：先进先出
 *      栈：先进后出
 * @param <E>
 */
public class TwoQueueImplStack<E> {

    private Queue<E> pushQueue;

    private Queue<E> popQueue;

    public TwoQueueImplStack(){
        pushQueue = new LinkedList<>();
        popQueue = new LinkedList<>();
    }

    // a -> b -> c
    // c -> b -> a
    public boolean push(E e){
        pushToPushQueue(e);
        return true;
    }

    private void pushToPushQueue(E e){
        pushQueue.add(e);
    }

    public E pop(){
        return popFromPopQueue();
    }

    private E popFromPopQueue(){
        while (pushQueue.size() > 1){
            popQueue.add(pushQueue.poll());
        }
        E result = pushQueue.poll();
        Queue<E> tmp = popQueue;
        popQueue = pushQueue;
        pushQueue = tmp;
        return result;
    }

    public static void main(String[] args) {
        TwoQueueImplStack<Integer> twoQueueImplStack = new TwoQueueImplStack();
        twoQueueImplStack.push(1);
        twoQueueImplStack.push(2);
        twoQueueImplStack.push(3);

        System.out.println(twoQueueImplStack.pop());
        System.out.println(twoQueueImplStack.pop());
        System.out.println(twoQueueImplStack.pop());
    }
}
