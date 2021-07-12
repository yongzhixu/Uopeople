package edu.uopeople.cs3303datastructures.unit4BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;

public class TraversalWithoutRecursion {
    // non-recursive java program for inorder traversal

    /* Class containing left and right child of
    current node and key value*/
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    /* Class to print the inorder traversal */
    class BinaryTree {
        Node root;

        void insert(int element) {
            this.root = insertInternal(root, element);
        }

        Node insertInternal(Node node, int element) {
            if (node == null) {
                node = new Node(element);
            }

            if (node.data < element) {
                node.right = insertInternal(node.right, element);
            } else if (node.data > element) {
                node.left = insertInternal(node.left, element);
            }
            return node;
        }


        void preorder(){
            preorderInternal(root);
        }
        void preorderInternal(Node node) {
            if (node == null)
                return;
            System.out.print(node.data + " ");
            preorderInternal(node.left);
            preorderInternal(node.right);
        }


        void inorder() {
            System.out.println("");
            if (root == null)
                return;

            Stack<Node> s = new Stack<Node>();
            Node curr = root;

            // traverse the tree
            while (curr != null || s.size() > 0) {

			/* Reach the left most Node of the
			curr Node */
                while (curr != null) {
				/* place pointer to a tree node on
				the stack before traversing
				the node's left subtree */
                    s.push(curr);
                    curr = curr.left;
                }

                /* Current must be NULL at this point */
                curr = s.pop();

                System.out.print(curr.data + " ");

			/* we have visited the node and its
			left subtree. Now, it's right
			subtree's turn */
                curr = curr.right;
            }
        }

        void printLevelOrder() {
            System.out.println("");
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while (!queue.isEmpty()) {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/
            util/linkedlist_poll.htm */
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");

                /*Enqueue left child */
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                /*Enqueue right child */
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
        }
    }

    public TraversalWithoutRecursion() {
        Scanner std = new Scanner(System.in);

        BinaryTree binaryTree = new BinaryTree();
        System.out.println("please enter a length for Binary Tree, (suppose to be bigger than zero)");
        int num = std.nextInt();
        while (num <= 0) {
            System.out.println("please enter a number bigger than zero");
            num = std.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.println(String.format("please enter the %dth number for Binary Tree", i + 1));
            int element = std.nextInt();
            binaryTree.insert(element);
        }
        System.out.println("inorder");
        binaryTree.inorder();
        System.out.println("");
        System.out.println("preorder");
        binaryTree.preorder();
        System.out.println("");
        System.out.println("printLevelOrder");
        binaryTree.printLevelOrder();
        System.out.println("");
        /* creating a binary tree and entering
        the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(17);
        tree.root.right.right = new Node(15);
        tree.inorder();
        System.out.println("");
        tree.preorder();
        tree.printLevelOrder();
    }

    public static void main(String args[]) {
        new TraversalWithoutRecursion();
    }

}
