package com.xy.algorithm.xiaoyu;

import java.util.Stack;

public class GetMinStack {

    public static class MyStack{

        private Stack<Integer> stackData;

        private Stack<Integer> stackMin;

        public MyStack(){
            stackData = new Stack<>();
            stackMin = new Stack<>();
        }

        public void push(Integer value){
            if (this.stackMin.isEmpty()){
                this.stackMin.push(value);
            }else if (this.getMin() < value){
                this.stackMin.push(getMin());
            }else {
                this.stackMin.push(value);
            }
            this.stackData.push(value);
        }

        public Integer pop(){
            if (this.stackData.isEmpty()){
                throw new RuntimeException("栈空了（liao）");
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }

        public Integer getMin(){
            if (this.stackMin.isEmpty()){
                throw new RuntimeException("空栈");
            }
            return this.stackMin.peek();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(2);

        System.out.println(myStack.getMin());

        myStack.pop();

        System.out.println(myStack.getMin());

        myStack.pop();

        System.out.println(myStack.getMin());
    }
}
