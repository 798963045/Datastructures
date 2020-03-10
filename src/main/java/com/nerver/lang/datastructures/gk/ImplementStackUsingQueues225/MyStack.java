package com.nerver.lang.datastructures.gk.ImplementStackUsingQueues225;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyStack {

    private LinkedBlockingQueue<Integer> q1;
    private LinkedBlockingQueue<Integer> q2;

    private boolean init;

    /** Initialize your data structure here. */
    public MyStack() {
         q1 = new LinkedBlockingQueue();
         q2 = new LinkedBlockingQueue<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.size()==0&&q2.size()==0){
            q1.add(x);
            init = false;
            return;
        }

        if(q1.size()>0){
            q1.add(x);
        }
        if(q2.size()>0){
            q2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int temp = -1;
        if(q1.size()>0){
            while (q1.size()>0){
                temp = q1.poll();
                if(q1.size()>0){
                    q2.add(temp);
                }else {
                    return temp;
                }
            }
        }else {
            while (q2.size()>0){
                temp = q2.poll();
                if(q2.size()>0){
                    q1.add(temp);
                }else {
                    return temp;
                }
            }
        }
        return temp;
    }

    /** Get the top element. */
    public int top() {
        int temp = -1;
        if(q1.size()>0){
            while (q1.size()>0){
                temp = q1.poll();
                q2.add(temp);
                if(q1.size()==0){
                    return temp;
                }
            }
        }else {
            while (q2.size()>0){
                temp = q2.poll();
                q1.add(temp);
                if(q2.size()==0){
                    return temp;
                }

            }
        }
        return temp;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.size()==0&&q2.size()==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        /*MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top()); //3
        System.out.println(myStack.pop()); //3
        System.out.println(myStack.pop()); //2
        System.out.println(myStack.top()); //1
        System.out.println(myStack.empty()); //false
        System.out.println(myStack.pop()); //1
        System.out.println(myStack.empty()); //true*/

        MyStack myStack = new MyStack();
        myStack.push(1);
        System.out.println(myStack.pop());
        myStack.push(2);
        System.out.println(myStack.top());
    }
}
