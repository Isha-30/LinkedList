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

    public int getFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        } else {
            return head.data;
        }
    }

    public void OddEven(){
        LinkedList Odd = new LinkedList();
        LinkedList Even = new LinkedList();

        while(this.size>0){
            int val = this.getFirst();
            this.removeFirst();

            if(val%2==0){
                Even.addLast(val);
            }
            else{
                Odd.addLast(val);
            }
        }
        if(Odd.size>0 && Even.size>0){
            Odd.tail.next = Even.head;
            this.head = Odd.head;
            this.tail = Even.tail;
            this.size = Odd.size + Even.size;
        }

        else if(Odd.size>0){
            this.head = Odd.head;
            this.tail = Odd.tail;
            this.size = Odd.size;
        }

        else if(Even.size>0){
            this.head = Even.head;
            this.tail = Even.tail;
            this.size = Even.size;
        }
    }
}
