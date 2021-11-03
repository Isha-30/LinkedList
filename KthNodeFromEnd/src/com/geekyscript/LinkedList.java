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

    int withSize(int k){
        if(k<0 || k>=size){
            System.out.println("Invalid");
            return -1;
        }
        else{
           Node temp = head;
           for(int i = 0; i<size-k; i++){
               temp = temp.next;
           }
           return temp.data;
        }
    }

    int withoutSize(int k){
        Node s = head;//slow
        Node f = head;//fast

        for(int i = 0; i<k; i++){
            f = f.next;//increment fast till k from beginning
        }

        while(f!=null){//increment both slow and fast keeping the gap same
            s = s.next;
            f = f.next;
        }
        return s.data;
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
}
