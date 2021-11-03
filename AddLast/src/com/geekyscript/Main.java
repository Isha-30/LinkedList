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
        ll.removeAtIndex(2);
        System.out.println("List after removing at index: ");
        ll.display();

        ll.remove();
        System.out.println("List after removing normally: ");
        ll.display();
        System.out.println("Size after removing nodes: "+ll.size);
        System.out.println("Element at given index: "+ll.getElement(0));
    }
}
