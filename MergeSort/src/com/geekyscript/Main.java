package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList ll = new LinkedList();
        ll.insert(12);
        ll.insert(2);
        ll.insert(28);
        ll.insert(62);
        ll.insert(32);

        LinkedList sorted = ll.MergeSort(ll.head, ll.tail);
        sorted.display();
    }
}
