package com.example.demodatastructure.linkendList;

import com.example.demodatastructure.linkendList.SingleLinkedList;

import java.util.Stack;

public class LeetcodeTest {

    public static void main(String[] args) {
        Link singleLinkedList = new Link(1);
        Link singleLinkedList1 = new Link(2);
        Link singleLinkedList2 = new Link(3);
        Link singleLinkedList3 = new Link(4);
        Link singleLinkedList4 = new Link(5);
        singleLinkedList.next = singleLinkedList1;
        singleLinkedList1.next = singleLinkedList2;
        singleLinkedList2.next= singleLinkedList3;
        singleLinkedList3.next = singleLinkedList4;

        print(singleLinkedList);
        System.out.println(" ----------------------- ");
        reorderList(singleLinkedList);
        print(singleLinkedList);
    }

    static public void reorderList(Link head) {
        Stack<Link> st = new Stack<>();
        Link temp = head;

        while(temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        if(st.size() < 3) return;

        Link cur = head;
        Link stNode = null;

        while(cur != null) {
            if(!st.isEmpty()) {
                stNode = st.pop();
            }

            if(stNode.val == cur.val) {
                cur.next = null;
                break;
            }else {
                stNode.next = cur.next;
                cur.next = stNode;
                cur = stNode.next;
            }

        }

    }

    static void print(Link head){
        Link temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
