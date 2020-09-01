package com.nerver.lang.datastructures.zoo.lat2.a155;

public class MinStack {

    Node head;

    public void push(int x){
        if(head==null){
            head = new Node(x,x);
        }else {
            head = new Node(x,Math.min(x,head.min),head);
        }

    }
    public void pop(){
        head = head.next;
    }
    public int top(){
        return head.val;
    }
    public int getMin(){
        return head.min;
    }

    public static void main(String[] args) {
        System.out.println(1111);
    }



}

class Node{
    int val;
    int min;
    Node next;
    public Node(int val,int min){
        this.val = val;
        this.min= min;
        this.next = null;
    }
    public Node(int val,int min,Node next){
        this.val = val;
        this.min = min;
        this.next = next;
    }

}