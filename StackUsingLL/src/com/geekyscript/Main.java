package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        System.out.println("Original Stack: ");
        ll.display();

        ll.pop();
        System.out.println("Stack after pop: ");
        ll.display();
        System.out.println("Is stack empty: "+ll.isEmpty());
        System.out.println("Top of Stack: "+ll.peek());

    }
}
