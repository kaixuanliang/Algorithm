package com.algorithm.linetable;

import java.util.Arrays;

/**
 * 顺序表
 * 底层常用的是数组，但是长度可变
 * java.util.ArrayList 数组长度每次增长50%
 *
 * @Author: LiangKaiXuan
 * @Date: 2019/3/27 10:59
 */
public class ArrayList implements List {
    //底层是一个数组，目前还没有确定长度
    private Object[] elementData;

    //不是数组分配了几个空间，而是元素的个数
    private int size;

    public ArrayList() {
        //没有指定长度，默认长度是4
        this(4);
        //没有指定长度，长度是0
        //elementData = new Object[]{};
    }

    /**
     * @param initialCapacity 数组的初始长度
     */
    public ArrayList(int initialCapacity) {
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //指定顺序表的元素个数，元素是0
        //size = 0；
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i < 0 || i >= size) {
            //throw  new RuntimeException("数组索引越界异常："+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常：" + i);
        }
        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        boolean flag = false;
        for (int i=0;i<size;i++){
            if (elementData[i].equals(e)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public int indexOf(Object e) {
        int count = 0;
        for (int i=0;i<size;i++){
            count++;
            if (elementData[i].equals(e)) {
                break;
            }
        }
        return count;
    }

    @Override
    public void add(int i, Object e) {
        if (i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常"+i);
        }
        //数组满了就扩容
        if (size == elementData.length) {
            grow();
        }
        //从最后开始移动元素
        for (int j=size ;j>i;j--){
            elementData[j] = elementData[j-1];
        }
        elementData[i] = e;
        size++;
    }

    @Override
    public void add(Object e) {
        this.add(size,e);
        /*//数组满了就扩容
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;*/
    }

    void grow() {
        /* //创建一个新的数组，长度是旧的数组的两倍
            Object [] newArr = new Object[elementData.length*2];
            //将旧数组的数据拷贝到新数组
            for (int i=0;i<size;i++){
                newArr[i] = elementData[i];
            }
            //让elementData指向显得数组
            elementData = newArr;*/
        elementData = Arrays.copyOf(elementData, elementData.length * 2);
    }

    @Override
    public Object remove(int i) {
        if (i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常"+i);
        }
        for (int j=i;j<size;j++){
            elementData[j] = elementData[j+1];
        }
        return elementData;
    }

    @Override
    public boolean remove(Object e) {
        boolean flag = false;
        for (int i=0;i<size;i++){
            if (elementData[i].equals(e)){
                for (int j=i;j<size;j++){
                    elementData[j] = elementData[j+1];
                }
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public Object replace(int i, Object e) {
        if (i < 0 || i > size){
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常"+i);
        }
        elementData[i] = e;
        return elementData;
    }

    @Override
    public String toString() {
        if (size==0){
            return "[]";
        }else{
            StringBuilder stringBuilder = new StringBuilder("[");
            for (int i=0;i<size;i++){
                if (i != size-1){
                    stringBuilder.append(elementData[i]+",");
                }else{
                    stringBuilder.append(elementData[i]);
                }
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

    }
}
