package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
//        创建用户对象
        User user1 = new User("jack");
        User user2 = new User("jack");

        c.add(user1);
//        没有重写equals之前，contains方法返回的是false
        System.out.println(c.contains(user2));
    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
