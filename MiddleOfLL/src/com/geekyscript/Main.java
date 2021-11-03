package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.insert(2);
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        //ll.insert(10);
        ll.display();
        System.out.println("Mid: "+ll.mid());


    }
}
