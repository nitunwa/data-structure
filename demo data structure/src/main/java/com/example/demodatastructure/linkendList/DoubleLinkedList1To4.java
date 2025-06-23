package com.example.demodatastructure.linkendList;
// two ways DoubleLinkedList can be created. 1. append() 2. prepend();
// Two ways DoubleLinkedList can be traversed. forward() backward()
public class DoubleLinkedList1To4 {
    Node head;
    Node tail;

    // 3. Insert at the End
    void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail= newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

    }

    //  2. Insert at the Beginning
    void prepend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void printForward() {
        Node curr = head;
        while(curr != null) {
            System.out.println(" forward data "+ curr.value);
            curr = curr.next;
        }
    }

    void printBackward() {
        Node curr = tail;
        while(curr != null) {
            System.out.println("Print backward "+ curr.value);
            curr = curr.prev;
        }
    }

    // 4. Insert After a Given Node
    void addNodeAtGivenPosition(int data, int position) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        if(position == 1) {
            newNode.next = head.next;
            head.next.prev = newNode;
            head = newNode;
        } else {
            int idx = 1;
            Node cur = head;
            while(idx < position && cur != null) {
                cur = cur.next;
                idx++;
            }

            if(cur != null) {
                newNode.next = cur.next;
                cur.prev.next = newNode;

            }

        }
    }

    // Delete a Node at a Given Position
    void  deleteNodeAtGivenPosition(Node input) {
        if(head == null) return;

        // single node
        if(head == input && head == tail){
            head= tail = null;
        } else if(head == input) {
            if(head.next != null) {
                head.next.prev = head.prev;
            }
            head = head.next;
        } else if(tail == input) {
            tail.prev.next = tail.next;
            tail = tail.prev;
        } else {
            input.prev.next = input.next;
            input.next.prev = input.prev;
        }

        // head needs to delete
        /*if(head == input) {
            if(head.next != null) {
                head.next.prev = head.prev;
            }
            head = head.next;
        }*/

        // tail needs to delete
        /*if(tail == input) {
            tail.prev.next = tail.next;
            tail = tail.prev;
        }*/

        // middle node
        /*input.prev.next = input.next;
        input.next.prev = input.prev;*/
    }

    void deleteNodeByValue(int data) {
        if(head == null) return;

        Node newNode = head;
        while(newNode != null && newNode.value != data) {
            newNode = newNode.next;
        }

        // not found
         if(newNode == null) return;
        // single node
        if(head == tail && head == newNode){
            head = tail = null;
        } else if(newNode == head){
            // head has data
            head = head.next;
            head.prev = null;
        } else if(newNode == tail) {
            // tail has data
            tail = tail.prev;
            tail.next = null;
        } else {
            // any node between head and tail has data
            newNode.prev.next = newNode.next;
            newNode.next.prev = newNode.prev;
        }
    }

    Node reviseDoubleLinkedList() {
        if(head == null || head.next == null) return head;
        Node cur = head;
        Node temp = null;
        while (cur != null) {
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;
            cur = cur.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    boolean checkDDLPalindrome(){
        if(head == null || head.next == null) return false;

        Node start = head;
        Node end = tail;

        while(start != null && end != null && start != end && end != start.prev) {
            if(start.value != end.value) {
                return false;
            }

            start = start.next;
            end = end.prev;
        }
        return true;
    }

    // Merge Two Sorted Doubly Linked Lists
    static  Node mergeDDLList(Node l1, Node l2) {
        Node result = new Node(-1); // dummy node
        Node temp = result;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                l1.prev = temp;
                temp.next = l1;
                l1 = l1.next;
            } else {
                l2.prev = temp;
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) {
            l1.prev = temp;
            temp.next = l1;
        }
        if (l2 != null) {
            l2.prev = temp;
            temp.next = l2;
        }

        Node head = result.next;
        if (head != null) head.prev = null; // disconnect dummy node

        return head;
    }

    // Detect and Remove Loop (Advanced)

    Node detectAndRemoveLoop() {
        if(head == null || head.next == null) return head;

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null ) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                removeNode(slow);
            }
        }

        return head;
    }

    private void removeNode(Node slow) {
        Node fast = head;

        while( fast != slow) {
            fast = fast.next;
            slow = slow.next;

        }

        Node part1 = slow;
         while(part1.next != fast){
             part1 = part1.next;
         }

         part1.next = null;
    }


}
