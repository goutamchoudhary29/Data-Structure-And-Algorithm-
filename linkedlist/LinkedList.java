package linkedlist;

import java.util.function.ToDoubleBiFunction;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // how to add first element in the linkedlist

    public void addFrist(int data) {
        // step1=create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2- newNode next =head
        newNode.next = head;

        // step3- head -- newNode
        head = newNode;
    }

    // how to add in last any data or element in last of linkedlist
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // this is print fuction of linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // In linked list any index to add value in the linkedlist to use add function
    // and add this value in this index
    public void add(int idx, int data) {
        if (idx == 0) {
            addFrist(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i =idx-1;temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove data from first index or head to use removeFirst function to use
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // to remove the last of elemnet or tail in linkedlist to use removeLast
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i= size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // In this question searcj(Iterative)
    // search for a key linkedlist .Return the postion where it is found
    // If not found,retrun -1
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key is not found
        return -1;
    }

    // use recursion function to help to find key in the linkedlist
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // write code to linkedlist in reverse form
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    // delete any element is nth last term
    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;
            return;
        }
        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //

    // slow -fast approach
    public Node findMid(Node head) {// helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1;
            fast = fast.next.next;
        }
        return slow;// slow is my midNode

    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1-fundd mid
        Node midNode = findMid(head);

        // step2 =reverse 2half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;

        // step 3-check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // this code is to check in linkedlist in loop are exist or cycle are existed
    public static boolean isCycle() {// floys's cycle finding
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;// cycle exists

            }
        }
        return false;// cycle doesnit exist
    }

    // any loop or cycle in linkedlist to remove by this code
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find meeting points
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cucle ->last.next =null
        prev.next = null;
    }

    // merge sort sorted with the help of linkedlist
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mide node

    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast =head.next;
        while(fast != null&& fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;      
          }
    
    Node mid =slow;


    //reverse 2nd half
    Node curr = mid.next;
    mid.next =null;
    Node prev=null;
    Node next;

    while(curr !=null){
        next =curr.next;
        curr.next =prev;
        prev =curr;
        curr =next;
    }
    Node left = head;
    Node right =prev;
    Node nextL ,nextR;

    //alt merge -Zig-Zag merge
    while(left !=null&& right!=null){
        nextL =left.next;
        left.next =right;
        nextR =right.next;
        right.next =nextL;

        left =nextL;
        right=nextR;
    }


    }


    public static void main(String args[]) {
        // LinkedList ll = new LinkedList();
        // ll.addFrist(2);
        // ll.addFrist(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // ll.print();
        // // ll.removeFirst();
        // ll.print();

        // // ll.removeLast();
        // ll.print();
        // // System.out.println(ll.size);
        // // System.out.println(ll.itrSearch(5));

        // //System.out.println(ll.recSearch(3));

        // ll.reverse();
        // ll.print();

        // // ll.deleteNthfromEnd(3);
        // ll.print();

        // check cycle or loop in linkedlist
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // //1->2->3
        // System.out.println(isCycle());

        // remove from cycle or loop in linked list
        // head =new Node(1);
        // Node temp =new Node(2);
        // head.next=temp;
        // head.next.next =new Node(3);
        // head.next.next.next =temp;
        // //1->2->3->1
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // merge sort on ll
        // LinkedList ll = new LinkedList();
        // ll.addFrist(1);
        // ll.addFrist(2);
        // ll.addFrist(3);
        // ll.addFrist(4);
        // ll.addFrist(5);
        // // 5->4->3->2->1
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        //for zig zag path in linkedlist
        LinkedList ll =new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5->6
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
