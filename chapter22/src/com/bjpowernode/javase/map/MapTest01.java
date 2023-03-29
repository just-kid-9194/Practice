package com.bjpowernode.javase.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/*
* java.util.Map接口中常用的方法:
*   1、Map和coLlection没有继承关系。
*   2、Map集合以key和value的方式存储数据:键值对
*       key和value都是引用数据类型。
*       key和value都是存储对象的内存地址。
*       key起到主导的地位，value是key的一个附属品。
*   3、Map接口中常用方法:
*       V put(K key,V value)                向Map集合中添加键值对
*       V get(Object key)                   通过key获取value
*       void clear()                        清空Map集合
*       booLean containsKey(object key)     判断Map中是否包含某个key
*       boolean containsValue(object value) 判断Map中是否包含某个value
*       boolean isEmpty()                   判断Map集合中元素个数是否为0
*       Set<K> keySet()                     获取Map集合所有的key
*       V remove(Object key)                通过key删除键值对
*       int size()                          获取集合中键值对的个数
*       collection<V> values()              获取Map集合中的所有value，返回一个collection
*       Set<Map.Entry<K ,V>> entrySet()
*           将Map集合转换成Set集合。
*           假设现在有一个Map集合，如下所示:
*           map1集合对象
*           Map map1 = new Map();
*           key         value
*           -----------------
*           1           zhangsan
*           2           lisi
*           3           wangwu
*           4           zhaoliu
*
*           Set set = map1.entrySet();
*           Set集合对象
*           1=zhangsan     【注意:Map集合通过entrySet()方法转换成的这个set集合,set集合中元素的类型是Map.Entry<K,V>】
*           2=lisi          【Map.Entry,和String一样，都是一种类型的名字，只不过:Map.Entry是静态内部类，是Map中的静态内部类】
*           3=wangwu
*           4=zhaoliu
* */
public class MapTest01 {
    public static void main(String[] args) {
//        创建Map集合对象
        Map<Integer,String> map = new HashMap<>();

//        向Map集合中加入键值对
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");

//        通过key获取Value
        String value = map.get(2);
        System.out.println(value);  // 李四

//        获取键值对的数量
        System.out.println(map.size()); // 4

//        通过key删除键值对
        map.remove(2);
        System.out.println(map.size()); // 3

//        判断是否包含某个key
//        contains方法底层调用的都是equals进行比对的，所以自定义的类型需要重写equals方法。
        System.out.println(map.containsKey(2)); //false

//        判断是否包含某个value
        System.out.println(map.containsValue("张三"));    // true

//        获取所有的value
        /*张三
          王五
          赵六*/
        Collection<String> coValues = map.values();
        for(String s : coValues){
            System.out.println(s);
        }

//        清空集合
        map.clear();
        System.out.println(map.size()); // 0

//        判断集合是否为空
        System.out.println(map.isEmpty());  // true
    }



}

