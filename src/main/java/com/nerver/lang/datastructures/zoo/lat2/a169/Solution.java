package com.nerver.lang.datastructures.zoo.lat2.a169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums){
        Map<Integer,Integer> counts = new HashMap<>();


        for (int num:nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }

        Integer main = null;
        Integer cout = null;
        for (int key:counts.keySet()){
            if(main==null&&counts==null){
                main = key;
                cout = counts.get(key);
            }else {
                if(counts.get(key)>cout){
                    main = key;
                    cout = counts.get(key);

                }

            }

        }
        return main;
    }
}
