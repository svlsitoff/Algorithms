package com.myedu.app;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        TempStack<Integer> a;
        a = new TempStack<Integer>(100);
        for (int i=0;i<120;i++){
            int ranInt = random.nextInt(1000);
            a.Push(ranInt);
        }
        for(int j =0;j<a.size();j++) {
            int item = a.pop();
            System.out.println(a.pop());
        }
    }
}
