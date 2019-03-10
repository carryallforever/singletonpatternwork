package com.pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
