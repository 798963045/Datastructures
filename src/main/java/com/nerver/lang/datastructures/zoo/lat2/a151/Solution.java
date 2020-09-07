package com.nerver.lang.datastructures.zoo.lat2.a151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public String reverseWords(String s){
        s =s.trim();
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ",wordList);
    }
}
