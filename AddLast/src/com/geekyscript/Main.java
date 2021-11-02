package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println("Size original: "+ll.size);
        ll.display();

        ll.remove();
        ll.remove();

        ll.display();
        System.out.println("Size after removing nodes: "+ll.size);
        System.out.println(ll.getElement(0));
    }
}
