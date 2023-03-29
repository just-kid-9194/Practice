package com.bjpowernode.javase.collection.danLink;
/*
* 链表
* */
public class Link {

//    头结点，默认值为空
    private Node header;

    private int size = 0;

    public int getSize(){
        return size;
    }

//    向链表中添加元素的方法
    public void add(Object o){
//        创建一个新的节点对象
//        让之前单链表的末尾节点next指向新节点对象。
//        有可能这个元素是第一个，也可能是第二个，也可能是第三个。
        if(header == null){
            header = new Node(o,null);
        }else{
//            说明头结点不为空
            //找出当前链表的末尾节点，让当前末尾节点的next是新节点
            Node currenLastNode = findLast(header);
            currenLastNode.next = new Node(o,null);
        }
        size++;
    }

    /**
     * 专门查找末尾节点的方法
     * @return 当前末尾节点
     */
    private Node findLast(Node node) {
        if (node.next == null){
            return node;
        }
        return findLast(node.next);
    }


    //    删除链表中元素的方法
    public void remove(Object o){
        Node node = new Node(o,null);
//        如果要删除的元素是头结点，直接让next节点成为新的头结点
        if(header.equals(node)){
            header = header.next;
        } else{
//        不是头结点，则要找到要删除的节点和上一个节点，将上一节点的next修改为删除节点的next
            Node linkNode = header;
            Node previousNode = findPrevious(linkNode,node);
            linkNode.next = linkNode.next.next;
        }
        size--;
    }

    /**
     * 专门查找目标节点的前一节点的方法
     * @param node
     * @return
     */
    private Node findPrevious(Node linkNode,Node node) {
        if(node.equals(linkNode.next)){
            return linkNode;
        }
        return findPrevious(linkNode.next,node);
    }

    //    修改链表中元素的方法
    public void modify(Object o){

    }

//    查找链表中某元素的方法
    public int find(Object o){
        return 1;
    }
}
