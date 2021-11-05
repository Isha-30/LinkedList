package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList l1 = new LinkedList();
        l1.addLast(2);
        l1.addLast(4);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(1);

        l1.removeDuplicate();
        l1.display();
    }
}
