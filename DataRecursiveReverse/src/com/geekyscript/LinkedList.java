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
    Node rleft;
    private void DRhelper(Node right, int floor){
        if(right==null)return;

        DRhelper(right.next, floor+1);

        if(floor >= size/2){
            int temp = right.data;
            right.data = rleft.data;
            rleft.data = temp;

            rleft = rleft.next;
        }
    }

    public void DRreverse(){
        rleft = head;
        DRhelper(head, 0);
    }
}
