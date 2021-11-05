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
        int flag = 0;
        while(this.size>0){
            int val = this.getFirst();
            this.removeFirst();

            if(result.size==0) result.addLast(val);
            else{
                Node temp = result.head;
                for(int i = 0; i<result.size; i++){
                    if(temp.data == val){
                        flag=1;
                        break;
                    }
                    temp = temp.next;
                }
                if(flag==0) result.addLast(val);
            }
        }
        this.head = result.head;
        this.tail = result.tail;
        this.size = result.size;
        //return result;
    }
}
