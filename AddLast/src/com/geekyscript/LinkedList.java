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

    void remove(){
        if(head==null){
            System.out.println("Underflow");
            return;
        }
        else{
            Node temp = head.next;
            head = temp;
            size--;
        }
    }

    int getElement(int index){
        Node temp = head;
        if(size==0){
            System.out.println("Empty list");
            return -1;
        }
        else if(index<0 || index>=size){
            System.out.println("Invalid");
            return -1;
        }
        else{
            for(int i = 0; i<index; i++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
}
