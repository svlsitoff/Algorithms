package com.myedu.app;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Queue<Integer> integerQueue = new Queue<>();
        for(int i = 0; i<120;i++){
            int t = random.nextInt(10000);
            integerQueue.enqueue(t);
        }
        while (!integerQueue.isEmpty()){
            System.out.println(integerQueue.dequeue());
        }
    }
}
