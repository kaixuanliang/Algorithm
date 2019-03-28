package com.algorithm.linetable;

/**
 * @Author: LiangKaiXuan
 * @Date: 2019/3/27 17:23
 */
public class SingleLinkedList implements List{
    //头结点，不存储数据为了编程方便
    private Node head = new Node();

    //结点个数
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        //和顺序表不同，不能通过缩影直接计算定位，需要从头结点开始查找
        Node p = head;
        /*p.setNext(head.getNext());
        p.setData(head.getData());*/
        for (int j=0;j<=i;j++){
            p = p.getNext();
            //p.setData(p.getData());
            //System.out.println("1213121   "+p.getData());
        }
        return p.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        if (i < 0 || i >size){
            throw  new MyArrayIndexOutOfBoundsException("数组指针越界异常");
        }
        //找到前一个结点，从头结点head开始查找
        Node p = head;
        for (int j=0;j<i;j++){
            p = p.getNext();
        }

        //新创建一个结点
        Node newNode = new Node();
        newNode.setData(e);
        //System.out.println("测试"+newNode.getData());


        //指明新结点的直接后继结点
        newNode.setNext(p.getNext());

        //指明新结点的直接前驱结点
        p.setNext(newNode);
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }

    @Override
    public String toString() {

        if (size==0){
            return "[]";
        }else{
            StringBuilder stringBuilder = new StringBuilder("[");
            Node p = head;
            for (int i=0;i<size;i++){
                if (i != size-1){
                    stringBuilder.append(p.getData()+",");
                    System.out.println(stringBuilder);
                }else{
                    stringBuilder.append(p.getData());
                }
                //移动指针到下一个结点
                p = p.getNext();
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}
