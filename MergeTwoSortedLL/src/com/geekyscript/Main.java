package com.geekyscript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter No. of elements of list1: ");
        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        System.out.println("Enter elements of list1");
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.insert(d);
        }
        l1.display();

        System.out.print("Enter No. of elements of list1: ");
        int n2 = Integer.parseInt(br.readLine());
        LinkedList l2 = new LinkedList();
        System.out.println("Enter elements of list2");
        String[] values2 = br.readLine().split(" ");
        for (int i = 0; i < n2; i++) {
            int d = Integer.parseInt(values2[i]);
            l2.insert(d);
        }
        l2.display();
        LinkedList merged = LinkedList.Merge(l1, l2);
        merged.display();
    }
}
