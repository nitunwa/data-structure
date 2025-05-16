package com.example.demodatastructure.linkendList;

public class LinkMain {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLink(10);
        singleLinkedList.addLink(100);
        singleLinkedList.addLink(1000);
        singleLinkedList.reverse();

        singleLinkedList.printList();
    }
}
