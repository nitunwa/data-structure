package com.example.demodatastructure.linkendList;

public class Runner {
    public static void main(String[] args) {
        // 1. Create a Doubly Linked List


        DoubleLinkedList1To4 dbl = new DoubleLinkedList1To4();
        DoubleLinkedList1To4 dbl2 = new DoubleLinkedList1To4();

        DoubleLinkedList1To4 list1 = new DoubleLinkedList1To4();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        createLoop(list1.head);

        Node res = list1.detectAndRemoveLoop();
        list1.printForward();

        DoubleLinkedList1To4 list2 = new DoubleLinkedList1To4();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        // dbl2.append(10);
        // dbl2.append(30);
        /*dbl2.prepend(20);
        dbl2.prepend(200);*/

        // dbl.append(10);
            // dbl.append(39);
            // dbl.append(40);
        // dbl.append(10);




        // Node res = DoubleLinkedList1To4.mergeDDLList(list1.head, list2.head);

        // dbl.addNodeAtGivenPosition(100, 3);
        // dbl.deleteNodeByValue(30);

        dbl.printForward();
        // dbl.reviseDoubleLinkedList();
        // boolean res = dbl.checkDDLPalindrome();
        // System.out.println(res);
        System.out.println(" ------------------- ");
        //System.out.println(res.value);

        // dbl.printBackward();
    }

    static void createLoop(Node head){
        Node cur = head;
        while(cur != null && cur.next != null) {
            cur = cur.next;
        }

        Node newNode = head.next;
        cur.next = newNode;
    }
}

/* 1. Create a Doubly Linked List
   2. Insert at the Beginning
   3. Insert at the End
   4. Insert After a Given Node
   5. Delete a Node by Value
   6. Delete a Node at a Given Position
   7. Traverse Forward and Backward
   8. Find the Length of the List
   9. Reverse the Doubly Linked List
   10. Check if the List is a Palindrome
   11. Convert Doubly Linked List to Array
Problem: Convert the doubly linked list into a Java array.

✅ 12. Merge Two Sorted Doubly Linked Lists
Problem: Merge two sorted doubly linked lists into one sorted doubly linked list.

✅ 13. Remove Duplicates from a Sorted DLL
Problem: Remove all duplicate nodes from a sorted doubly linked list.

✅ 14. Find the Middle Node
Problem: Find and return the middle node of the list using two pointers.

✅ 15. Detect and Remove Loop (Advanced)
*
* */
