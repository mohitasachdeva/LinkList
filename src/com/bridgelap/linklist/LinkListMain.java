package com.bridgelap.linklist;

public class LinkListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked List");
        LinkList<Integer> linkedList1 = new LinkList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.print();
        System.out.println();

    }
}
