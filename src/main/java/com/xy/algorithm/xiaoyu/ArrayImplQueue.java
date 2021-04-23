package com.xy.algorithm.xiaoyu;

/**
 * 数组实现队列
 * 说明：队列为先进先出
 */
public class ArrayImplQueue<E> {

    private Object[] elemData;

    private int maxSize;

    private int elemCount;

    private int pushIndex;

    private int popIndex;

    public ArrayImplQueue(int maxSize){
        this.maxSize = maxSize;
        elemData = new Object[maxSize];
        elemCount = 0;
        pushIndex = 0;
        popIndex = 0;
    }

    public void push(E e){
        if (maxSize == elemCount){
            throw new RuntimeException("队列已满");
        }
        elemData[pushIndex] = e;
        pushIndex = nextIndex(pushIndex);
        elemCount++;
    }

    public E pop(){
        if (elemCount == 0) {
            throw new RuntimeException("队列空了");
        }
        E e = (E) elemData[popIndex];
        popIndex = nextIndex(popIndex);
        elemCount--;
        return e;
    }

    private int nextIndex(int i){
        return i >= maxSize - 1 ? 0 : i+1;
    }

    public static void main(String[] args) {
        ArrayImplQueue arrayImplQueue = new ArrayImplQueue(3);
        arrayImplQueue.push(1);
        arrayImplQueue.push(2);
        arrayImplQueue.push(3);

        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
    }

}
