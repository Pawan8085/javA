package javA.Trie;

public class Trie {
    // Trie data structure implementention

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {

        TrieNode node = root;

        for(int i=0; i<word.length(); ++i){
            char c = word.charAt(i);

            if(node.childern[c-'a']==null){
                node.childern[c-'a'] = new TrieNode();
            }

            node =  node.childern[c-'a'];
        }

        node.isEnd = true;
        
    }
    
    public boolean search(String word) {
         TrieNode node = root;

         for(int i=0; i<word.length(); ++i){
            char c = word.charAt(i);

            if(node.childern[c-'a']==null){
                return false;
            }

            node =  node.childern[c-'a'];
        }

        return node.isEnd;

    }
    
    public boolean startsWith(String prefix) {
         TrieNode node = root;

         for(int i=0; i<prefix.length(); ++i){
            char c = prefix.charAt(i);

            if(node.childern[c-'a']==null){
                return false;
            }

            node =  node.childern[c-'a'];
        }

        return true;
    }

    class TrieNode{
    
        TrieNode[] childern = new TrieNode[26];
        boolean isEnd = false;
    }
}
