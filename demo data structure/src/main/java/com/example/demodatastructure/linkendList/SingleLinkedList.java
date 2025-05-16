package com.example.demodatastructure.linkendList;

public class SingleLinkedList {

    Link head;

    void addLink(int data) {
        Link newLink = new Link(data);
        if(head == null) {
            head = newLink;
        } else {
            newLink.next = head;
            head = newLink;
        }

    }

    void printList() {
        if(head == null) return;
        Link temp = head;
        while(temp != null) {
            System.out.println("temp--  "+ temp.val);
            temp = temp.next;
        }
    }

    Link reverse() {
        if(head == null || head.next == null ) return head;

        Link temp = null;
        Link pre = null;
        Link cur = head;

        while(cur != null) {
          temp = cur.next;
            cur.next = pre;
            pre = cur;        // Move prev forward
            cur = temp;
        }
        head = pre; // Update head to new front
        return head;

    }
}
