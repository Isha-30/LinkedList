package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println("Original linked list: ");
        ll.display();
        ll.dataReverse();
        System.out.println("Reversed linked list: ");
        ll.display();
    }
}
