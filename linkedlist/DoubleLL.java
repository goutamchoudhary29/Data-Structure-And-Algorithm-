package linkedlist;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data =data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add in doubly linkedlist
    public void addFirst(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head =tail =newNode;
            return;
        }
        newNode.next =head;
        head.prev =newNode;
        head =newNode;
    }
    //add in last by doubly linkedlist
    public void addLast(int data){
        Node newNode= new Node(data);
        size ++;
        if(head==null){
            head =tail =newNode;
            return;
        }
        tail.next =newNode;
        tail.prev =newNode;
        tail =newNode;
    }

    //print
    public void print(){
        Node temp =head;

        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //remove from first element 
    public int removeFirst(){
        if(head == null){
            System.out.println("Dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }

        int val =head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    //remove from the  last element
    public  int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if( size ==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev =head;
        for(int i = 0;i<size-2;i++){
            prev =prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size --;
        return val;

    }
    // Reverse the doubly linkedlist
    public void reverse(){
        Node curr =head;
        Node prev =null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            curr.prev =next;

            prev =curr;
            curr=next;

        }
        head =prev;
    }

    public static void main(String[] args) {
        DoubleLL dll =new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

       dll.print();
    System.out.println(dll.size);


     //   dll.removeFirst();
      //  dll.print();
     //   System.out.println(size);
        
     //   dll.removeLast();
      //  dll.print();
      //  System.out.println(size);

      //reverse
      dll.reverse();
      dll.print();
    }

}
