package com.example.demodatastructure.tree;

import com.example.demodatastructure.linkendList.Node;

import java.util.Scanner;

public class CreateTree {
    public static void main(String[] args) {
        Node node = buildTree();
        if(node != null) {
            System.out.println(node.value);
            System.out.println(node.left.value);
            System.out.println(node.right.value);
        }
    }

    static  void inorderTraversal(Node root) {
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.value);
        inorderTraversal(root.right);
    }
    static Node buildTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data .....");
        int data = sc.nextInt();
        if(data == -1) return null;

        Node root = new Node(data);

        System.out.println("Enter left node data for Node  " + data);
        root.right  = buildTree();

        System.out.println("Enter right node data for Node  " + data);
        root.left  = buildTree();

        return root;
    }
}
