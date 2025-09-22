package tries;

public class tries_implement {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false; // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert word into trie
    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
   

    // Search for a word in the trie
    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static void main(String[] args) {
        // String words[] = { "the", "a", "there", "their", "any", "there" };

        // // Insert words into trie
        // for (String word : words) {
        //     insert(word);
        // }

        // // Search test cases
        // System.out.println(search("the"));    // true
        // System.out.println(search("these"));  // false
        // System.out.println(search("their"));  // true
        // System.out.println(search("any"));    // true
        // System.out.println(search("th"));     // false

        String arr[] ={"i" ,"like","sam","samsung","mobile","ice"};
        for(int i=0; i<arr.length;i++){
            insert(arr[i]);
        }
        String key ="ilikesamsung";
    }
}
