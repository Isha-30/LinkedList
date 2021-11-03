package com.geekyscript;

public class LinkedList {
    Node head;
    int size;

    void push(int data){//add in the beginning of linked list
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head!=null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    void pop(){//remove from the beginning of linked list
        if(size==0){
            System.out.println("Stack underflow");
            return;
        }
        head = head.next;
        size--;
    }

    boolean isEmpty(){
        return size==0;
    }

    int peek(){
        return head.data;
    }

    void display(){
        Node temp = head;
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
