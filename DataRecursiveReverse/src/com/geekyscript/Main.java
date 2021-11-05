package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("Original ll: ");
        ll.display();
        ll.DRreverse();
        System.out.println("Reversed ll: ");
        ll.display();
    }
}
