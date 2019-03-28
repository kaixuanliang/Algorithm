package com.algorithm.linetable;

/**
 * 单链表的结点
 * @Author: LiangKaiXuan
 * @Date: 2019/3/27 17:11
 */
public class Node {
    //要存储的数据
    private Object data;

    //指针
    private Node next;

    public Node() {

    }

    public Node(Object data) {
        super();
        this.data = data;
    }

    public Node(Object data,Node next) {
        super();
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
