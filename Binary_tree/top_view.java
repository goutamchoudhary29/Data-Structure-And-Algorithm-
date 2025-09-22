//this code is for find the top view of the binary tree
//use Hasmap (key,value),in this hasp map the key is unique not change 
//also use hortizontal distance of tree by root x and root.left =x-1 ,also root right=x+1
package Binary_tree;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class top_view {
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

    public static void topView(Node root) {
        // LevelOrder
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while ((!q.isEmpty())) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {// first time my hd is occurring
                    map.put(curr.hd, curr.node);

                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.rigth != null) {
                    q.add(new Info(curr.node.rigth, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

            }

        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    // check kth level of binary tree
    public static void KLevel(Node root , int level, int k){
        if( root ==null){
            return ;
        }
        if(level== k){
            System.out.print(root.data+" ");
            return; 
        }
        KLevel(root.left, level+1, k);
        KLevel(root.rigth, level+1, k);
    }
    //lowest common Ancestor
    //approach1
    public static boolean getPath(Node root ,int n,ArrayList<Node>path){
        if(root ==null){
            return false;
        }
        path.add(root);
        if(root.data ==n){
            return true;
        }
        boolean foundLeft =getPath(root.left, n, path);
        boolean foundRight =getPath(root.rigth, n, path);

        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root,int n1,int n2){
        ArrayList<Node>path1 =new ArrayList<>();
        ArrayList<Node>path2 =new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //last common ancestor
        int i=0;
        for(; i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //last equal node -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }
    //second approch to solve last common ancestor
    public static Node lca2(Node root ,int n1,int n2){
        if(root ==null||root.data==n1||root.data ==n2){
            return root;
        }
        Node leftLca =lca2(root.left, n1, n2);
        Node rigthLca =lca2(root.rigth, n1, n2);

        //leftLCA ==val rightLca =null
        if(rigthLca ==null){
            return leftLca;
        }
        if(leftLca ==null){
            return rigthLca;
        }
        return root;
}    
//find last common ancestor distance
public static int lcaDist(Node root ,int n){
    if(root ==null){
        return -1;
    }
    if(root.data ==n){
        return 0;
    }
    int leftDist =lcaDist(root.left,n);
    int rigthDist =lcaDist(root.rigth, n);

    if(leftDist == -1&& rigthDist ==-1){
        return -1;
    }else if(leftDist==-1){
        return rigthDist+1;
    }else{
        return leftDist+1;
    }
}
//find minim distance
public static int minDist(Node root ,int n1 ,int n2){
    Node lca =lca2(root, n1, n2);
    int dist1=lcaDist(lca ,n1);
    int dist2=lcaDist(root, n2);

    return dist1+dist2;
}
//K Ancestor 
public static int KAncestor(Node root ,int n ,int k){
    if(root ==null){
        return -1;
    }
    if(root.data ==n){
        return 0;
    }
    int leftDist =KAncestor(root.left,n,k);
    int rightDist =KAncestor(root.rigth,n,k);

    if(leftDist ==-1&&rightDist==-1){
        return -1;
    }
    int max =Math.max(leftDist,rightDist);
    if(max+1 ==k){
        System.out.println(root.data);
    }
    return max+1;
}
    public static void main(String[] args) {
        // this code is for find the top view of the binary tree
        // use Hasmap (key,value),in this hasp map the key is unique not change
        // also use hortizontal distance of tree by root x and root.left =x-1 ,also root
        // right=x+1
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
        //topView(root);

       // int k =3;
        //KLevel(root, 1, k);
        

       // int n1=4 ,n2 =6;
       // System.out.println(lca2(root ,n1,n2).data);

     //  System.out.println(minDist(root, n1, n2));

     int n=5 ,k=1;
     KAncestor(root, n,k);
    }
}
