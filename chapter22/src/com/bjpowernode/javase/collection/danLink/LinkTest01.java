package com.bjpowernode.javase.collection.danLink;
/*
* 链表优点:随机增删元素效率较高。(因为增删元素不涉及到大呈元素位移)
* 链表缺点∶查询效率较低，每一次查找某个元素的时候都需要从头节点开始往下遍历。
* */
public class LinkTest01 {
    public static void main(String[] args) {
//        创建链表对象
        Link link = new Link();
//        向链表中添加元素
        link.add(100);
        link.add(200);
        link.add(300);

        System.out.println(link.getSize());

        link.remove(100);

        System.out.println(link.getSize());

        Node node1 = new Node(100,null);
        Node node2 = new Node(100,new Node());
        System.out.println(node1.equals(node2));

    }
}
