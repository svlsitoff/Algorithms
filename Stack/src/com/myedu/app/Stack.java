package com.myedu.app;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{

    private Node first;
    //стек содержит массив обьектов ссылочного типа
    //число отражающее размер массива
    private  int N;

    public boolean IsEmplty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    //При помещении элемнта в массив
    //если его первоначальный размер превышен
    //длина увеличивается в два раза
    public void Push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    //при уменьшении размера массива
    //крайнему элементу присваивается
    // null и если есьвозможность дли
    // нассива уменьшается в два раза
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{

        private  Node current = first;
        @Override
        public boolean hasNext(){return current!=null;}
        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return  item;
        }

    }
    private class  Node{
        Item item;
        Node next;
    }

}
