package com.xy.algorithm.xiaoyu;

import java.util.Stack;

/**
 * 数组实现栈结构
 * 说明：栈 为先进后出
 */
public class ArrayImplStack<E> {

    private Object[] elemData;

    private int elemCount;

    private int maxCount;

    public ArrayImplStack(int maxCount){
        this.maxCount = maxCount;
        elemData = new Object[maxCount];
    }

    public boolean push(E e){
        addElem(e);
        return true;
    }

    private void addElem(E e){
        if (elemCount >= maxCount){
            throw new RuntimeException("栈满了");
        }
        elemData[elemCount] = e;
        elemCount++;
    }

    public E pop(){
        if (elemCount == 0){
            throw new RuntimeException("栈空了");
        }
        E e = (E) elemData[elemCount - 1];
        elemCount--;
        return e;
    }

    public static void main(String[] args) {
        Stack<Integer>  stack = new Stack<>();
        stack.push(2);
        System.out.println(stack.pop());

        System.out.println("------------------------");

        ArrayImplStack<Integer> arrayImplStack = new ArrayImplStack(3);
        arrayImplStack.push(1);
        arrayImplStack.push(2);
        arrayImplStack.push(3);
        System.out.println(arrayImplStack.pop());
        System.out.println(arrayImplStack.pop());
        System.out.println(arrayImplStack.pop());
        try {
            System.out.println(arrayImplStack.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
