package tries;

public class unique_prefix {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;  // end of word
        int freq = 0;         // frequency of prefix

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a word into the Trie
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;  // ✅ increment freq for each character
        }
        curr.eow = true;
    }

    // Function to find and print all unique prefixes
    public static void findPrefixes(Node node, StringBuilder prefix) {
        if (node == null) return;

        // ✅ If frequency is 1, it means this prefix is unique
        if (node.freq == 1) {
            System.out.println(prefix.toString());
            return;
        }

        // Recurse for all non-null children
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                prefix.append((char)(i + 'a'));
                findPrefixes(node.children[i], prefix);
                prefix.deleteCharAt(prefix.length() - 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "zebra", "dog", "duck", "dove" };

        // Insert all words into the trie
        for (String word : words) {
            insert(word);
        }

        // Print all unique prefixes
        System.out.println("Unique Prefixes:");
        findPrefixes(root, new StringBuilder());
    }
}
