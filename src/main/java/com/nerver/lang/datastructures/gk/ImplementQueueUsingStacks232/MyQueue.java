package com.nerver.lang.datastructures.gk.ImplementQueueUsingStacks232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> out ;
    private Stack<Integer> in;

    /** Initialize your data structure here. */
    public MyQueue() {
         out = new Stack();
         in = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(out.empty()&!in.empty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        if(out.empty()){
            return -1;
        }else {
            return out.pop();
        }
    }

    /** Get the front element. */
    public int peek() {
        if(out.empty()&!in.empty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        if(out.empty()){
            return -1;
        }else {
            return out.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(in.empty()&&out.empty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());

    }
}