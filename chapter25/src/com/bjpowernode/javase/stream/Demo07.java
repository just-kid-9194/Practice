package com.bjpowernode.javase.stream;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("周润发");
        list.add("成龙");
        list.add("刘德华");
        list.add("吴京");
        list.add("周星驰");
        list.add("李连杰");

        Set<Integer> set = new HashSet<>();
        set.add(26);
        set.add(54);
        set.add(6);
        set.add(98);
        set.add(451);
        set.add(-12);

        Stream stream1 = Stream.concat(list.stream(), set.stream());
        List collect = (List) stream1.collect(Collectors.toList());
        System.out.println(collect);
        for (Object o : collect) {
            System.out.println(o);
        }
    }
}
