package com.geekyscript;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter no. of elements: ");
        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        System.out.print("Enter elements: ");
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }
        System.out.print("Enter value of k: ");
        int k = Integer.parseInt(br.readLine());

        l1.kReverse(k);
        l1.display();
    }
}
