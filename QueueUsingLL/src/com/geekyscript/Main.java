package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Q_LinkedList queue = new Q_LinkedList();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println("Queue after enQueue:");
        queue.display();

        queue.deQueue();
        System.out.println("Queue after deQueue:");
        queue.display();

        System.out.println("Front of Queue: "+queue.peek() );


        System.out.println("Size: "+queue.Qsize());

    }
}
