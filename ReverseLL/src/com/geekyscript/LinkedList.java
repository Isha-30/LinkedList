package com.geekyscript;

public class LinkedList {
    Node head;
    Node tail;
    int size = 0;

    void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head==null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void display(){
        if(head==null)return;

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void ReverseHelper(Node node){
        if(node==null)return;
        ReverseHelper(node.next);
        System.out.print(node.data +"->");
    }

    public void reverse(){
        ReverseHelper(head);
        System.out.println("null");
    }
}
