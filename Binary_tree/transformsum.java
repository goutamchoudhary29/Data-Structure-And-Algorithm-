package Binary_tree;

public class transformsum {

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

        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }
            int leftChild = transform(root.left);
            int rightChild = transform(root.rigth);

            int data = root.data;

            int newLeft =root.left ==null ? 0:root.left.data;
            int newRight =root.rigth ==null?0:root.rigth.data;

            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.rigth);
        }

        public static void main(String[] args) {
            /*
             * 1
             * / \
             * 2 3
             * / \ / \
             * 4 5 6 7
             *
             * expected sum tree is:
             * 27
             * / \
             * 9 13
             * / \ / \
             * 0 0 0 0
             */
            Node root = new Node(1);
            root.left = new Node(2);
            root.rigth = new Node(3);
            root.left.rigth = new Node(5);
            root.left.left = new Node(4);
            root.rigth.left = new Node(6);
            root.rigth.rigth = new Node(7);

            transform(root);
            preorder(root);

        }
    }

