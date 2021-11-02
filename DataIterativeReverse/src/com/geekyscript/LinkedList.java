package com.geekyscript;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(size==0){
            head = tail = newNode;
        }
        else{
            newNode.next=head;
            head = newNode;
        }
        size++;
    }

    void display(){
        Node temp = head;
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    private Node getNodeAt(int idx){
        Node temp = head;
        for(int i = 0; i<idx; i++){
            temp = temp.next;
        }
        return temp;
    }

    void dataReverse(){
        int li = 0; //left index
        int ri = size-1; //right index
        while(li<ri){
            Node left = getNodeAt(li);//get the node at left index
            Node right = getNodeAt(ri);//get the node at right index

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            li++;
            ri--;
        }
    }
}
