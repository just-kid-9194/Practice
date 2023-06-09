package com.bjpowernode.javase.collection.danLink;

import java.util.Objects;

/*
* 单链表中的节点
* 节点是单向链表中基本的单元。
* 每一个节点Node都有两个属性:
*   一个属性:是存储的数据。
*   另一个属性:是下一个节点的内存地址。
* */
public class Node {
//    存储的数据
    Object element;

//    下一个节点的内存地址
    Node next;

    public Node() {
    }

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(element, node.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
