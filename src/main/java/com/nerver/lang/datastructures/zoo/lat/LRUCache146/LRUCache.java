package com.nerver.lang.datastructures.zoo.lat.LRUCache146;

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

    public void put(int key ,int value){
        //更新操作
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
        }else {
            //插入
            map.put(key,value);
            if(map.keySet().size()>capacity){
                map.remove(map.keySet().iterator().next());
            }
        }
    }

    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);

        System.out.printf("");
    }

}
