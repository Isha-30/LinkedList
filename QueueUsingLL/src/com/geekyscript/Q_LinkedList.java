package com.geekyscript;

public class Q_LinkedList {
    Node front;//head of linked list
    Node rear;//tail of linked list
    int size;

    void enQueue(int data){//add at last in linked list
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(size==0){
            front=rear=newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void deQueue(){//remove from beginning of linked list
        if(size==0){
            System.out.println("Queue underflow");
            return;
        }
        else{
            front  = front.next;
            size--;
        }
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return front.data;
        }
    }

    void display(){
        Node temp = front;
        if(size==0){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp =temp.next;
            }
            System.out.println();
        }
    }

    int Qsize(){
        return size;
    }
}
