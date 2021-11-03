package com.geekyscript;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(size==0)
            head = tail = newNode;
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void display(){
        if(size==0) {
            System.out.println("Empty list");
            return;
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    int mid(){
        Node s = head;
        Node f = head;

        while(f.next!=null && f.next.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s.data;
    }

}
