package com.myedu.app;

public class DoublyLinkedList {
    private class Node<Item>{
        public Node prev;
        public Node next;
        public  Item data;
        public Node(Item item){
            data = item;
        }

    }
}
