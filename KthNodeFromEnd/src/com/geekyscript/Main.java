package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.insert(2);
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        ll.display();
        System.out.println("Without using size(k=2): "+ll.withoutSize(2));
        System.out.println("Using size(k=3): "+ll.withSize(3));
    }
}
