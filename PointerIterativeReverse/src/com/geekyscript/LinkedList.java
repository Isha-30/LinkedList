package com.geekyscript;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int data){
        Node newNode = new Node();
        newNode.data = data ;
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
        Node temp = head;
        if(head== null){
            System.out.println("Empty list");
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

    void pointerReverse(){
        Node prev = null;
        Node curr = head;

        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //Swap head and tail
        Node n = head;
        head = tail;
        tail = n;
    }
}
