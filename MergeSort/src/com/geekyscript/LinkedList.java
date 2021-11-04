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

    public static Node mid(Node head, Node tail){
        Node s = head;
        Node f = head;

        while(f.next!=tail && f.next.next!=tail){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static LinkedList Merge(LinkedList l1, LinkedList l2){
        Node list1 = l1.head;
        Node list2 = l2.head;
        LinkedList result = new LinkedList();
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                result.insert(list1.data);
                list1 = list1.next;
            }
            else{
                result.insert(list2.data);
                list2 = list2.next;
            }
        }
        while(list1!=null){
            result.insert(list1.data);
            list1 = list1.next;
        }
        while(list2!=null){
            result.insert(list2.data);
            list2 = list2.next;
        }
        return result;
    }

    public static LinkedList MergeSort(Node head, Node tail){
        if(head==tail){
            LinkedList single = new LinkedList();
            single.insert(head.data);
            return single;
        }

        Node midNode = mid(head, tail);
        LinkedList left = MergeSort(head, midNode);
        LinkedList right = MergeSort(midNode.next, tail);
        LinkedList result = LinkedList.Merge(left, right);
        return result;
    }
}
