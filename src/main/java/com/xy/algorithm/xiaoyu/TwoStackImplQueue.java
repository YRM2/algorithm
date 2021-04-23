package com.xy.algorithm.xiaoyu;

import java.util.Stack;

/**
 * 两个栈实现队列
 * 说明：栈：先进后出
 *      队列：先进先出
 */
public class TwoStackImplQueue<E> {

    private Stack<E> pushStack;

    private Stack<E> popStack;

    public TwoStackImplQueue(){
        pushStack = new Stack<>();
        popStack = new Stack<>();
    }

    public boolean push(E e){
        pushToPushStack(e);
        return true;
    }

    private void pushToPushStack(E e){
        pushStack.push(e);
    }

    public E pop(){
        return popFromPopStack();
    }

    private E popFromPopStack(){
        if (popStack.isEmpty()){
            pushStackToPopStack();
        }
        return popStack.pop();
    }


    private void pushStackToPopStack(){
        while (pushStack.size() > 0){
            popStack.push(pushStack.pop());
        }
    }


    public static void main(String[] args) {
        TwoStackImplQueue<Integer> twoStackImplQueue = new TwoStackImplQueue();
        twoStackImplQueue.push(10);
        twoStackImplQueue.push(1);
        twoStackImplQueue.push(2);
        twoStackImplQueue.push(3);
        twoStackImplQueue.push(4);
        twoStackImplQueue.push(5);


        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
    }
}
