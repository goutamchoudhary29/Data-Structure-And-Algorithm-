package Binary_tree;

import java.util.*;

public class BinaryTreeB {
    static class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.rigth = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.rigth = buildTree(nodes);

            return newNode;
        }

        // for preorder print
        // root
        // left subtree
        // right subtree
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.rigth);
        }

        // for inorder print
        // left subtree
        // root
        // rigth subtree
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.rigth);
        }

        // for postorder
        // left subtree
        // right subtree
        // Root
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.rigth);
            System.out.print(root.data + " ");
        }

        // level order traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }

                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.rigth != null) {
                        q.add(currNode.rigth);
                    }
                }

            }
        }

        // count the nodes in the tree
        public static int countOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNodes = countOfNodes(root.left);
            int rightNodes = countOfNodes(root.rigth);

            return leftNodes + rightNodes + 1;
        }

        // find sum of the nodes in the tree
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = sumOfNodes(root.left);
            int rigthSum = sumOfNodes(root.rigth);
            return leftSum + rigthSum + root.data;
        }

        // calculate height of the tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.rigth);

            int myHeight = Math.max(leftHeight, rightHeight) + 1;
            return myHeight;
        }

        // calucate the diameter of the tree
        // approch first time coplextiy is o(n^2)
        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.rigth);
            int diam3 = height(root.left) + height(root.rigth) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));
        }

        // approach second for time complexity is o(n)
        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static TreeInfo diameter2(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.rigth);

            int myHeight = Math.max(left.ht, right.ht) + 1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int mydiam = Math.max(Math.max(diam1, diam2), diam3);

            TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
            return myInfo;
        }

        // To give answers in true or false by subtree are present in your tree
        public static boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                return false;
            }
            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(node.rigth, subRoot.rigth)) {
                return false;
            }
            return true;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.rigth, subRoot);
        }

        public static void topView(Node root) {

        }
    }

    public static void main(String[] args) {
        /*
         * this code is run for tree info and his upper code only
         * // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
         * // BinaryTree tree = new BinaryTree();
         * // Node root = tree.buildTree(nodes);
         * // // System.out.println(root.data);
         * 
         * // // tree.preorder(root);
         * 
         * // // tree.inorder(root);
         * 
         * // // tree.postorder(root);
         * 
         * // // tree.levelOrder(root);
         * 
         * // //System.out.println(tree.countOfNodes(root));
         * 
         * // //System.out.println(tree.sumOfNodes(root));
         * 
         * // // System.out.println(tree.height(root));
         * 
         * // //System.out.println(tree.diameter(root));
         * 
         * // System.out.println(tree.diameter2(root).diam);
         */

        // This for subtree code are input in main function
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.rigth = new Node(3);
        root.left.left = new Node(4);
        root.left.rigth = new Node(5);
        root.rigth.left = new Node(6);
        root.rigth.rigth = new Node(7);

        /*
         * 2
         * / \
         * 4 5
         */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.rigth = new Node(5);
        System.out.println(BinaryTree.isSubtree(root, subRoot));

    }
}