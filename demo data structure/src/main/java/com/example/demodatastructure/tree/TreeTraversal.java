package com.example.demodatastructure.tree;

import com.example.demodatastructure.linkendList.Node;

import java.util.*;

class Pair {
    public int hd;
    public Node node;
    public Pair(int key, Node node) {
        this.hd = key;
        this.node = node;
    }
}
public class TreeTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(25);

        // inOrderTraversal(root); // LNR(left node right)
        System.out.println(" ------------------------------------------ ");

        // preOrderTraversal(root); // NLR
        System.out.println(" ------------------------------------------ ");

        // postOrderTraversal(root); // LRN
        System.out.println(" ------------------------------------------ ");

        heightOfTree(root);

        // findTreeSize(root);
        // System.out.println(findTreeSize(root));

        /*-----------------------------------------------------------------*/
        //System.out.println(findMaxValueFromTree(root));

        /*-----------------------------------------------------------------*/
        Map<Integer, Integer> map = new HashMap<>();
        //printLeftView(root, 0, map);
        // map.forEach((key, value) -> System.out.println(value));

        /*-----------------------------------------------------------------*/
        Map<Integer, Integer> map1 = new TreeMap<>();
        printTopView(root, map1);
        map1.forEach((key, value) -> System.out.println(value));
    }

    static  void printTopView(Node node, Map<Integer, Integer> map) {
        Queue<Pair> arr = new LinkedList<>();

        arr.add(new Pair(0,node));

        while(!arr.isEmpty()) {
            Pair cur = arr.poll();
            int key = cur.hd;
            Node nodeList = cur.node;

            if(!map.containsKey(key)) {
                map.put(key, nodeList.value);
            }

            if(nodeList.left != null) {
                arr.add(new Pair(key - 1, nodeList.left));
            }

            if(nodeList.right != null) {
                arr.add(new Pair(key + 1, nodeList.right));
            }
        }

    }

    static void printLeftView(Node node, int level,Map<Integer, Integer> map ) {
        if(node == null) return;

        if(!map.containsKey(level)) {
            map.put(level, node.value);
        }
        printLeftView(node.right, level+1, map);
        printLeftView(node.left, level+1, map);

    }

    static  int findMaxValueFromTree(Node node) {
        if(node == null ) return Integer.MIN_VALUE;

        int l1 = findMaxValueFromTree(node.left);
        int r1 = findMaxValueFromTree(node.right);
        return Math.max(node.value, Math.max(l1, r1));

    }

    static int findTreeSize(Node node) {
        if(node == null) return  0;

        return findTreeSize(node.left) + findTreeSize(node.right) + 1;
    }
    static int heightOfTree(Node node) {
        if(node == null) return 0;

        int l1 = heightOfTree(node.left);
        int l2 = heightOfTree(node.right);
        int max = Math.max(l1, l2) + 1;
       //  System.out.println(max);
        return max;
    }
    static void postOrderTraversal(Node root) {
        System.out.println(root.value);
        postOrderTraversal(root.left);

    }
    static void preOrderTraversal(Node root) {
        if(root == null) return;
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    static  void inOrderTraversal(Node root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }
}
