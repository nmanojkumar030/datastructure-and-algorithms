package gs;

public class Trie {
    TrieNode root;

    public Trie(TrieNode root) {
        this.root = root;
    }

    // Driver
    public static void main(String args[]) {
        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        TrieNode root = new TrieNode();
        Trie trie = new Trie(root);

        // Construct trie
        int i;
        for (i = 0; i < keys.length; i++)
            trie.insert(keys[i]);

        // Search for different keys
        if (trie.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if (trie.search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if (trie.search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if (trie.search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

    }

    void insert(String key) {
        TrieNode currentNode = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (currentNode.trieNodes[index] == null) {
                currentNode.trieNodes[index] = new TrieNode();
            }
            currentNode = currentNode.trieNodes[index];
        }
        currentNode.isEndOfWord = true;
    }

    boolean search(String key) {
        TrieNode currentNode = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (currentNode.trieNodes[index] == null) {
                return false;
            }
            currentNode = currentNode.trieNodes[index];
        }
        return currentNode.isEndOfWord;
    }
}

class TrieNode {
    boolean isEndOfWord = false;
    TrieNode[] trieNodes = new TrieNode[26];

    public TrieNode() {
    }
}
