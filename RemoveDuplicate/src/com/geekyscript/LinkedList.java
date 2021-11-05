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

    public void removeDuplicate(){
        LinkedList result = new LinkedList();

        while(this.size>0){
            int val = this.getFirst();
            this.removeFirst();

            Node temp = result.head;
            int flag = 0;
            if(result.size== 0) result.addLast(val);
            while(temp!=null){
                if(temp.data==val){
                    flag=1;//flag = 1 means element is not in result
                    break;
                }
                temp = temp.next;
            }
            if(flag==1) result.addLast(val);
        }
        this.head = result.head;
        this.tail = result.tail;
        this.size = result.size;
        //return result;
    }
}
