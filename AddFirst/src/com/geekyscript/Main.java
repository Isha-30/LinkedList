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
        System.out.println();
        ll.display();
        ll.remove();
        ll.display();
        ll.addAtIndex(4, 100);
        ll.display();
    }
}
