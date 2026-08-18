package datastructures.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    @Test
    public void searchFindsInsertedWord() {
        Trie trie = new Trie(new Trie.TrieNode());
        trie.insert("cat");

        assertTrue(trie.search("cat"));
    }

    @Test
    public void searchReturnsFalseForWordNeverInserted() {
        Trie trie = new Trie(new Trie.TrieNode());
        trie.insert("cat");

        assertFalse(trie.search("dog"));
    }

    @Test
    public void searchReturnsFalseForPrefixThatIsNotItselfAWord() {
        Trie trie = new Trie(new Trie.TrieNode());
        trie.insert("cat");

        assertFalse(trie.search("ca"));
    }

    @Test
    public void searchOnEmptyTrieReturnsFalse() {
        Trie trie = new Trie(new Trie.TrieNode());

        assertFalse(trie.search("cat"));
    }

    @Test
    public void insertingPrefixSeparatelyMakesItSearchable() {
        Trie trie = new Trie(new Trie.TrieNode());
        trie.insert("cat");
        trie.insert("ca");

        assertTrue(trie.search("ca"));
        assertTrue(trie.search("cat"));
    }

    @Test
    public void emptyStringInsertedMakesEmptyStringSearchTrue() {
        Trie trie = new Trie(new Trie.TrieNode());
        trie.insert("");

        assertTrue(trie.search(""));
    }

    @Test
    public void emptyStringSearchOnFreshTrieReturnsFalse() {
        Trie trie = new Trie(new Trie.TrieNode());

        assertFalse(trie.search(""));
    }
}
