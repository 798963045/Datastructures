package com.nerver.lang.datastructures.gk.ImplementTriePrefixTree208;

import com.nerver.lang.datastructures.gk.common.TreeNode;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    /**
     * time comleixty o(m)
     * space complexity o(m)
     * @param word
     */
    public void insert(String word){
        TrieNode node = root;
        for (int i=0;i<word.length();i++){
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)){
                node.put(currentChar,new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for (int i =0;i<word.length();i++){
            char curLetter = word.charAt(i);
            if(node.containsKey(curLetter)){
                node.get(curLetter);
            }else {
                return null;
            }
        }
        return node;
    }

    /**
     * time complexity o(m)
     * space complexity o(1)
     * @param word
     * @return
     */
    public boolean search(String word){
        TrieNode node = searchPrefix(word);
        return node!=null&&node.isEnd();
    }

    /**
     * time complexity o(m)
     * space complexity o(1)
     * @param prefix
     * @return
     */
    public boolean startWith(String prefix){
        TrieNode node = searchPrefix(prefix);
        return node!=null;
    }
}
