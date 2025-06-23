package com.example.demodatastructure.queueIMP;

public class SingleLinkedListQue {
    class Node{
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            next = null;
        }
    }
    Node head = null;
    Node tail = null;


    void insertRearNode(int data) {
        Node newNode = new Node(data);
        if(head == null && tail== head) {
            head = tail =  newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void removeFront() {
        if(head == null) return;

        if(head == tail) {
            tail = null;
        }
        head = head.next;
    }

    void display() {
        if(head == null){
            System.out.println("Empty");
            return;
        }

        Node cur = head;
        while(cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

}
