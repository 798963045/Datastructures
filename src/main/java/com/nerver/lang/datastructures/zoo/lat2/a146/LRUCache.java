package com.nerver.lang.datastructures.zoo.lat2.a146;


import java.util.LinkedHashMap;

public class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int capacity;
    public LRUCache(int capacity){
        this.map = new LinkedHashMap<>();
        this.capacity = capacity;
    }
    public int get(int key){
        if(map.containsKey(key)){
            int temp = map.get(key);
            map.remove(key);
            map.put(key,temp);
            return temp;
        }else {
            return -1;
        }
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
        }else {
            map.put(key,value);
            if(map.keySet().size()>capacity){
                map.remove(map.keySet().iterator().next());
            }
        }
    }


}
