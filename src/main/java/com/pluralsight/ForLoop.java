package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 11; i += 1) {
            Thread.sleep(1000);
            if (i < 10) {
                System.out.println(10 - i);
            } else {
                System.out.println("Launch!");
            }
        }
    }
}
