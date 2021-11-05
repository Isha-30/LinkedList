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

    void removeFirst(){
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

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public void kReverse(int k){
        LinkedList prev = null;
        while(this.size>0){
            LinkedList curr = new LinkedList();

            if(this.size>=k){
                for(int i = 0; i<k; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addFirst(val);
                }
            }
            else{
                int rmgSize = this.size;//size of remaining list
                for(int i = 0; i<rmgSize; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addLast(val);
                }
            }
            if(prev==null){
                prev = curr;
            }
            else{
                prev.tail.next = curr.head;
                prev.tail = curr.tail;
                prev.size = prev.size+curr.size;
            }
        }
        this.head = prev.head;
        this.tail = prev.tail;
        this.size = prev.size;
    }
}
