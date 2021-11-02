package com.geekyscript;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(size == 0){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void remove(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        else {
            Node temp = head;
            for (int i = 0; i < size-2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;
        }
    }

    void addAtIndex(int idx, int data){
        if(idx<0 || idx>size){
            System.out.println("Invalid");
                    return;
        }
        else if(idx==0){
            addFirst(data);
        }
        else if(idx==size){
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
            tail.next = temp;
            tail = temp;
        }
        else{
            Node prev = head;
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
            for(int i=0; i<idx-2; i++){
                prev = prev.next;
            }
            Node later = prev.next;
            prev.next = temp;
            temp.next = later;
        }
    }

    void display(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
