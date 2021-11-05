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

    private void PRhelper(Node node){
        if(node==null)return;
        PRhelper(node.next);
        if(node==tail){
            //continue
        }
        else{
            node.next.next = node;
        }
    }

    public void PRreverse(){
        PRhelper(head);
        head.next = null;
        Node temp = head;
        head = tail;
        tail = temp;
    }
}
