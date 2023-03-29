package com.bjpowernode.javase.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/*
* Map集合的遍历
*
* */
public class MapTest02 {
    public static void main(String[] args) {
//        第一种方式：获取所有的key，通过遍历key来遍历value
        Map<Integer,String> map = new HashMap<>();
//        向Map集合中加入键值对
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
//        遍历Map集合
//        获取所有的key，所有的key是一个Set集合
        Set<Integer> setKey = map.keySet();
//        遍历key，通过key获取value
//        迭代器可以
        Iterator<Integer> it = setKey.iterator();
        while (it.hasNext()){
//            取出其中一个key
            Integer key = it.next();
//            通过key获取value
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("============");
//        foreach也可以
        for(Integer key : setKey){
            System.out.println(key + "=" + map.get(key));
        }
        System.out.println("============");

        //第二种方式: Set<Map.Entry<K,V>> entrySet()
        //以上这个方法是把Map集合直接全部转换成Set集合。
        //Set集合中元素的类型是:Map.Entry
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        遍历entries集合，每次取出一个node
//        迭代器遍历
        Iterator<Map.Entry<Integer,String>> it2 = entries.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            //System.out.println(entry);
            System.out.println(key + "=" + value);
        }
        System.out.println("=============");
//        foreach遍历
        //这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值。
        //这种方式比较适合于大数据量。
        for(Map.Entry<Integer,String> node : entries){
            System.out.println(node.getKey() + "-->" + node.getValue());
        }

        Consumer<String> consumer=(x)-> System.out.println(x);
        consumer.accept("Hello Consumer");//结果：Hello Consumer
    }
}
