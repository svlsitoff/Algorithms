package com.myedu.app;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> a = new Stack<Integer>();
        for (int i=0;i<120;i++){
            int ranInt = random.nextInt(100000);
            a.Push(ranInt);
        }
        for(int j =0;j<a.size();j++) {
            System.out.println(a.pop());
        }
    }
}
